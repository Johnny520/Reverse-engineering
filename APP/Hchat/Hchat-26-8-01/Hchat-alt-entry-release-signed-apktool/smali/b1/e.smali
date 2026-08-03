.class public final Lb1/e;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lgg/q;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/x;Lb1/h;Lgg/q;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lb1/e;->g:I

    .line 3
    .line 4
    iput-object p3, p0, Lb1/e;->h:Lgg/q;

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lgg/q;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb1/e;->g:I

    .line 11
    iput-object p1, p0, Lb1/e;->h:Lgg/q;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lb1/e;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ls1/f;

    .line 7
    .line 8
    iget-boolean p1, p1, Ls1/f;->w:Z

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lb1/e;->h:Lgg/q;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p1, Lgg/q;->g:Z

    .line 16
    .line 17
    sget-object p1, Lx1/d2;->i:Lx1/d2;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object p1, Lx1/d2;->g:Lx1/d2;

    .line 21
    .line 22
    :goto_0
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Lb1/h;

    .line 24
    .line 25
    iget-boolean v0, p1, Ly0/n;->t:Z

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    sget-object p1, Lx1/d2;->h:Lx1/d2;

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    iget-object v0, p1, Lb1/h;->v:Lb1/h;

    .line 33
    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    const-string v0, "DragAndDropTarget self reference must be null at the start of a drag and drop session"

    .line 38
    .line 39
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :goto_1
    const/4 v0, 0x0

    .line 43
    iput-object v0, p1, Lb1/h;->v:Lb1/h;

    .line 44
    .line 45
    iget-object p1, p0, Lb1/e;->h:Lgg/q;

    .line 46
    .line 47
    iget-boolean v0, p1, Lgg/q;->g:Z

    .line 48
    .line 49
    iput-boolean v0, p1, Lgg/q;->g:Z

    .line 50
    .line 51
    sget-object p1, Lx1/d2;->g:Lx1/d2;

    .line 52
    .line 53
    :goto_2
    return-object p1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
