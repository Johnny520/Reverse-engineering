.class public final LYue/ۥ۠ۦ۠۟$ۥ۟;
.super LYue/ۥ۠ۦ۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۦ۠۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final ۥ۟۟۠ۧ:LYue/ۥ۠ۦ۠۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۨ:LYue/ۥ۠ۦ۠۟$ۥ۟۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟ۡ:LYue/ۥ۟ۤۦ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟ۡ۟:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۠ۦ۠۟;LYue/ۥ۠ۦ۠۟$ۥ۟۟;LYue/ۥ۟ۤۦ;Ljava/lang/Object;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۦ۠۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۠ۦ۠۟$ۥ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۟ۤۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-direct {p0}, LYue/ۥ۠ۦ۠;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۦ۠۟$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۦ۠۟;

    iput-object p2, p0, LYue/ۥ۠ۦ۠۟$ۥ۟;->ۥ۟۟۠ۨ:LYue/ۥ۠ۦ۠۟$ۥ۟۟;

    iput-object p3, p0, LYue/ۥ۠ۦ۠۟$ۥ۟;->ۥ۟۟ۡ:LYue/ۥ۟ۤۦ;

    iput-object p4, p0, LYue/ۥ۠ۦ۠۟$ۥ۟;->ۥ۟۟ۡ۟:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LYue/ۥ۠ۦ۠۟$ۥ۟;->ۥ۟۟ۦۤ(Ljava/lang/Throwable;)V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public ۥ۟۟ۦۤ(Ljava/lang/Throwable;)V
    .locals 3
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥ۠ۦ۠۟$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۦ۠۟;

    iget-object v0, p0, LYue/ۥ۠ۦ۠۟$ۥ۟;->ۥ۟۟۠ۨ:LYue/ۥ۠ۦ۠۟$ۥ۟۟;

    iget-object v1, p0, LYue/ۥ۠ۦ۠۟$ۥ۟;->ۥ۟۟ۡ:LYue/ۥ۟ۤۦ;

    iget-object v2, p0, LYue/ۥ۠ۦ۠۟$ۥ۟;->ۥ۟۟ۡ۟:Ljava/lang/Object;

    invoke-static {p1, v0, v1, v2}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۢۤ(LYue/ۥ۠ۦ۠۟;LYue/ۥ۠ۦ۠۟$ۥ۟۟;LYue/ۥ۟ۤۦ;Ljava/lang/Object;)V

    return-void
.end method
