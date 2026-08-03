.class public abstract LYue/ۥۡۦۡ$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Z

.field public final ۥ۟۟۠ۤ:LYue/ۥۣۣ۟۠;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۥ:LYue/ۥۣۣ۟۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLYue/ۥۣۣ۟۠;LYue/ۥۣۣ۟۟;)V
    .locals 1
    .param p2    # LYue/ۥۣۣ۟۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣۣ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sink"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LYue/ۥۡۦۡ$ۥ۟۟۟;->ۥۣ۟۟۠:Z

    iput-object p2, p0, LYue/ۥۡۦۡ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣۣ۟۠;

    iput-object p3, p0, LYue/ۥۡۦۡ$ۥ۟۟۟;->ۥ۟۟۠ۥ:LYue/ۥۣۣ۟۟;

    return-void
.end method


# virtual methods
.method public final ۥ۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۡۦۡ$ۥ۟۟۟;->ۥۣ۟۟۠:Z

    return v0
.end method

.method public final ۥ۟۟()LYue/ۥۣۣ۟۟;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۡ$ۥ۟۟۟;->ۥ۟۟۠ۥ:LYue/ۥۣۣ۟۟;

    return-object v0
.end method

.method public final ۥ۟۟۟()LYue/ۥۣۣ۟۠;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۡ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣۣ۟۠;

    return-object v0
.end method
