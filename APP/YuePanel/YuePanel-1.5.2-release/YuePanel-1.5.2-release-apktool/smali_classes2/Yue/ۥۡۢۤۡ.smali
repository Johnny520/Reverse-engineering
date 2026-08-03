.class public final LYue/ۥۡۢۤۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۣ۠۟;
.implements LYue/ۥ۟ۤۥۨ;


# annotations
.annotation build LYue/ۥ۠ۥۦۧ;
.end annotation


# static fields
.field public static final ۥۣ۟۟۠:LYue/ۥۡۢۤۡ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۡۢۤۡ;

    invoke-direct {v0}, LYue/ۥۡۢۤۡ;-><init>()V

    sput-object v0, LYue/ۥۡۢۤۡ;->ۥۣ۟۟۠:LYue/ۥۡۢۤۡ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getParent()LYue/ۥ۠ۦ۟ۡ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "NonDisposableHandle"

    return-object v0
.end method

.method public ۥ۟۟۠ۨ(Ljava/lang/Throwable;)Z
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const/4 p1, 0x0

    return p1
.end method

.method public ۥ۟۟ۡۥ()V
    .locals 0

    return-void
.end method
