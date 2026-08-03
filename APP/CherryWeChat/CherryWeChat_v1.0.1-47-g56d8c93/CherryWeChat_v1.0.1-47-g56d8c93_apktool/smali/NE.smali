.class public abstract LNE;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:LTE;

.field public static final b:Ln7;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, LUE;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LNE;->a:LTE;

    goto :goto_0

    :cond_0
    new-instance v0, LTE;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LNE;->a:LTE;

    :goto_0
    new-instance v0, Ln7;

    const-string v1, "translationAlpha"

    const/4 v2, 0x6

    const-class v3, Ljava/lang/Float;

    invoke-direct {v0, v2, v3, v1}, Ln7;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, LNE;->b:Ln7;

    new-instance v0, Ln7;

    const-string v1, "clipBounds"

    const/4 v2, 0x7

    const-class v3, Landroid/graphics/Rect;

    invoke-direct {v0, v2, v3, v1}, Ln7;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Landroid/view/View;IIII)V
    .locals 6

    sget-object v0, LNE;->a:LTE;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, LTE;->Z(Landroid/view/View;IIII)V

    return-void
.end method

.method public static b(Landroid/view/View;I)V
    .locals 1

    sget-object v0, LNE;->a:LTE;

    invoke-virtual {v0, p0, p1}, LTE;->R(Landroid/view/View;I)V

    return-void
.end method
