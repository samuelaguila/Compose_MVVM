package com.saam.composemvvmapp.util

interface DomainMapper<Entity, DomainModel> {

    fun mapFromEntityToModel(entity: Entity): DomainModel

    fun mapFromModelToEntity(recipe: DomainModel): Entity
}