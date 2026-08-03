.class public final Llb;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:I

.field public final b:Lob;

.field public final c:Lnb;

.field public final d:Lmb;

.field public final e:Lpb;

.field public f:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lob;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput v1, v0, Lob;->a:I

    iput v1, v0, Lob;->b:I

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v0, Lob;->c:F

    const/high16 v3, 0x7fc00000    # Float.NaN

    iput v3, v0, Lob;->d:F

    iput-object v0, p0, Llb;->b:Lob;

    new-instance v0, Lnb;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v4, -0x1

    iput v4, v0, Lnb;->a:I

    iput v1, v0, Lnb;->b:I

    iput v4, v0, Lnb;->c:I

    iput v3, v0, Lnb;->d:F

    iput v3, v0, Lnb;->e:F

    iput v3, v0, Lnb;->f:F

    iput v4, v0, Lnb;->g:I

    const/4 v5, 0x0

    iput-object v5, v0, Lnb;->h:Ljava/lang/String;

    iput v4, v0, Lnb;->i:I

    iput-object v0, p0, Llb;->c:Lnb;

    new-instance v0, Lmb;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-boolean v1, v0, Lmb;->a:Z

    iput v4, v0, Lmb;->d:I

    iput v4, v0, Lmb;->e:I

    const/high16 v6, -0x40800000    # -1.0f

    iput v6, v0, Lmb;->f:F

    const/4 v7, 0x1

    iput-boolean v7, v0, Lmb;->g:Z

    iput v4, v0, Lmb;->h:I

    iput v4, v0, Lmb;->i:I

    iput v4, v0, Lmb;->j:I

    iput v4, v0, Lmb;->k:I

    iput v4, v0, Lmb;->l:I

    iput v4, v0, Lmb;->m:I

    iput v4, v0, Lmb;->n:I

    iput v4, v0, Lmb;->o:I

    iput v4, v0, Lmb;->p:I

    iput v4, v0, Lmb;->q:I

    iput v4, v0, Lmb;->r:I

    iput v4, v0, Lmb;->s:I

    iput v4, v0, Lmb;->t:I

    iput v4, v0, Lmb;->u:I

    iput v4, v0, Lmb;->v:I

    const/high16 v8, 0x3f000000    # 0.5f

    iput v8, v0, Lmb;->w:F

    iput v8, v0, Lmb;->x:F

    iput-object v5, v0, Lmb;->y:Ljava/lang/String;

    iput v4, v0, Lmb;->z:I

    iput v1, v0, Lmb;->A:I

    const/4 v5, 0x0

    iput v5, v0, Lmb;->B:F

    iput v4, v0, Lmb;->C:I

    iput v4, v0, Lmb;->D:I

    iput v4, v0, Lmb;->E:I

    iput v1, v0, Lmb;->F:I

    iput v1, v0, Lmb;->G:I

    iput v1, v0, Lmb;->H:I

    iput v1, v0, Lmb;->I:I

    iput v1, v0, Lmb;->J:I

    iput v1, v0, Lmb;->K:I

    iput v1, v0, Lmb;->L:I

    const/high16 v8, -0x80000000

    iput v8, v0, Lmb;->M:I

    iput v8, v0, Lmb;->N:I

    iput v8, v0, Lmb;->O:I

    iput v8, v0, Lmb;->P:I

    iput v8, v0, Lmb;->Q:I

    iput v8, v0, Lmb;->R:I

    iput v8, v0, Lmb;->S:I

    iput v6, v0, Lmb;->T:F

    iput v6, v0, Lmb;->U:F

    iput v1, v0, Lmb;->V:I

    iput v1, v0, Lmb;->W:I

    iput v1, v0, Lmb;->X:I

    iput v1, v0, Lmb;->Y:I

    iput v1, v0, Lmb;->Z:I

    iput v1, v0, Lmb;->a0:I

    iput v1, v0, Lmb;->b0:I

    iput v1, v0, Lmb;->c0:I

    iput v2, v0, Lmb;->d0:F

    iput v2, v0, Lmb;->e0:F

    iput v4, v0, Lmb;->f0:I

    iput v1, v0, Lmb;->g0:I

    iput v4, v0, Lmb;->h0:I

    iput-boolean v1, v0, Lmb;->l0:Z

    iput-boolean v1, v0, Lmb;->m0:Z

    iput-boolean v7, v0, Lmb;->n0:Z

    iput v1, v0, Lmb;->o0:I

    iput-object v0, p0, Llb;->d:Lmb;

    new-instance v0, Lpb;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput v5, v0, Lpb;->a:F

    iput v5, v0, Lpb;->b:F

    iput v5, v0, Lpb;->c:F

    iput v2, v0, Lpb;->d:F

    iput v2, v0, Lpb;->e:F

    iput v3, v0, Lpb;->f:F

    iput v3, v0, Lpb;->g:F

    iput v4, v0, Lpb;->h:I

    iput v5, v0, Lpb;->i:F

    iput v5, v0, Lpb;->j:F

    iput v5, v0, Lpb;->k:F

    iput-boolean v1, v0, Lpb;->l:Z

    iput v5, v0, Lpb;->m:F

    iput-object v0, p0, Llb;->e:Lpb;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Llb;->f:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final a(Lgb;)V
    .locals 2

    iget-object v0, p0, Llb;->d:Lmb;

    iget v1, v0, Lmb;->h:I

    iput v1, p1, Lgb;->e:I

    iget v1, v0, Lmb;->i:I

    iput v1, p1, Lgb;->f:I

    iget v1, v0, Lmb;->j:I

    iput v1, p1, Lgb;->g:I

    iget v1, v0, Lmb;->k:I

    iput v1, p1, Lgb;->h:I

    iget v1, v0, Lmb;->l:I

    iput v1, p1, Lgb;->i:I

    iget v1, v0, Lmb;->m:I

    iput v1, p1, Lgb;->j:I

    iget v1, v0, Lmb;->n:I

    iput v1, p1, Lgb;->k:I

    iget v1, v0, Lmb;->o:I

    iput v1, p1, Lgb;->l:I

    iget v1, v0, Lmb;->p:I

    iput v1, p1, Lgb;->m:I

    iget v1, v0, Lmb;->q:I

    iput v1, p1, Lgb;->n:I

    iget v1, v0, Lmb;->r:I

    iput v1, p1, Lgb;->o:I

    iget v1, v0, Lmb;->s:I

    iput v1, p1, Lgb;->s:I

    iget v1, v0, Lmb;->t:I

    iput v1, p1, Lgb;->t:I

    iget v1, v0, Lmb;->u:I

    iput v1, p1, Lgb;->u:I

    iget v1, v0, Lmb;->v:I

    iput v1, p1, Lgb;->v:I

    iget v1, v0, Lmb;->F:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v1, v0, Lmb;->G:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v1, v0, Lmb;->H:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v1, v0, Lmb;->I:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v1, v0, Lmb;->R:I

    iput v1, p1, Lgb;->A:I

    iget v1, v0, Lmb;->Q:I

    iput v1, p1, Lgb;->B:I

    iget v1, v0, Lmb;->N:I

    iput v1, p1, Lgb;->x:I

    iget v1, v0, Lmb;->P:I

    iput v1, p1, Lgb;->z:I

    iget v1, v0, Lmb;->w:F

    iput v1, p1, Lgb;->E:F

    iget v1, v0, Lmb;->x:F

    iput v1, p1, Lgb;->F:F

    iget v1, v0, Lmb;->z:I

    iput v1, p1, Lgb;->p:I

    iget v1, v0, Lmb;->A:I

    iput v1, p1, Lgb;->q:I

    iget v1, v0, Lmb;->B:F

    iput v1, p1, Lgb;->r:F

    iget-object v1, v0, Lmb;->y:Ljava/lang/String;

    iput-object v1, p1, Lgb;->G:Ljava/lang/String;

    iget v1, v0, Lmb;->C:I

    iput v1, p1, Lgb;->T:I

    iget v1, v0, Lmb;->D:I

    iput v1, p1, Lgb;->U:I

    iget v1, v0, Lmb;->T:F

    iput v1, p1, Lgb;->I:F

    iget v1, v0, Lmb;->U:F

    iput v1, p1, Lgb;->H:F

    iget v1, v0, Lmb;->W:I

    iput v1, p1, Lgb;->K:I

    iget v1, v0, Lmb;->V:I

    iput v1, p1, Lgb;->J:I

    iget-boolean v1, v0, Lmb;->l0:Z

    iput-boolean v1, p1, Lgb;->W:Z

    iget-boolean v1, v0, Lmb;->m0:Z

    iput-boolean v1, p1, Lgb;->X:Z

    iget v1, v0, Lmb;->X:I

    iput v1, p1, Lgb;->L:I

    iget v1, v0, Lmb;->Y:I

    iput v1, p1, Lgb;->M:I

    iget v1, v0, Lmb;->Z:I

    iput v1, p1, Lgb;->P:I

    iget v1, v0, Lmb;->a0:I

    iput v1, p1, Lgb;->Q:I

    iget v1, v0, Lmb;->b0:I

    iput v1, p1, Lgb;->N:I

    iget v1, v0, Lmb;->c0:I

    iput v1, p1, Lgb;->O:I

    iget v1, v0, Lmb;->d0:F

    iput v1, p1, Lgb;->R:F

    iget v1, v0, Lmb;->e0:F

    iput v1, p1, Lgb;->S:F

    iget v1, v0, Lmb;->E:I

    iput v1, p1, Lgb;->V:I

    iget v1, v0, Lmb;->f:F

    iput v1, p1, Lgb;->c:F

    iget v1, v0, Lmb;->d:I

    iput v1, p1, Lgb;->a:I

    iget v1, v0, Lmb;->e:I

    iput v1, p1, Lgb;->b:I

    iget v1, v0, Lmb;->b:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iget v1, v0, Lmb;->c:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iget-object v1, v0, Lmb;->k0:Ljava/lang/String;

    if-eqz v1, :cond_0

    iput-object v1, p1, Lgb;->Y:Ljava/lang/String;

    :cond_0
    iget v1, v0, Lmb;->o0:I

    iput v1, p1, Lgb;->Z:I

    iget v1, v0, Lmb;->K:I

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    iget v0, v0, Lmb;->J:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {p1}, Lgb;->a()V

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 5

    new-instance v0, Llb;

    invoke-direct {v0}, Llb;-><init>()V

    iget-object v1, v0, Llb;->d:Lmb;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Llb;->d:Lmb;

    iget-boolean v3, v2, Lmb;->a:Z

    iput-boolean v3, v1, Lmb;->a:Z

    iget v3, v2, Lmb;->b:I

    iput v3, v1, Lmb;->b:I

    iget v3, v2, Lmb;->c:I

    iput v3, v1, Lmb;->c:I

    iget v3, v2, Lmb;->d:I

    iput v3, v1, Lmb;->d:I

    iget v3, v2, Lmb;->e:I

    iput v3, v1, Lmb;->e:I

    iget v3, v2, Lmb;->f:F

    iput v3, v1, Lmb;->f:F

    iget-boolean v3, v2, Lmb;->g:Z

    iput-boolean v3, v1, Lmb;->g:Z

    iget v3, v2, Lmb;->h:I

    iput v3, v1, Lmb;->h:I

    iget v3, v2, Lmb;->i:I

    iput v3, v1, Lmb;->i:I

    iget v3, v2, Lmb;->j:I

    iput v3, v1, Lmb;->j:I

    iget v3, v2, Lmb;->k:I

    iput v3, v1, Lmb;->k:I

    iget v3, v2, Lmb;->l:I

    iput v3, v1, Lmb;->l:I

    iget v3, v2, Lmb;->m:I

    iput v3, v1, Lmb;->m:I

    iget v3, v2, Lmb;->n:I

    iput v3, v1, Lmb;->n:I

    iget v3, v2, Lmb;->o:I

    iput v3, v1, Lmb;->o:I

    iget v3, v2, Lmb;->p:I

    iput v3, v1, Lmb;->p:I

    iget v3, v2, Lmb;->q:I

    iput v3, v1, Lmb;->q:I

    iget v3, v2, Lmb;->r:I

    iput v3, v1, Lmb;->r:I

    iget v3, v2, Lmb;->s:I

    iput v3, v1, Lmb;->s:I

    iget v3, v2, Lmb;->t:I

    iput v3, v1, Lmb;->t:I

    iget v3, v2, Lmb;->u:I

    iput v3, v1, Lmb;->u:I

    iget v3, v2, Lmb;->v:I

    iput v3, v1, Lmb;->v:I

    iget v3, v2, Lmb;->w:F

    iput v3, v1, Lmb;->w:F

    iget v3, v2, Lmb;->x:F

    iput v3, v1, Lmb;->x:F

    iget-object v3, v2, Lmb;->y:Ljava/lang/String;

    iput-object v3, v1, Lmb;->y:Ljava/lang/String;

    iget v3, v2, Lmb;->z:I

    iput v3, v1, Lmb;->z:I

    iget v3, v2, Lmb;->A:I

    iput v3, v1, Lmb;->A:I

    iget v3, v2, Lmb;->B:F

    iput v3, v1, Lmb;->B:F

    iget v3, v2, Lmb;->C:I

    iput v3, v1, Lmb;->C:I

    iget v3, v2, Lmb;->D:I

    iput v3, v1, Lmb;->D:I

    iget v3, v2, Lmb;->E:I

    iput v3, v1, Lmb;->E:I

    iget v3, v2, Lmb;->F:I

    iput v3, v1, Lmb;->F:I

    iget v3, v2, Lmb;->G:I

    iput v3, v1, Lmb;->G:I

    iget v3, v2, Lmb;->H:I

    iput v3, v1, Lmb;->H:I

    iget v3, v2, Lmb;->I:I

    iput v3, v1, Lmb;->I:I

    iget v3, v2, Lmb;->J:I

    iput v3, v1, Lmb;->J:I

    iget v3, v2, Lmb;->K:I

    iput v3, v1, Lmb;->K:I

    iget v3, v2, Lmb;->L:I

    iput v3, v1, Lmb;->L:I

    iget v3, v2, Lmb;->M:I

    iput v3, v1, Lmb;->M:I

    iget v3, v2, Lmb;->N:I

    iput v3, v1, Lmb;->N:I

    iget v3, v2, Lmb;->O:I

    iput v3, v1, Lmb;->O:I

    iget v3, v2, Lmb;->P:I

    iput v3, v1, Lmb;->P:I

    iget v3, v2, Lmb;->Q:I

    iput v3, v1, Lmb;->Q:I

    iget v3, v2, Lmb;->R:I

    iput v3, v1, Lmb;->R:I

    iget v3, v2, Lmb;->S:I

    iput v3, v1, Lmb;->S:I

    iget v3, v2, Lmb;->T:F

    iput v3, v1, Lmb;->T:F

    iget v3, v2, Lmb;->U:F

    iput v3, v1, Lmb;->U:F

    iget v3, v2, Lmb;->V:I

    iput v3, v1, Lmb;->V:I

    iget v3, v2, Lmb;->W:I

    iput v3, v1, Lmb;->W:I

    iget v3, v2, Lmb;->X:I

    iput v3, v1, Lmb;->X:I

    iget v3, v2, Lmb;->Y:I

    iput v3, v1, Lmb;->Y:I

    iget v3, v2, Lmb;->Z:I

    iput v3, v1, Lmb;->Z:I

    iget v3, v2, Lmb;->a0:I

    iput v3, v1, Lmb;->a0:I

    iget v3, v2, Lmb;->b0:I

    iput v3, v1, Lmb;->b0:I

    iget v3, v2, Lmb;->c0:I

    iput v3, v1, Lmb;->c0:I

    iget v3, v2, Lmb;->d0:F

    iput v3, v1, Lmb;->d0:F

    iget v3, v2, Lmb;->e0:F

    iput v3, v1, Lmb;->e0:F

    iget v3, v2, Lmb;->f0:I

    iput v3, v1, Lmb;->f0:I

    iget v3, v2, Lmb;->g0:I

    iput v3, v1, Lmb;->g0:I

    iget v3, v2, Lmb;->h0:I

    iput v3, v1, Lmb;->h0:I

    iget-object v3, v2, Lmb;->k0:Ljava/lang/String;

    iput-object v3, v1, Lmb;->k0:Ljava/lang/String;

    iget-object v3, v2, Lmb;->i0:[I

    if-eqz v3, :cond_0

    iget-object v4, v2, Lmb;->j0:Ljava/lang/String;

    if-nez v4, :cond_0

    array-length v4, v3

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    iput-object v3, v1, Lmb;->i0:[I

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    iput-object v3, v1, Lmb;->i0:[I

    :goto_0
    iget-object v3, v2, Lmb;->j0:Ljava/lang/String;

    iput-object v3, v1, Lmb;->j0:Ljava/lang/String;

    iget-boolean v3, v2, Lmb;->l0:Z

    iput-boolean v3, v1, Lmb;->l0:Z

    iget-boolean v3, v2, Lmb;->m0:Z

    iput-boolean v3, v1, Lmb;->m0:Z

    iget-boolean v3, v2, Lmb;->n0:Z

    iput-boolean v3, v1, Lmb;->n0:Z

    iget v2, v2, Lmb;->o0:I

    iput v2, v1, Lmb;->o0:I

    iget-object v1, v0, Llb;->c:Lnb;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Llb;->c:Lnb;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, v2, Lnb;->a:I

    iput v3, v1, Lnb;->a:I

    iget v3, v2, Lnb;->c:I

    iput v3, v1, Lnb;->c:I

    iget v3, v2, Lnb;->e:F

    iput v3, v1, Lnb;->e:F

    iget v2, v2, Lnb;->d:F

    iput v2, v1, Lnb;->d:F

    iget-object v1, p0, Llb;->b:Lob;

    iget v2, v1, Lob;->a:I

    iget-object v3, v0, Llb;->b:Lob;

    iput v2, v3, Lob;->a:I

    iget v2, v1, Lob;->c:F

    iput v2, v3, Lob;->c:F

    iget v2, v1, Lob;->d:F

    iput v2, v3, Lob;->d:F

    iget v1, v1, Lob;->b:I

    iput v1, v3, Lob;->b:I

    iget-object v1, v0, Llb;->e:Lpb;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Llb;->e:Lpb;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, v2, Lpb;->a:F

    iput v3, v1, Lpb;->a:F

    iget v3, v2, Lpb;->b:F

    iput v3, v1, Lpb;->b:F

    iget v3, v2, Lpb;->c:F

    iput v3, v1, Lpb;->c:F

    iget v3, v2, Lpb;->d:F

    iput v3, v1, Lpb;->d:F

    iget v3, v2, Lpb;->e:F

    iput v3, v1, Lpb;->e:F

    iget v3, v2, Lpb;->f:F

    iput v3, v1, Lpb;->f:F

    iget v3, v2, Lpb;->g:F

    iput v3, v1, Lpb;->g:F

    iget v3, v2, Lpb;->h:I

    iput v3, v1, Lpb;->h:I

    iget v3, v2, Lpb;->i:F

    iput v3, v1, Lpb;->i:F

    iget v3, v2, Lpb;->j:F

    iput v3, v1, Lpb;->j:F

    iget v3, v2, Lpb;->k:F

    iput v3, v1, Lpb;->k:F

    iget-boolean v3, v2, Lpb;->l:Z

    iput-boolean v3, v1, Lpb;->l:Z

    iget v2, v2, Lpb;->m:F

    iput v2, v1, Lpb;->m:F

    iget v1, p0, Llb;->a:I

    iput v1, v0, Llb;->a:I

    return-object v0
.end method
