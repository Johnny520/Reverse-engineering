.class public final Lp/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:Lp/l;

.field public final c:Lp/k;

.field public final d:Lp/j;

.field public final e:Lp/m;

.field public f:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp/l;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput v1, v0, Lp/l;->a:I

    iput v1, v0, Lp/l;->b:I

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v0, Lp/l;->c:F

    const/high16 v3, 0x7fc00000    # Float.NaN

    iput v3, v0, Lp/l;->d:F

    iput-object v0, p0, Lp/i;->b:Lp/l;

    new-instance v0, Lp/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v4, -0x1

    iput v4, v0, Lp/k;->a:I

    iput v4, v0, Lp/k;->b:I

    iput v3, v0, Lp/k;->c:F

    iput v3, v0, Lp/k;->d:F

    iput-object v0, p0, Lp/i;->c:Lp/k;

    new-instance v0, Lp/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-boolean v1, v0, Lp/j;->a:Z

    iput v4, v0, Lp/j;->d:I

    iput v4, v0, Lp/j;->e:I

    const/high16 v5, -0x40800000    # -1.0f

    iput v5, v0, Lp/j;->f:F

    iput v4, v0, Lp/j;->g:I

    iput v4, v0, Lp/j;->h:I

    iput v4, v0, Lp/j;->i:I

    iput v4, v0, Lp/j;->j:I

    iput v4, v0, Lp/j;->k:I

    iput v4, v0, Lp/j;->l:I

    iput v4, v0, Lp/j;->m:I

    iput v4, v0, Lp/j;->n:I

    iput v4, v0, Lp/j;->o:I

    iput v4, v0, Lp/j;->p:I

    iput v4, v0, Lp/j;->q:I

    iput v4, v0, Lp/j;->r:I

    iput v4, v0, Lp/j;->s:I

    const/high16 v6, 0x3f000000    # 0.5f

    iput v6, v0, Lp/j;->t:F

    iput v6, v0, Lp/j;->u:F

    const/4 v6, 0x0

    iput-object v6, v0, Lp/j;->v:Ljava/lang/String;

    iput v4, v0, Lp/j;->w:I

    iput v1, v0, Lp/j;->x:I

    const/4 v6, 0x0

    iput v6, v0, Lp/j;->y:F

    iput v4, v0, Lp/j;->z:I

    iput v4, v0, Lp/j;->A:I

    iput v4, v0, Lp/j;->B:I

    iput v4, v0, Lp/j;->C:I

    iput v4, v0, Lp/j;->D:I

    iput v4, v0, Lp/j;->E:I

    iput v4, v0, Lp/j;->F:I

    iput v4, v0, Lp/j;->G:I

    iput v4, v0, Lp/j;->H:I

    iput v4, v0, Lp/j;->I:I

    iput v4, v0, Lp/j;->J:I

    iput v4, v0, Lp/j;->K:I

    iput v4, v0, Lp/j;->L:I

    iput v4, v0, Lp/j;->M:I

    iput v4, v0, Lp/j;->N:I

    iput v5, v0, Lp/j;->O:F

    iput v5, v0, Lp/j;->P:F

    iput v1, v0, Lp/j;->Q:I

    iput v1, v0, Lp/j;->R:I

    iput v1, v0, Lp/j;->S:I

    iput v1, v0, Lp/j;->T:I

    iput v4, v0, Lp/j;->U:I

    iput v4, v0, Lp/j;->V:I

    iput v4, v0, Lp/j;->W:I

    iput v4, v0, Lp/j;->X:I

    iput v2, v0, Lp/j;->Y:F

    iput v2, v0, Lp/j;->Z:F

    iput v4, v0, Lp/j;->a0:I

    iput v1, v0, Lp/j;->b0:I

    iput v4, v0, Lp/j;->c0:I

    iput-boolean v1, v0, Lp/j;->g0:Z

    iput-boolean v1, v0, Lp/j;->h0:Z

    const/4 v4, 0x1

    iput-boolean v4, v0, Lp/j;->i0:Z

    iput-object v0, p0, Lp/i;->d:Lp/j;

    new-instance v0, Lp/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput v6, v0, Lp/m;->a:F

    iput v6, v0, Lp/m;->b:F

    iput v6, v0, Lp/m;->c:F

    iput v2, v0, Lp/m;->d:F

    iput v2, v0, Lp/m;->e:F

    iput v3, v0, Lp/m;->f:F

    iput v3, v0, Lp/m;->g:F

    iput v6, v0, Lp/m;->h:F

    iput v6, v0, Lp/m;->i:F

    iput v6, v0, Lp/m;->j:F

    iput-boolean v1, v0, Lp/m;->k:Z

    iput v6, v0, Lp/m;->l:F

    iput-object v0, p0, Lp/i;->e:Lp/m;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lp/i;->f:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final a(Lp/e;)V
    .locals 2

    iget-object v0, p0, Lp/i;->d:Lp/j;

    iget v1, v0, Lp/j;->g:I

    iput v1, p1, Lp/e;->d:I

    iget v1, v0, Lp/j;->h:I

    iput v1, p1, Lp/e;->e:I

    iget v1, v0, Lp/j;->i:I

    iput v1, p1, Lp/e;->f:I

    iget v1, v0, Lp/j;->j:I

    iput v1, p1, Lp/e;->g:I

    iget v1, v0, Lp/j;->k:I

    iput v1, p1, Lp/e;->h:I

    iget v1, v0, Lp/j;->l:I

    iput v1, p1, Lp/e;->i:I

    iget v1, v0, Lp/j;->m:I

    iput v1, p1, Lp/e;->j:I

    iget v1, v0, Lp/j;->n:I

    iput v1, p1, Lp/e;->k:I

    iget v1, v0, Lp/j;->o:I

    iput v1, p1, Lp/e;->l:I

    iget v1, v0, Lp/j;->p:I

    iput v1, p1, Lp/e;->p:I

    iget v1, v0, Lp/j;->q:I

    iput v1, p1, Lp/e;->q:I

    iget v1, v0, Lp/j;->r:I

    iput v1, p1, Lp/e;->r:I

    iget v1, v0, Lp/j;->s:I

    iput v1, p1, Lp/e;->s:I

    iget v1, v0, Lp/j;->C:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v1, v0, Lp/j;->D:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v1, v0, Lp/j;->E:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v1, v0, Lp/j;->F:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v1, v0, Lp/j;->N:I

    iput v1, p1, Lp/e;->x:I

    iget v1, v0, Lp/j;->M:I

    iput v1, p1, Lp/e;->y:I

    iget v1, v0, Lp/j;->J:I

    iput v1, p1, Lp/e;->u:I

    iget v1, v0, Lp/j;->L:I

    iput v1, p1, Lp/e;->w:I

    iget v1, v0, Lp/j;->t:F

    iput v1, p1, Lp/e;->z:F

    iget v1, v0, Lp/j;->u:F

    iput v1, p1, Lp/e;->A:F

    iget v1, v0, Lp/j;->w:I

    iput v1, p1, Lp/e;->m:I

    iget v1, v0, Lp/j;->x:I

    iput v1, p1, Lp/e;->n:I

    iget v1, v0, Lp/j;->y:F

    iput v1, p1, Lp/e;->o:F

    iget-object v1, v0, Lp/j;->v:Ljava/lang/String;

    iput-object v1, p1, Lp/e;->B:Ljava/lang/String;

    iget v1, v0, Lp/j;->z:I

    iput v1, p1, Lp/e;->P:I

    iget v1, v0, Lp/j;->A:I

    iput v1, p1, Lp/e;->Q:I

    iget v1, v0, Lp/j;->O:F

    iput v1, p1, Lp/e;->E:F

    iget v1, v0, Lp/j;->P:F

    iput v1, p1, Lp/e;->D:F

    iget v1, v0, Lp/j;->R:I

    iput v1, p1, Lp/e;->G:I

    iget v1, v0, Lp/j;->Q:I

    iput v1, p1, Lp/e;->F:I

    iget-boolean v1, v0, Lp/j;->g0:Z

    iput-boolean v1, p1, Lp/e;->S:Z

    iget-boolean v1, v0, Lp/j;->h0:Z

    iput-boolean v1, p1, Lp/e;->T:Z

    iget v1, v0, Lp/j;->S:I

    iput v1, p1, Lp/e;->H:I

    iget v1, v0, Lp/j;->T:I

    iput v1, p1, Lp/e;->I:I

    iget v1, v0, Lp/j;->U:I

    iput v1, p1, Lp/e;->L:I

    iget v1, v0, Lp/j;->V:I

    iput v1, p1, Lp/e;->M:I

    iget v1, v0, Lp/j;->W:I

    iput v1, p1, Lp/e;->J:I

    iget v1, v0, Lp/j;->X:I

    iput v1, p1, Lp/e;->K:I

    iget v1, v0, Lp/j;->Y:F

    iput v1, p1, Lp/e;->N:F

    iget v1, v0, Lp/j;->Z:F

    iput v1, p1, Lp/e;->O:F

    iget v1, v0, Lp/j;->B:I

    iput v1, p1, Lp/e;->R:I

    iget v1, v0, Lp/j;->f:F

    iput v1, p1, Lp/e;->c:F

    iget v1, v0, Lp/j;->d:I

    iput v1, p1, Lp/e;->a:I

    iget v1, v0, Lp/j;->e:I

    iput v1, p1, Lp/e;->b:I

    iget v1, v0, Lp/j;->b:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iget v1, v0, Lp/j;->c:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iget-object v1, v0, Lp/j;->f0:Ljava/lang/String;

    if-eqz v1, :cond_0

    iput-object v1, p1, Lp/e;->U:Ljava/lang/String;

    :cond_0
    iget v1, v0, Lp/j;->H:I

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    iget v0, v0, Lp/j;->G:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {p1}, Lp/e;->a()V

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 5

    new-instance v0, Lp/i;

    invoke-direct {v0}, Lp/i;-><init>()V

    iget-object v1, v0, Lp/i;->d:Lp/j;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lp/i;->d:Lp/j;

    iget-boolean v3, v2, Lp/j;->a:Z

    iput-boolean v3, v1, Lp/j;->a:Z

    iget v3, v2, Lp/j;->b:I

    iput v3, v1, Lp/j;->b:I

    iget v3, v2, Lp/j;->c:I

    iput v3, v1, Lp/j;->c:I

    iget v3, v2, Lp/j;->d:I

    iput v3, v1, Lp/j;->d:I

    iget v3, v2, Lp/j;->e:I

    iput v3, v1, Lp/j;->e:I

    iget v3, v2, Lp/j;->f:F

    iput v3, v1, Lp/j;->f:F

    iget v3, v2, Lp/j;->g:I

    iput v3, v1, Lp/j;->g:I

    iget v3, v2, Lp/j;->h:I

    iput v3, v1, Lp/j;->h:I

    iget v3, v2, Lp/j;->i:I

    iput v3, v1, Lp/j;->i:I

    iget v3, v2, Lp/j;->j:I

    iput v3, v1, Lp/j;->j:I

    iget v3, v2, Lp/j;->k:I

    iput v3, v1, Lp/j;->k:I

    iget v3, v2, Lp/j;->l:I

    iput v3, v1, Lp/j;->l:I

    iget v3, v2, Lp/j;->m:I

    iput v3, v1, Lp/j;->m:I

    iget v3, v2, Lp/j;->n:I

    iput v3, v1, Lp/j;->n:I

    iget v3, v2, Lp/j;->o:I

    iput v3, v1, Lp/j;->o:I

    iget v3, v2, Lp/j;->p:I

    iput v3, v1, Lp/j;->p:I

    iget v3, v2, Lp/j;->q:I

    iput v3, v1, Lp/j;->q:I

    iget v3, v2, Lp/j;->r:I

    iput v3, v1, Lp/j;->r:I

    iget v3, v2, Lp/j;->s:I

    iput v3, v1, Lp/j;->s:I

    iget v3, v2, Lp/j;->t:F

    iput v3, v1, Lp/j;->t:F

    iget v3, v2, Lp/j;->u:F

    iput v3, v1, Lp/j;->u:F

    iget-object v3, v2, Lp/j;->v:Ljava/lang/String;

    iput-object v3, v1, Lp/j;->v:Ljava/lang/String;

    iget v3, v2, Lp/j;->w:I

    iput v3, v1, Lp/j;->w:I

    iget v3, v2, Lp/j;->x:I

    iput v3, v1, Lp/j;->x:I

    iget v3, v2, Lp/j;->y:F

    iput v3, v1, Lp/j;->y:F

    iget v3, v2, Lp/j;->z:I

    iput v3, v1, Lp/j;->z:I

    iget v3, v2, Lp/j;->A:I

    iput v3, v1, Lp/j;->A:I

    iget v3, v2, Lp/j;->B:I

    iput v3, v1, Lp/j;->B:I

    iget v3, v2, Lp/j;->C:I

    iput v3, v1, Lp/j;->C:I

    iget v3, v2, Lp/j;->D:I

    iput v3, v1, Lp/j;->D:I

    iget v3, v2, Lp/j;->E:I

    iput v3, v1, Lp/j;->E:I

    iget v3, v2, Lp/j;->F:I

    iput v3, v1, Lp/j;->F:I

    iget v3, v2, Lp/j;->G:I

    iput v3, v1, Lp/j;->G:I

    iget v3, v2, Lp/j;->H:I

    iput v3, v1, Lp/j;->H:I

    iget v3, v2, Lp/j;->I:I

    iput v3, v1, Lp/j;->I:I

    iget v3, v2, Lp/j;->J:I

    iput v3, v1, Lp/j;->J:I

    iget v3, v2, Lp/j;->K:I

    iput v3, v1, Lp/j;->K:I

    iget v3, v2, Lp/j;->L:I

    iput v3, v1, Lp/j;->L:I

    iget v3, v2, Lp/j;->M:I

    iput v3, v1, Lp/j;->M:I

    iget v3, v2, Lp/j;->N:I

    iput v3, v1, Lp/j;->N:I

    iget v3, v2, Lp/j;->O:F

    iput v3, v1, Lp/j;->O:F

    iget v3, v2, Lp/j;->P:F

    iput v3, v1, Lp/j;->P:F

    iget v3, v2, Lp/j;->Q:I

    iput v3, v1, Lp/j;->Q:I

    iget v3, v2, Lp/j;->R:I

    iput v3, v1, Lp/j;->R:I

    iget v3, v2, Lp/j;->S:I

    iput v3, v1, Lp/j;->S:I

    iget v3, v2, Lp/j;->T:I

    iput v3, v1, Lp/j;->T:I

    iget v3, v2, Lp/j;->U:I

    iput v3, v1, Lp/j;->U:I

    iget v3, v2, Lp/j;->V:I

    iput v3, v1, Lp/j;->V:I

    iget v3, v2, Lp/j;->W:I

    iput v3, v1, Lp/j;->W:I

    iget v3, v2, Lp/j;->X:I

    iput v3, v1, Lp/j;->X:I

    iget v3, v2, Lp/j;->Y:F

    iput v3, v1, Lp/j;->Y:F

    iget v3, v2, Lp/j;->Z:F

    iput v3, v1, Lp/j;->Z:F

    iget v3, v2, Lp/j;->a0:I

    iput v3, v1, Lp/j;->a0:I

    iget v3, v2, Lp/j;->b0:I

    iput v3, v1, Lp/j;->b0:I

    iget v3, v2, Lp/j;->c0:I

    iput v3, v1, Lp/j;->c0:I

    iget-object v3, v2, Lp/j;->f0:Ljava/lang/String;

    iput-object v3, v1, Lp/j;->f0:Ljava/lang/String;

    iget-object v3, v2, Lp/j;->d0:[I

    if-eqz v3, :cond_0

    array-length v4, v3

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    iput-object v3, v1, Lp/j;->d0:[I

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    iput-object v3, v1, Lp/j;->d0:[I

    :goto_0
    iget-object v3, v2, Lp/j;->e0:Ljava/lang/String;

    iput-object v3, v1, Lp/j;->e0:Ljava/lang/String;

    iget-boolean v3, v2, Lp/j;->g0:Z

    iput-boolean v3, v1, Lp/j;->g0:Z

    iget-boolean v3, v2, Lp/j;->h0:Z

    iput-boolean v3, v1, Lp/j;->h0:Z

    iget-boolean v2, v2, Lp/j;->i0:Z

    iput-boolean v2, v1, Lp/j;->i0:Z

    iget-object v1, v0, Lp/i;->c:Lp/k;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lp/i;->c:Lp/k;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, v2, Lp/k;->a:I

    iput v3, v1, Lp/k;->a:I

    iget v3, v2, Lp/k;->b:I

    iput v3, v1, Lp/k;->b:I

    iget v3, v2, Lp/k;->d:F

    iput v3, v1, Lp/k;->d:F

    iget v2, v2, Lp/k;->c:F

    iput v2, v1, Lp/k;->c:F

    iget-object v1, v0, Lp/i;->b:Lp/l;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lp/i;->b:Lp/l;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, v2, Lp/l;->a:I

    iput v3, v1, Lp/l;->a:I

    iget v3, v2, Lp/l;->c:F

    iput v3, v1, Lp/l;->c:F

    iget v3, v2, Lp/l;->d:F

    iput v3, v1, Lp/l;->d:F

    iget v2, v2, Lp/l;->b:I

    iput v2, v1, Lp/l;->b:I

    iget-object v1, v0, Lp/i;->e:Lp/m;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lp/i;->e:Lp/m;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, v2, Lp/m;->a:F

    iput v3, v1, Lp/m;->a:F

    iget v3, v2, Lp/m;->b:F

    iput v3, v1, Lp/m;->b:F

    iget v3, v2, Lp/m;->c:F

    iput v3, v1, Lp/m;->c:F

    iget v3, v2, Lp/m;->d:F

    iput v3, v1, Lp/m;->d:F

    iget v3, v2, Lp/m;->e:F

    iput v3, v1, Lp/m;->e:F

    iget v3, v2, Lp/m;->f:F

    iput v3, v1, Lp/m;->f:F

    iget v3, v2, Lp/m;->g:F

    iput v3, v1, Lp/m;->g:F

    iget v3, v2, Lp/m;->h:F

    iput v3, v1, Lp/m;->h:F

    iget v3, v2, Lp/m;->i:F

    iput v3, v1, Lp/m;->i:F

    iget v3, v2, Lp/m;->j:F

    iput v3, v1, Lp/m;->j:F

    iget-boolean v3, v2, Lp/m;->k:Z

    iput-boolean v3, v1, Lp/m;->k:Z

    iget v2, v2, Lp/m;->l:F

    iput v2, v1, Lp/m;->l:F

    iget v1, p0, Lp/i;->a:I

    iput v1, v0, Lp/i;->a:I

    return-object v0
.end method
