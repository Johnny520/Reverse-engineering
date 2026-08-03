.class public final LYue/ۥۡۤۡۦ;
.super LYue/ۥ۟۟ۢ۟;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۤۡۦ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠ۦ:LYue/ۥۡۤۡۦ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۠ۧ:J


# instance fields
.field public final ۥ۟۟۠ۥ:Ljava/util/Random;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۡۤۡۦ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۡۤۡۦ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۡۤۡۦ;->ۥ۟۟۠ۦ:LYue/ۥۡۤۡۦ$ۥ;

    return-void
.end method

.method public constructor <init>(Ljava/util/Random;)V
    .locals 1
    .param p1    # Ljava/util/Random;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "impl"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LYue/ۥ۟۟ۢ۟;-><init>()V

    iput-object p1, p0, LYue/ۥۡۤۡۦ;->ۥ۟۟۠ۥ:Ljava/util/Random;

    return-void
.end method


# virtual methods
.method public ۥ۟۟۠ۡ()Ljava/util/Random;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۤۡۦ;->ۥ۟۟۠ۥ:Ljava/util/Random;

    return-object v0
.end method
