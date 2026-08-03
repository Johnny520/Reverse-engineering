.class public final La/Qg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/Vg;

.field public static final b:La/Qg$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, La/Wg;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/Qg;->a:La/Vg;

    goto :goto_0

    :cond_0
    new-instance v0, La/Vg;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/Qg;->a:La/Vg;

    :goto_0
    new-instance v0, La/Qg$a;

    const-class v1, Ljava/lang/Float;

    const-string v2, "translationAlpha"

    invoke-direct {v0, v1, v2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, La/Qg;->b:La/Qg$a;

    new-instance v0, La/Qg$b;

    const-class v1, Landroid/graphics/Rect;

    const-string v2, "clipBounds"

    invoke-direct {v0, v1, v2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Landroid/view/View;IIII)V
    .locals 6

    sget-object v0, La/Qg;->a:La/Vg;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, La/Ug;->f(Landroid/view/View;IIII)V

    return-void
.end method

.method public static b(Landroid/view/View;I)V
    .locals 1

    sget-object v0, La/Qg;->a:La/Vg;

    invoke-virtual {v0, p0, p1}, La/Vg;->c(Landroid/view/View;I)V

    return-void
.end method
