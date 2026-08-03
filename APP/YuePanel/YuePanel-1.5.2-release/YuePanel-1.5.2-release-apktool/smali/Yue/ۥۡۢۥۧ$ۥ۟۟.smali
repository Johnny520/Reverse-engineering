.class public LYue/ۥۡۢۥۧ$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۢۥۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۡۢۥۧ;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LYue/ۥۡۢۥۧ;

    invoke-direct {v0, p1}, LYue/ۥۡۢۥۧ;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, LYue/ۥۡۢۥۧ$ۥ۟۟;->ۥ:LYue/ۥۡۢۥۧ;

    return-void
.end method


# virtual methods
.method public ۥ()LYue/ۥۡۢۥۧ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۧ$ۥ۟۟;->ۥ:LYue/ۥۡۢۥۧ;

    return-object v0
.end method

.method public ۥ۟(Ljava/lang/String;)LYue/ۥۡۢۥۧ$ۥ۟۟;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۧ$ۥ۟۟;->ۥ:LYue/ۥۡۢۥۧ;

    iput-object p1, v0, LYue/ۥۡۢۥۧ;->ۥ۟۟:Ljava/lang/String;

    return-object p0
.end method

.method public ۥ۟۟(Ljava/lang/CharSequence;)LYue/ۥۡۢۥۧ$ۥ۟۟;
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۧ$ۥ۟۟;->ۥ:LYue/ۥۡۢۥۧ;

    iput-object p1, v0, LYue/ۥۡۢۥۧ;->ۥ۟:Ljava/lang/CharSequence;

    return-object p0
.end method
