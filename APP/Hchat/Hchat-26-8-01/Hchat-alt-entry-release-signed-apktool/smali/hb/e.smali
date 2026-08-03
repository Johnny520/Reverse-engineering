.class public final synthetic Lhb/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lhb/k;

.field public final synthetic i:Lhb/i;


# direct methods
.method public synthetic constructor <init>(Lhb/k;Lhb/i;I)V
    .locals 0

    .line 1
    iput p3, p0, Lhb/e;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lhb/e;->h:Lhb/k;

    .line 4
    .line 5
    iput-object p2, p0, Lhb/e;->i:Lhb/i;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lhb/e;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lhb/e;->h:Lhb/k;

    .line 7
    .line 8
    iget-object v1, p0, Lhb/e;->i:Lhb/i;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lhb/k;->m(Lhb/i;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lhb/e;->i:Lhb/i;

    .line 15
    .line 16
    iget-object v1, p0, Lhb/e;->h:Lhb/k;

    .line 17
    .line 18
    iget-object v2, v1, Lhb/k;->e:Ljava/util/ArrayDeque;

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, v1, Lhb/k;->g:Lhb/i;

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1}, Lhb/k;->n()V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
