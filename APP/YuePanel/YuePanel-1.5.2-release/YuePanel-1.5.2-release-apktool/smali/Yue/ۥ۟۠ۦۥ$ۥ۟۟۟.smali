.class public LYue/ۥ۟۠ۦۥ$ۥ۟۟۟;
.super LYue/ۥ۟۠ۦۥ$ۥ۟۟۟ۡ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۠ۦۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥ۟۠ۦۦ;


# direct methods
.method public constructor <init>(LYue/ۥ۟۠ۦۦ;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LYue/ۥ۟۠ۦۥ$ۥ۟۟۟ۡ;-><init>(LYue/ۥ۟۠ۦۥ$ۥ;)V

    iput-object p1, p0, LYue/ۥ۟۠ۦۥ$ۥ۟۟۟;->ۥ:LYue/ۥ۟۠ۦۦ;

    return-void
.end method


# virtual methods
.method public ۥ۟۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۠ۦۥ$ۥ۟۟۟;->ۥ:LYue/ۥ۟۠ۦۦ;

    invoke-virtual {v0}, LYue/ۥ۟۠ۦۦ;->start()V

    return-void
.end method

.method public ۥ۟۟۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۠ۦۥ$ۥ۟۟۟;->ۥ:LYue/ۥ۟۠ۦۦ;

    invoke-virtual {v0}, LYue/ۥ۟۠ۦۦ;->stop()V

    return-void
.end method
