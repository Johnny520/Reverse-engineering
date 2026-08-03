.class public final LYue/ۥ۠ۧۡۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,177:1\n26#2:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n*L\n142#1:178\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,177:1\n26#2:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n*L\n142#1:178\n*E\n"
.end annotation


# static fields
.field public static final ۥ:LYue/ۥ۠ۧۡۦ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟:[Ljava/nio/file/LinkOption;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟:[Ljava/nio/file/LinkOption;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟:Ljava/util/Set;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/nio/file/FileVisitOption;",
            ">;"
        }
    .end annotation
.end field

.field public static final ۥ۟۟۟۟:Ljava/util/Set;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/nio/file/FileVisitOption;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥ۠ۧۡۦ;

    invoke-direct {v0}, LYue/ۥ۠ۧۡۦ;-><init>()V

    sput-object v0, LYue/ۥ۠ۧۡۦ;->ۥ:LYue/ۥ۠ۧۡۦ;

    sget-object v0, Ljava/nio/file/LinkOption;->NOFOLLOW_LINKS:Ljava/nio/file/LinkOption;

    filled-new-array {v0}, [Ljava/nio/file/LinkOption;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۧۡۦ;->ۥ۟:[Ljava/nio/file/LinkOption;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/nio/file/LinkOption;

    sput-object v0, LYue/ۥ۠ۧۡۦ;->ۥ۟۟:[Ljava/nio/file/LinkOption;

    invoke-static {}, LYue/ۥۡۨۤۡ;->ۥ۟۟۟ۥ()Ljava/util/Set;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۧۡۦ;->ۥ۟۟۟:Ljava/util/Set;

    sget-object v0, Ljava/nio/file/FileVisitOption;->FOLLOW_LINKS:Ljava/nio/file/FileVisitOption;

    invoke-static {v0}, LYue/ۥۡۨۤ۠;->ۥ۟۟۟۠(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۧۡۦ;->ۥ۟۟۟۟:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(Z)[Ljava/nio/file/LinkOption;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    if-eqz p1, :cond_0

    sget-object p1, LYue/ۥ۠ۧۡۦ;->ۥ۟۟:[Ljava/nio/file/LinkOption;

    goto :goto_0

    :cond_0
    sget-object p1, LYue/ۥ۠ۧۡۦ;->ۥ۟:[Ljava/nio/file/LinkOption;

    :goto_0
    return-object p1
.end method

.method public final ۥ۟(Z)Ljava/util/Set;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/Set<",
            "Ljava/nio/file/FileVisitOption;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    sget-object p1, LYue/ۥ۠ۧۡۦ;->ۥ۟۟۟۟:Ljava/util/Set;

    goto :goto_0

    :cond_0
    sget-object p1, LYue/ۥ۠ۧۡۦ;->ۥ۟۟۟:Ljava/util/Set;

    :goto_0
    return-object p1
.end method
