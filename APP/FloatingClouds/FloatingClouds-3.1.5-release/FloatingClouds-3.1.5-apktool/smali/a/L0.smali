.class public final La/L0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/K0;

.field public b:Landroid/content/res/ColorStateList;

.field public c:Landroid/graphics/PorterDuff$Mode;

.field public d:Z

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(La/K0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, La/L0;->b:Landroid/content/res/ColorStateList;

    iput-object v0, p0, La/L0;->c:Landroid/graphics/PorterDuff$Mode;

    const/4 v0, 0x0

    iput-boolean v0, p0, La/L0;->d:Z

    iput-boolean v0, p0, La/L0;->e:Z

    iput-object p1, p0, La/L0;->a:La/K0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, La/L0;->a:La/K0;

    invoke-virtual {v0}, Landroid/widget/CheckedTextView;->getCheckMarkDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-boolean v2, p0, La/L0;->d:Z

    if-nez v2, :cond_0

    iget-boolean v2, p0, La/L0;->e:Z

    if-eqz v2, :cond_4

    :cond_0
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-boolean v2, p0, La/L0;->d:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, La/L0;->b:Landroid/content/res/ColorStateList;

    invoke-static {v1, v2}, La/w5$a;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_1
    iget-boolean v2, p0, La/L0;->e:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, La/L0;->c:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v1, v2}, La/w5$a;->i(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_2
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_3
    invoke-virtual {v0, v1}, La/K0;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_4
    return-void
.end method
