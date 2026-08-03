.class public interface abstract Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler$UrlDefinitionAction$Dispatcher;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler$UrlDefinitionAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Dispatcher"
.end annotation

.annotation runtime Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;
    value = "java.net.URL"
.end annotation


# virtual methods
.method public abstract make(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/net/URLStreamHandler;)Ljava/net/URL;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$IsConstructor;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;
        value = "make"
    .end annotation
.end method

.method public abstract of(Ljava/net/URI;Ljava/net/URLStreamHandler;)Ljava/net/URL;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Defaults;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$IsStatic;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;
        value = "of"
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method
