.class public LYue/ۥۢۢۢۨ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۡ۠ۧ;
.implements LYue/ۥۣۢ۠۠;


# instance fields
.field public ۥ:[Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x14

    new-array v0, v0, [Z

    iput-object v0, p0, LYue/ۥۢۢۢۨ;->ۥ:[Z

    return-void
.end method


# virtual methods
.method public ۥ(LYue/ۥۢۦۢۤ;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢۢۨ;->ۥ:[Z

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->ۥ۟۟۠()I

    move-result p1

    aget-boolean p1, v0, p1

    return p1
.end method

.method public ۥ۟(LYue/ۥۢۦ۠ۨ;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢۢۨ;->ۥ:[Z

    invoke-interface {p1}, LYue/ۥۢۦ۠ۨ;->ۥ۟۟۠()I

    move-result p1

    aget-boolean p1, v0, p1

    return p1
.end method

.method public ۥ۟۟(I)V
    .locals 2

    iget-object v0, p0, LYue/ۥۢۢۢۨ;->ۥ:[Z

    const/4 v1, 0x1

    aput-boolean v1, v0, p1

    return-void
.end method
