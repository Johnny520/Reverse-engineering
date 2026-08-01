.class public final Lcom/bumptech/glide/Registry$NoImageHeaderParserException;
.super Lcom/bumptech/glide/Registry$MissingComponentException;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "Failed to find image header parser."

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/bumptech/glide/Registry$MissingComponentException;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
