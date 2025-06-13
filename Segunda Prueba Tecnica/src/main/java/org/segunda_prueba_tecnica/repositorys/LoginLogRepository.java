package org.segunda_prueba_tecnica.repositorys;

import org.segunda_prueba_tecnica.models.LoginLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginLogRepository extends JpaRepository<LoginLog,Long> {
}
