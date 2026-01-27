package com.petroline.bffagendadortarefas.infrastructure.client;

import com.petroline.bffagendadortarefas.business.dto.in.EnderecoDTORequest;
import com.petroline.bffagendadortarefas.business.dto.in.LoginRequestDTO;
import com.petroline.bffagendadortarefas.business.dto.in.TelefoneDTORequest;
import com.petroline.bffagendadortarefas.business.dto.in.UsuarioDTORequest;
import com.petroline.bffagendadortarefas.business.dto.out.EnderecoDTOResponse;
import com.petroline.bffagendadortarefas.business.dto.out.TarefasDTOResponse;
import com.petroline.bffagendadortarefas.business.dto.out.TelefoneDTOResponse;
import com.petroline.bffagendadortarefas.business.dto.out.UsuarioDTOResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name ="notificacao", url = "${notificacao.url}")
public interface EmailClient {

    void enviarEmail(@RequestBody TarefasDTOResponse dto);

}
