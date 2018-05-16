<<<<<<< HEAD
package com.github.viniciussoaresti.infraestrutura.repositorios.comportamentos;
import java.util.List;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author corona
 */
public interface RepositorioGenerico <T, G> {
    public void inserir(T t);
    public void alterar (T t);
    public T recuperar (G codigo);
    public void deletar (T t);
    public List<T> recuperarTodos();
    
    
    
    
}
=======
package com.github.viniciussoaresti.infraestrutura.repositorios.comportamentos;
import java.util.List;
/*MIT License

Copyright (c) 2018 - SysGraph - Vinícius H., Matheus Dionísio, Pedro Barros and Tiago Eduardo
Permission is hereby granted, free of charge, to any person obtaining a copy of this software
and associated documentation files (the "Software"), to deal in the Software without restriction,
including without limitation the rights to use, copy, modify, merge, publish, distribute,
sublicense, and/or sell copies of the Software, and to permit persons to whom the Software
is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies
or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN
AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH
THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
/**
 *
 * @author Vinícius Soares
 */
public interface RepositorioGenerico <T, G> {
    public void inserir(T t);
    public void alterar (T t);
    public T recuperar (G codigo);
    public void deletar (T t);
    public List<T> recuperarTodos();
}
>>>>>>> f963947e80d863396319c69a64f136d4c27add2e
