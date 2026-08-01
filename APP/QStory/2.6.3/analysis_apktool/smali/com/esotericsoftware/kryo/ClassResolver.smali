.class public interface abstract Lcom/esotericsoftware/kryo/ClassResolver;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# virtual methods
.method public abstract getRegistration(I)Lcom/esotericsoftware/kryo/Registration;
.end method

.method public abstract getRegistration(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;
.end method

.method public abstract readClass(Lcom/esotericsoftware/kryo/io/Input;)Lcom/esotericsoftware/kryo/Registration;
.end method

.method public abstract register(Lcom/esotericsoftware/kryo/Registration;)Lcom/esotericsoftware/kryo/Registration;
.end method

.method public abstract registerImplicit(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;
.end method

.method public abstract reset()V
.end method

.method public abstract setKryo(Lcom/esotericsoftware/kryo/Kryo;)V
.end method

.method public abstract unregister(I)Lcom/esotericsoftware/kryo/Registration;
.end method

.method public abstract writeClass(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;
.end method
