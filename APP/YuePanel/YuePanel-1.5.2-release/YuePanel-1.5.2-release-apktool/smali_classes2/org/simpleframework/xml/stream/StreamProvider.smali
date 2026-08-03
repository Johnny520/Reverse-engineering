.class Lorg/simpleframework/xml/stream/StreamProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/simpleframework/xml/stream/Provider;


# instance fields
.field private final factory:LYue/ۥۢۦۡۧ;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LYue/ۥۢۦۡۧ;->ۥ۟۟۠ۤ()LYue/ۥۢۦۡۧ;

    move-result-object v0

    iput-object v0, p0, Lorg/simpleframework/xml/stream/StreamProvider;->factory:LYue/ۥۢۦۡۧ;

    return-void
.end method

.method private provide(LYue/ۥۢۦۣۡ;)Lorg/simpleframework/xml/stream/EventReader;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 3
    new-instance v0, Lorg/simpleframework/xml/stream/StreamReader;

    invoke-direct {v0, p1}, Lorg/simpleframework/xml/stream/StreamReader;-><init>(LYue/ۥۢۦۣۡ;)V

    return-object v0
.end method


# virtual methods
.method public provide(Ljava/io/InputStream;)Lorg/simpleframework/xml/stream/EventReader;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/simpleframework/xml/stream/StreamProvider;->factory:LYue/ۥۢۦۡۧ;

    invoke-virtual {v0, p1}, LYue/ۥۢۦۡۧ;->ۥ۟۟۟(Ljava/io/InputStream;)LYue/ۥۢۦۣۡ;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/simpleframework/xml/stream/StreamProvider;->provide(LYue/ۥۢۦۣۡ;)Lorg/simpleframework/xml/stream/EventReader;

    move-result-object p1

    return-object p1
.end method

.method public provide(Ljava/io/Reader;)Lorg/simpleframework/xml/stream/EventReader;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lorg/simpleframework/xml/stream/StreamProvider;->factory:LYue/ۥۢۦۡۧ;

    invoke-virtual {v0, p1}, LYue/ۥۢۦۡۧ;->ۥ۟۟۟۠(Ljava/io/Reader;)LYue/ۥۢۦۣۡ;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/simpleframework/xml/stream/StreamProvider;->provide(LYue/ۥۢۦۣۡ;)Lorg/simpleframework/xml/stream/EventReader;

    move-result-object p1

    return-object p1
.end method
