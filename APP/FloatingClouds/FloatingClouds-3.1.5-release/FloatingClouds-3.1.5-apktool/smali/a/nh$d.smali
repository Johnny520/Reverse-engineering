.class public final La/nh$d;
.super La/nh$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/nh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, La/nh$c;-><init>()V

    return-void
.end method

.method public constructor <init>(La/nh;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, La/nh$c;-><init>(La/nh;)V

    return-void
.end method


# virtual methods
.method public c(ILa/a9;)V
    .locals 1

    iget-object v0, p0, La/nh$c;->c:Landroid/view/WindowInsets$Builder;

    invoke-static {p1}, La/nh$m;->a(I)I

    move-result p1

    invoke-virtual {p2}, La/a9;->d()Landroid/graphics/Insets;

    move-result-object p2

    invoke-static {v0, p1, p2}, La/F;->p(Landroid/view/WindowInsets$Builder;ILandroid/graphics/Insets;)V

    return-void
.end method
