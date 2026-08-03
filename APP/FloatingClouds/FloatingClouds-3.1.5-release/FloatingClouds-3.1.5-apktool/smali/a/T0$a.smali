.class public final La/T0$a;
.super La/n9;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/T0;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:La/T0;


# direct methods
.method public constructor <init>(La/T0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/T0$a;->b:La/T0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, La/T0$a;->b:La/T0;

    iget-object v0, v0, La/T0;->a:La/Q0;

    iget-object v1, v0, La/Q0;->v:Landroidx/appcompat/widget/ActionBarContextView;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    iget-object v1, v0, La/Q0;->y:La/Jg;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, La/Jg;->d(La/Lg;)V

    iput-object v2, v0, La/Q0;->y:La/Jg;

    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, La/T0$a;->b:La/T0;

    iget-object v0, v0, La/T0;->a:La/Q0;

    iget-object v0, v0, La/Q0;->v:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    return-void
.end method
