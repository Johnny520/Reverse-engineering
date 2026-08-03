.class public final synthetic Lba/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Lba/e;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lba/e;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iput-boolean p2, p0, Lba/e;->h:Z

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
    .locals 2

    .line 1
    iget v0, p0, Lba/e;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lba/e;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lfg/l;

    .line 9
    .line 10
    iget-boolean v1, p0, Lba/e;->h:Z

    .line 11
    .line 12
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, Lba/e;->i:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ld9/e;

    .line 23
    .line 24
    iget-object v0, v0, Ld9/e;->d:Lfg/l;

    .line 25
    .line 26
    iget-boolean v1, p0, Lba/e;->h:Z

    .line 27
    .line 28
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_1
    iget-object v0, p0, Lba/e;->i:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lba/d;

    .line 39
    .line 40
    iget-object v0, v0, Lba/d;->c:Lwb/dj;

    .line 41
    .line 42
    iget-boolean v1, p0, Lba/e;->h:Z

    .line 43
    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    sget-object v1, Lba/b;->g:Lba/b;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    sget-object v1, Lba/b;->i:Lba/b;

    .line 50
    .line 51
    :goto_0
    invoke-virtual {v0, v1}, Lwb/dj;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
