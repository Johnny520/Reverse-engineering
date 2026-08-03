.class public final Landroidx/recyclerview/widget/C$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final d:La/Cc;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/Cc;"
        }
    .end annotation
.end field


# instance fields
.field public a:I

.field public b:Landroidx/recyclerview/widget/RecyclerView$i$b;

.field public c:Landroidx/recyclerview/widget/RecyclerView$i$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La/Cc;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, La/Cc;-><init>(I)V

    sput-object v0, Landroidx/recyclerview/widget/C$a;->d:La/Cc;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Landroidx/recyclerview/widget/C$a;
    .locals 1

    sget-object v0, Landroidx/recyclerview/widget/C$a;->d:La/Cc;

    invoke-virtual {v0}, La/Cc;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/C$a;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/recyclerview/widget/C$a;

    invoke-direct {v0}, Landroidx/recyclerview/widget/C$a;-><init>()V

    :cond_0
    return-object v0
.end method
