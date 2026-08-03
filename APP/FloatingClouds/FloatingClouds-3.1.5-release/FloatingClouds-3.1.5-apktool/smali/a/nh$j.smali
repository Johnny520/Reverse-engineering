.class public final La/nh$j;
.super La/nh$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/nh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "j"
.end annotation


# static fields
.field public static final q:La/nh;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, La/F;->g()Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, La/nh;->g(Landroid/view/View;Landroid/view/WindowInsets;)La/nh;

    move-result-object v0

    sput-object v0, La/nh$j;->q:La/nh;

    return-void
.end method

.method public constructor <init>(La/nh;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, La/nh$i;-><init>(La/nh;Landroid/view/WindowInsets;)V

    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public f(I)La/a9;
    .locals 1

    iget-object v0, p0, La/nh$f;->c:Landroid/view/WindowInsets;

    invoke-static {p1}, La/nh$m;->a(I)I

    move-result p1

    invoke-static {v0, p1}, La/F;->e(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, La/a9;->c(Landroid/graphics/Insets;)La/a9;

    move-result-object p1

    return-object p1
.end method
