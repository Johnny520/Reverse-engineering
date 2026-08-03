.class public final LYue/ۥۡۨۨۨ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۨۨۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# static fields
.field public static final synthetic ۥ:LYue/ۥۡۨۨۨ$ۥ;

.field public static final ۥ۟:LYue/ۥۡۨۨۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟:LYue/ۥۡۨۨۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۡۨۨۨ$ۥ;

    invoke-direct {v0}, LYue/ۥۡۨۨۨ$ۥ;-><init>()V

    sput-object v0, LYue/ۥۡۨۨۨ$ۥ;->ۥ:LYue/ۥۡۨۨۨ$ۥ;

    new-instance v0, LYue/ۥۢ۟ۨۦ;

    invoke-direct {v0}, LYue/ۥۢ۟ۨۦ;-><init>()V

    sput-object v0, LYue/ۥۡۨۨۨ$ۥ;->ۥ۟:LYue/ۥۡۨۨۨ;

    new-instance v0, LYue/ۥۢ۟ۨۧ;

    invoke-direct {v0}, LYue/ۥۢ۟ۨۧ;-><init>()V

    sput-object v0, LYue/ۥۡۨۨۨ$ۥ;->ۥ۟۟:LYue/ۥۡۨۨۨ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic ۥ۟(LYue/ۥۡۨۨۨ$ۥ;JJILjava/lang/Object;)LYue/ۥۡۨۨۨ;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    const-wide p3, 0x7fffffffffffffffL

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, LYue/ۥۡۨۨۨ$ۥ;->ۥ(JJ)LYue/ۥۡۨۨۨ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ۥ(JJ)LYue/ۥۡۨۨۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥۢ۟ۨۨ;

    invoke-direct {v0, p1, p2, p3, p4}, LYue/ۥۢ۟ۨۨ;-><init>(JJ)V

    return-object v0
.end method

.method public final ۥ۟۟()LYue/ۥۡۨۨۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۡۨۨۨ$ۥ;->ۥ۟:LYue/ۥۡۨۨۨ;

    return-object v0
.end method

.method public final ۥ۟۟۟()LYue/ۥۡۨۨۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۡۨۨۨ$ۥ;->ۥ۟۟:LYue/ۥۡۨۨۨ;

    return-object v0
.end method
