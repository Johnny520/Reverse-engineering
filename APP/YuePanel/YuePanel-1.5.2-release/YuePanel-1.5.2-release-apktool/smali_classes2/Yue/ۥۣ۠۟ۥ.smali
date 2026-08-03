.class public final LYue/ۥۣ۠۟ۥ;
.super LYue/ۥ۠ۦ۠;
.source "SourceFile"


# instance fields
.field public final ۥ۟۟۠ۧ:LYue/ۥۣۣ۠۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣۣ۠۟;)V
    .locals 0
    .param p1    # LYue/ۥۣۣ۠۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-direct {p0}, LYue/ۥ۠ۦ۠;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۠۟ۥ;->ۥ۟۟۠ۧ:LYue/ۥۣۣ۠۟;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LYue/ۥۣ۠۟ۥ;->ۥ۟۟ۦۤ(Ljava/lang/Throwable;)V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public ۥ۟۟ۦۤ(Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥۣ۠۟ۥ;->ۥ۟۟۠ۧ:LYue/ۥۣۣ۠۟;

    invoke-interface {p1}, LYue/ۥۣۣ۠۟;->ۥ۟۟ۡۥ()V

    return-void
.end method
