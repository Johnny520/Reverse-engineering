.class public final Landroidx/constraintlayout/widget/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/widget/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public final b:Landroidx/constraintlayout/widget/e$d;

.field public final c:Landroidx/constraintlayout/widget/e$c;

.field public final d:Landroidx/constraintlayout/widget/e$b;

.field public final e:Landroidx/constraintlayout/widget/e$e;

.field public f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroidx/constraintlayout/widget/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/constraintlayout/widget/e$d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput v1, v0, Landroidx/constraintlayout/widget/e$d;->a:I

    iput v1, v0, Landroidx/constraintlayout/widget/e$d;->b:I

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v0, Landroidx/constraintlayout/widget/e$d;->c:F

    const/high16 v3, 0x7fc00000    # Float.NaN

    iput v3, v0, Landroidx/constraintlayout/widget/e$d;->d:F

    iput-object v0, p0, Landroidx/constraintlayout/widget/e$a;->b:Landroidx/constraintlayout/widget/e$d;

    new-instance v0, Landroidx/constraintlayout/widget/e$c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v4, -0x1

    iput v4, v0, Landroidx/constraintlayout/widget/e$c;->a:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$c;->b:I

    iput v3, v0, Landroidx/constraintlayout/widget/e$c;->c:F

    iput v3, v0, Landroidx/constraintlayout/widget/e$c;->d:F

    iput-object v0, p0, Landroidx/constraintlayout/widget/e$a;->c:Landroidx/constraintlayout/widget/e$c;

    new-instance v0, Landroidx/constraintlayout/widget/e$b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-boolean v1, v0, Landroidx/constraintlayout/widget/e$b;->a:Z

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->d:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->e:I

    const/high16 v5, -0x40800000    # -1.0f

    iput v5, v0, Landroidx/constraintlayout/widget/e$b;->f:F

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->g:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->h:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->i:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->j:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->k:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->l:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->m:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->n:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->o:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->p:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->q:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->r:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->s:I

    const/high16 v6, 0x3f000000    # 0.5f

    iput v6, v0, Landroidx/constraintlayout/widget/e$b;->t:F

    iput v6, v0, Landroidx/constraintlayout/widget/e$b;->u:F

    const/4 v6, 0x0

    iput-object v6, v0, Landroidx/constraintlayout/widget/e$b;->v:Ljava/lang/String;

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->w:I

    iput v1, v0, Landroidx/constraintlayout/widget/e$b;->x:I

    const/4 v6, 0x0

    iput v6, v0, Landroidx/constraintlayout/widget/e$b;->y:F

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->z:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->A:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->B:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->C:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->D:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->E:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->F:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->G:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->H:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->I:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->J:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->K:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->L:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->M:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->N:I

    iput v5, v0, Landroidx/constraintlayout/widget/e$b;->O:F

    iput v5, v0, Landroidx/constraintlayout/widget/e$b;->P:F

    iput v1, v0, Landroidx/constraintlayout/widget/e$b;->Q:I

    iput v1, v0, Landroidx/constraintlayout/widget/e$b;->R:I

    iput v1, v0, Landroidx/constraintlayout/widget/e$b;->S:I

    iput v1, v0, Landroidx/constraintlayout/widget/e$b;->T:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->U:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->V:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->W:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->X:I

    iput v2, v0, Landroidx/constraintlayout/widget/e$b;->Y:F

    iput v2, v0, Landroidx/constraintlayout/widget/e$b;->Z:F

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->a0:I

    iput v1, v0, Landroidx/constraintlayout/widget/e$b;->b0:I

    iput v4, v0, Landroidx/constraintlayout/widget/e$b;->c0:I

    iput-boolean v1, v0, Landroidx/constraintlayout/widget/e$b;->g0:Z

    iput-boolean v1, v0, Landroidx/constraintlayout/widget/e$b;->h0:Z

    const/4 v4, 0x1

    iput-boolean v4, v0, Landroidx/constraintlayout/widget/e$b;->i0:Z

    iput-object v0, p0, Landroidx/constraintlayout/widget/e$a;->d:Landroidx/constraintlayout/widget/e$b;

    new-instance v0, Landroidx/constraintlayout/widget/e$e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput v6, v0, Landroidx/constraintlayout/widget/e$e;->a:F

    iput v6, v0, Landroidx/constraintlayout/widget/e$e;->b:F

    iput v6, v0, Landroidx/constraintlayout/widget/e$e;->c:F

    iput v2, v0, Landroidx/constraintlayout/widget/e$e;->d:F

    iput v2, v0, Landroidx/constraintlayout/widget/e$e;->e:F

    iput v3, v0, Landroidx/constraintlayout/widget/e$e;->f:F

    iput v3, v0, Landroidx/constraintlayout/widget/e$e;->g:F

    iput v6, v0, Landroidx/constraintlayout/widget/e$e;->h:F

    iput v6, v0, Landroidx/constraintlayout/widget/e$e;->i:F

    iput v6, v0, Landroidx/constraintlayout/widget/e$e;->j:F

    iput-boolean v1, v0, Landroidx/constraintlayout/widget/e$e;->k:Z

    iput v6, v0, Landroidx/constraintlayout/widget/e$e;->l:F

    iput-object v0, p0, Landroidx/constraintlayout/widget/e$a;->e:Landroidx/constraintlayout/widget/e$e;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/e$a;->f:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/constraintlayout/widget/ConstraintLayout$a;)V
    .locals 2

    iget-object v0, p0, Landroidx/constraintlayout/widget/e$a;->d:Landroidx/constraintlayout/widget/e$b;

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->g:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->d:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->h:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->e:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->i:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->f:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->j:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->g:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->k:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->h:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->l:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->i:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->m:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->j:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->n:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->o:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->p:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->p:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->q:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->q:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->r:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->r:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->s:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->s:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->C:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->D:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->E:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->F:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->N:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->x:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->M:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->y:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->J:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->u:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->L:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->w:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->t:F

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->z:F

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->u:F

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->A:F

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->w:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->m:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->x:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->n:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->y:F

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->o:F

    iget-object v1, v0, Landroidx/constraintlayout/widget/e$b;->v:Ljava/lang/String;

    iput-object v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->B:Ljava/lang/String;

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->z:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->P:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->A:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Q:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->O:F

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->E:F

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->P:F

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->D:F

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->R:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->G:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->Q:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->F:I

    iget-boolean v1, v0, Landroidx/constraintlayout/widget/e$b;->g0:Z

    iput-boolean v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->S:Z

    iget-boolean v1, v0, Landroidx/constraintlayout/widget/e$b;->h0:Z

    iput-boolean v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->T:Z

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->S:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->H:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->T:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->I:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->U:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->L:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->V:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->M:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->W:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->J:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->X:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->K:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->Y:F

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->N:F

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->Z:F

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->O:F

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->B:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->R:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->f:F

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->c:F

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->d:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->e:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->b:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->b:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->c:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iget-object v1, v0, Landroidx/constraintlayout/widget/e$b;->f0:Ljava/lang/String;

    if-eqz v1, :cond_0

    iput-object v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->U:Ljava/lang/String;

    :cond_0
    iget v1, v0, Landroidx/constraintlayout/widget/e$b;->H:I

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    iget v0, v0, Landroidx/constraintlayout/widget/e$b;->G:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {p1}, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a()V

    return-void
.end method

.method public final b(ILandroidx/constraintlayout/widget/ConstraintLayout$a;)V
    .locals 1

    iput p1, p0, Landroidx/constraintlayout/widget/e$a;->a:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->d:I

    iget-object v0, p0, Landroidx/constraintlayout/widget/e$a;->d:Landroidx/constraintlayout/widget/e$b;

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->g:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->e:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->h:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->f:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->i:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->g:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->j:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->h:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->k:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->i:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->l:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->j:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->m:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->n:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->o:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->p:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->p:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->q:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->q:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->r:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->r:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->s:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->s:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->z:F

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->t:F

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->A:F

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->u:F

    iget-object p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->B:Ljava/lang/String;

    iput-object p1, v0, Landroidx/constraintlayout/widget/e$b;->v:Ljava/lang/String;

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->m:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->w:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->n:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->x:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->o:F

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->y:F

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->P:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->z:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Q:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->A:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->R:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->B:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->c:F

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->f:F

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->d:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->b:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->e:I

    iget p1, p2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->b:I

    iget p1, p2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->c:I

    iget p1, p2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->C:I

    iget p1, p2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->D:I

    iget p1, p2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->E:I

    iget p1, p2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->F:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->E:F

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->O:F

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->D:F

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->P:F

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->G:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->R:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->F:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->Q:I

    iget-boolean p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->S:Z

    iput-boolean p1, v0, Landroidx/constraintlayout/widget/e$b;->g0:Z

    iget-boolean p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->T:Z

    iput-boolean p1, v0, Landroidx/constraintlayout/widget/e$b;->h0:Z

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->H:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->S:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->I:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->T:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->L:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->U:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->M:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->V:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->J:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->W:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->K:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->X:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->N:F

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->Y:F

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->O:F

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->Z:F

    iget-object p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->U:Ljava/lang/String;

    iput-object p1, v0, Landroidx/constraintlayout/widget/e$b;->f0:Ljava/lang/String;

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->u:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->J:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->w:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->L:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->t:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->I:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->v:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->K:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->x:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->N:I

    iget p1, p2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->y:I

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->M:I

    invoke-virtual {p2}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    move-result p1

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->G:I

    invoke-virtual {p2}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    move-result p1

    iput p1, v0, Landroidx/constraintlayout/widget/e$b;->H:I

    return-void
.end method

.method public final c(ILandroidx/constraintlayout/widget/f$a;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/widget/e$a;->b(ILandroidx/constraintlayout/widget/ConstraintLayout$a;)V

    iget-object p1, p0, Landroidx/constraintlayout/widget/e$a;->b:Landroidx/constraintlayout/widget/e$d;

    iget v0, p2, Landroidx/constraintlayout/widget/f$a;->m0:F

    iput v0, p1, Landroidx/constraintlayout/widget/e$d;->c:F

    iget p1, p2, Landroidx/constraintlayout/widget/f$a;->p0:F

    iget-object v0, p0, Landroidx/constraintlayout/widget/e$a;->e:Landroidx/constraintlayout/widget/e$e;

    iput p1, v0, Landroidx/constraintlayout/widget/e$e;->a:F

    iget p1, p2, Landroidx/constraintlayout/widget/f$a;->q0:F

    iput p1, v0, Landroidx/constraintlayout/widget/e$e;->b:F

    iget p1, p2, Landroidx/constraintlayout/widget/f$a;->r0:F

    iput p1, v0, Landroidx/constraintlayout/widget/e$e;->c:F

    iget p1, p2, Landroidx/constraintlayout/widget/f$a;->s0:F

    iput p1, v0, Landroidx/constraintlayout/widget/e$e;->d:F

    iget p1, p2, Landroidx/constraintlayout/widget/f$a;->t0:F

    iput p1, v0, Landroidx/constraintlayout/widget/e$e;->e:F

    iget p1, p2, Landroidx/constraintlayout/widget/f$a;->u0:F

    iput p1, v0, Landroidx/constraintlayout/widget/e$e;->f:F

    iget p1, p2, Landroidx/constraintlayout/widget/f$a;->v0:F

    iput p1, v0, Landroidx/constraintlayout/widget/e$e;->g:F

    iget p1, p2, Landroidx/constraintlayout/widget/f$a;->w0:F

    iput p1, v0, Landroidx/constraintlayout/widget/e$e;->h:F

    iget p1, p2, Landroidx/constraintlayout/widget/f$a;->x0:F

    iput p1, v0, Landroidx/constraintlayout/widget/e$e;->i:F

    iget p1, p2, Landroidx/constraintlayout/widget/f$a;->y0:F

    iput p1, v0, Landroidx/constraintlayout/widget/e$e;->j:F

    iget p1, p2, Landroidx/constraintlayout/widget/f$a;->o0:F

    iput p1, v0, Landroidx/constraintlayout/widget/e$e;->l:F

    iget-boolean p1, p2, Landroidx/constraintlayout/widget/f$a;->n0:Z

    iput-boolean p1, v0, Landroidx/constraintlayout/widget/e$e;->k:Z

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 5

    new-instance v0, Landroidx/constraintlayout/widget/e$a;

    invoke-direct {v0}, Landroidx/constraintlayout/widget/e$a;-><init>()V

    iget-object v1, v0, Landroidx/constraintlayout/widget/e$a;->d:Landroidx/constraintlayout/widget/e$b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Landroidx/constraintlayout/widget/e$a;->d:Landroidx/constraintlayout/widget/e$b;

    iget-boolean v3, v2, Landroidx/constraintlayout/widget/e$b;->a:Z

    iput-boolean v3, v1, Landroidx/constraintlayout/widget/e$b;->a:Z

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->b:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->b:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->c:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->c:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->d:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->d:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->e:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->e:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->f:F

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->f:F

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->g:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->g:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->h:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->h:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->i:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->i:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->j:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->j:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->k:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->k:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->l:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->l:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->m:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->m:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->n:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->n:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->o:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->o:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->p:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->p:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->q:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->q:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->r:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->r:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->s:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->s:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->t:F

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->t:F

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->u:F

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->u:F

    iget-object v3, v2, Landroidx/constraintlayout/widget/e$b;->v:Ljava/lang/String;

    iput-object v3, v1, Landroidx/constraintlayout/widget/e$b;->v:Ljava/lang/String;

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->w:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->w:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->x:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->x:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->y:F

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->y:F

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->z:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->z:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->A:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->A:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->B:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->B:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->C:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->C:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->D:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->D:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->E:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->E:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->F:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->F:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->G:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->G:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->H:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->H:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->I:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->I:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->J:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->J:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->K:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->K:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->L:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->L:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->M:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->M:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->N:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->N:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->O:F

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->O:F

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->P:F

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->P:F

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->Q:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->Q:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->R:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->R:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->S:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->S:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->T:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->T:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->U:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->U:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->V:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->V:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->W:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->W:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->X:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->X:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->Y:F

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->Y:F

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->Z:F

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->Z:F

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->a0:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->a0:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->b0:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->b0:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$b;->c0:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$b;->c0:I

    iget-object v3, v2, Landroidx/constraintlayout/widget/e$b;->f0:Ljava/lang/String;

    iput-object v3, v1, Landroidx/constraintlayout/widget/e$b;->f0:Ljava/lang/String;

    iget-object v3, v2, Landroidx/constraintlayout/widget/e$b;->d0:[I

    if-eqz v3, :cond_0

    array-length v4, v3

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    iput-object v3, v1, Landroidx/constraintlayout/widget/e$b;->d0:[I

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    iput-object v3, v1, Landroidx/constraintlayout/widget/e$b;->d0:[I

    :goto_0
    iget-object v3, v2, Landroidx/constraintlayout/widget/e$b;->e0:Ljava/lang/String;

    iput-object v3, v1, Landroidx/constraintlayout/widget/e$b;->e0:Ljava/lang/String;

    iget-boolean v3, v2, Landroidx/constraintlayout/widget/e$b;->g0:Z

    iput-boolean v3, v1, Landroidx/constraintlayout/widget/e$b;->g0:Z

    iget-boolean v3, v2, Landroidx/constraintlayout/widget/e$b;->h0:Z

    iput-boolean v3, v1, Landroidx/constraintlayout/widget/e$b;->h0:Z

    iget-boolean v2, v2, Landroidx/constraintlayout/widget/e$b;->i0:Z

    iput-boolean v2, v1, Landroidx/constraintlayout/widget/e$b;->i0:Z

    iget-object v1, v0, Landroidx/constraintlayout/widget/e$a;->c:Landroidx/constraintlayout/widget/e$c;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Landroidx/constraintlayout/widget/e$a;->c:Landroidx/constraintlayout/widget/e$c;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, v2, Landroidx/constraintlayout/widget/e$c;->a:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$c;->a:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$c;->b:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$c;->b:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$c;->d:F

    iput v3, v1, Landroidx/constraintlayout/widget/e$c;->d:F

    iget v2, v2, Landroidx/constraintlayout/widget/e$c;->c:F

    iput v2, v1, Landroidx/constraintlayout/widget/e$c;->c:F

    iget-object v1, v0, Landroidx/constraintlayout/widget/e$a;->b:Landroidx/constraintlayout/widget/e$d;

    iget-object v2, p0, Landroidx/constraintlayout/widget/e$a;->b:Landroidx/constraintlayout/widget/e$d;

    iget v3, v2, Landroidx/constraintlayout/widget/e$d;->a:I

    iput v3, v1, Landroidx/constraintlayout/widget/e$d;->a:I

    iget v3, v2, Landroidx/constraintlayout/widget/e$d;->c:F

    iput v3, v1, Landroidx/constraintlayout/widget/e$d;->c:F

    iget v3, v2, Landroidx/constraintlayout/widget/e$d;->d:F

    iput v3, v1, Landroidx/constraintlayout/widget/e$d;->d:F

    iget v2, v2, Landroidx/constraintlayout/widget/e$d;->b:I

    iput v2, v1, Landroidx/constraintlayout/widget/e$d;->b:I

    iget-object v1, v0, Landroidx/constraintlayout/widget/e$a;->e:Landroidx/constraintlayout/widget/e$e;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Landroidx/constraintlayout/widget/e$a;->e:Landroidx/constraintlayout/widget/e$e;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, v2, Landroidx/constraintlayout/widget/e$e;->a:F

    iput v3, v1, Landroidx/constraintlayout/widget/e$e;->a:F

    iget v3, v2, Landroidx/constraintlayout/widget/e$e;->b:F

    iput v3, v1, Landroidx/constraintlayout/widget/e$e;->b:F

    iget v3, v2, Landroidx/constraintlayout/widget/e$e;->c:F

    iput v3, v1, Landroidx/constraintlayout/widget/e$e;->c:F

    iget v3, v2, Landroidx/constraintlayout/widget/e$e;->d:F

    iput v3, v1, Landroidx/constraintlayout/widget/e$e;->d:F

    iget v3, v2, Landroidx/constraintlayout/widget/e$e;->e:F

    iput v3, v1, Landroidx/constraintlayout/widget/e$e;->e:F

    iget v3, v2, Landroidx/constraintlayout/widget/e$e;->f:F

    iput v3, v1, Landroidx/constraintlayout/widget/e$e;->f:F

    iget v3, v2, Landroidx/constraintlayout/widget/e$e;->g:F

    iput v3, v1, Landroidx/constraintlayout/widget/e$e;->g:F

    iget v3, v2, Landroidx/constraintlayout/widget/e$e;->h:F

    iput v3, v1, Landroidx/constraintlayout/widget/e$e;->h:F

    iget v3, v2, Landroidx/constraintlayout/widget/e$e;->i:F

    iput v3, v1, Landroidx/constraintlayout/widget/e$e;->i:F

    iget v3, v2, Landroidx/constraintlayout/widget/e$e;->j:F

    iput v3, v1, Landroidx/constraintlayout/widget/e$e;->j:F

    iget-boolean v3, v2, Landroidx/constraintlayout/widget/e$e;->k:Z

    iput-boolean v3, v1, Landroidx/constraintlayout/widget/e$e;->k:Z

    iget v2, v2, Landroidx/constraintlayout/widget/e$e;->l:F

    iput v2, v1, Landroidx/constraintlayout/widget/e$e;->l:F

    iget v1, p0, Landroidx/constraintlayout/widget/e$a;->a:I

    iput v1, v0, Landroidx/constraintlayout/widget/e$a;->a:I

    return-object v0
.end method
