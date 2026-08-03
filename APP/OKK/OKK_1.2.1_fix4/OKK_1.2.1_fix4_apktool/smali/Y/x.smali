.class public abstract LY/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LY/C;

.field public static final b:LY/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, LY/D;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LY/x;->a:LY/C;

    goto :goto_0

    :cond_0
    new-instance v0, LY/C;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LY/x;->a:LY/C;

    :goto_0
    new-instance v0, LY/b;

    const-class v1, Ljava/lang/Float;

    const-string v2, "translationAlpha"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, LY/b;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    sput-object v0, LY/x;->b:LY/b;

    new-instance v0, LY/b;

    const-class v1, Landroid/graphics/Rect;

    const-string v2, "clipBounds"

    const/4 v3, 0x6

    invoke-direct {v0, v1, v2, v3}, LY/b;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    return-void
.end method

.method public static a(Landroid/view/View;IIII)V
    .locals 6

    sget-object v0, LY/x;->a:LY/C;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, LY/C;->y0(Landroid/view/View;IIII)V

    return-void
.end method

.method public static b(Landroid/view/View;I)V
    .locals 1

    sget-object v0, LY/x;->a:LY/C;

    invoke-virtual {v0, p0, p1}, LY/C;->l0(Landroid/view/View;I)V

    return-void
.end method
