.class public final Lcom/google/protobuf/RpcUtil$AlreadyCalledException;
.super Ljava/lang/RuntimeException;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field private static final serialVersionUID:J = 0x4be86cb6ba5b1c4aL


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "This RpcCallback was already called and cannot be called multiple times."

    .line 2
    .line 3
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
