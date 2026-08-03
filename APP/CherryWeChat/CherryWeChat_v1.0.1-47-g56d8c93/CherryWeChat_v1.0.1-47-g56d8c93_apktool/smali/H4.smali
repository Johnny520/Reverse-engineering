.class public final LH4;
.super Ljava/util/AbstractSet;
.source ""


# instance fields
.field public final synthetic a:LM4;


# direct methods
.method public constructor <init>(LM4;)V
    .locals 0

    iput-object p1, p0, LH4;->a:LM4;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, LK4;

    iget-object v1, p0, LH4;->a:LM4;

    invoke-direct {v0, v1}, LK4;-><init>(LM4;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, LH4;->a:LM4;

    iget v0, v0, Lsy;->c:I

    return v0
.end method
