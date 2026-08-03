.class public final Lql;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lwj;


# instance fields
.field public final synthetic a:LQm;


# direct methods
.method public constructor <init>(LQm;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lql;->a:LQm;

    return-void
.end method


# virtual methods
.method public final childSerializers()[LQm;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [LQm;

    const/4 v1, 0x0

    iget-object v2, p0, Lql;->a:LQm;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public final deserialize(LJc;)Ljava/lang/Object;
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "unsupported"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getDescriptor()LCx;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unsupported"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "unsupported"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final typeParametersSerializers()[LQm;
    .locals 1

    sget-object v0, LGu;->i:[LQm;

    return-object v0
.end method
