.class public Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/ۥ۟۟ۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# static fields
.field public static final ۥ۟۟۟:I = 0x1

.field public static final ۥ۟۟۟۟:I = 0x2

.field public static final ۥ۟۟۟۠:I = 0x4

.field public static final ۥ۟۟۟ۡ:I = 0x8

.field public static final ۥ۟۟۟ۢ:I = 0x3

.field public static final ۥۣ۟۟۟:I = 0xc

.field public static final ۥ۟۟۟ۤ:I = 0xe

.field public static ۥ۟۟۟ۥ:LYue/ۥۡۤۤ۠$ۥ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e4\u06e4\u06e0$\u06e5<",
            "Landroidx/recyclerview/widget/\u06e5\u06df\u06df\u06e1$\u06e5;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public ۥ:I

.field public ۥ۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public ۥ۟۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۡۤۤ۠$ۥ۟;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, LYue/ۥۡۤۤ۠$ۥ۟;-><init>(I)V

    sput-object v0, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟۟۟ۥ:LYue/ۥۡۤۤ۠$ۥ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ()V
    .locals 1

    :goto_0
    sget-object v0, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟۟۟ۥ:LYue/ۥۡۤۤ۠$ۥ;

    invoke-interface {v0}, LYue/ۥۡۤۤ۠$ۥ;->acquire()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ۥ۟()Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;
    .locals 1

    sget-object v0, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟۟۟ۥ:LYue/ۥۡۤۤ۠$ۥ;

    invoke-interface {v0}, LYue/ۥۡۤۤ۠$ۥ;->acquire()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;

    invoke-direct {v0}, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;-><init>()V

    :cond_0
    return-object v0
.end method

.method public static ۥ۟۟(Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;

    iput-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;

    sget-object v0, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟۟۟ۥ:LYue/ۥۡۤۤ۠$ۥ;

    invoke-interface {v0, p0}, LYue/ۥۡۤۤ۠$ۥ;->release(Ljava/lang/Object;)Z

    return-void
.end method
