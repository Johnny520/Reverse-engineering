.class public final LYue/ۥۣ۟ۦۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۟ۦۢ$ۥ;,
        LYue/ۥۣ۟ۦۢ$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟:LYue/ۥۣ۟ۦۢ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public final ۥ:LYue/ۥۡۦۤۧ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟:LYue/ۥۡۦۧ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۣ۟ۦۢ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۣ۟ۦۢ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۣ۟ۦۢ;->ۥ۟۟:LYue/ۥۣ۟ۦۢ$ۥ;

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۦۤۧ;LYue/ۥۡۦۧ;)V
    .locals 0
    .param p1    # LYue/ۥۡۦۤۧ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # LYue/ۥۡۦۧ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۟ۦۢ;->ۥ:LYue/ۥۡۦۤۧ;

    iput-object p2, p0, LYue/ۥۣ۟ۦۢ;->ۥ۟:LYue/ۥۡۦۧ;

    return-void
.end method


# virtual methods
.method public final ۥ()LYue/ۥۡۦۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۦۢ;->ۥ۟:LYue/ۥۡۦۧ;

    return-object v0
.end method

.method public final ۥ۟()LYue/ۥۡۦۤۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۦۢ;->ۥ:LYue/ۥۡۦۤۧ;

    return-object v0
.end method
