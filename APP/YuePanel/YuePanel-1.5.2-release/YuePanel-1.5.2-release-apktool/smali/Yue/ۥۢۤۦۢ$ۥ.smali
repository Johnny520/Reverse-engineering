.class public LYue/ۥۢۤۦۢ$ۥ;
.super LYue/ۥۢۤۦۢ$ۥ۟۟۟ۡ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۤۦۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥۢۤۦۢ;


# direct methods
.method public constructor <init>(LYue/ۥۢۤۦۢ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢۤۦۢ$ۥ;->ۥ:LYue/ۥۢۤۦۢ;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۡ;-><init>(LYue/ۥۢۤۦۢ$ۥ;)V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 2

    iget-object v0, p0, LYue/ۥۢۤۦۢ$ۥ;->ۥ:LYue/ۥۢۤۦۢ;

    const/4 v1, 0x1

    iput-boolean v1, v0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۧ:Z

    iget-object v0, v0, LYue/ۥۢۤۦۢ;->ۥۣ۟۟ۡ:LYue/ۥۡۧۥ۠;

    invoke-virtual {v0}, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۦ()V

    return-void
.end method
