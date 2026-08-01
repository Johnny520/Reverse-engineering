.class public final synthetic Lr0/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Le0/a;


# direct methods
.method public synthetic constructor <init>(Le0/a;JI)V
    .locals 0

    .line 1
    iput p4, p0, Lr0/O;->a:I

    iput-object p1, p0, Lr0/O;->c:Le0/a;

    iput-wide p2, p0, Lr0/O;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lr0/O;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr0/O;->c:Le0/a;

    .line 7
    .line 8
    check-cast v0, Lr0/H0;

    .line 9
    .line 10
    iget-wide v1, p0, Lr0/O;->b:J

    .line 11
    .line 12
    iget-wide v3, v0, Lr0/H0;->R:J

    .line 13
    .line 14
    cmp-long v1, v3, v1

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    iget-boolean v1, v0, Lr0/H0;->S:Z

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v1, 0x0

    .line 24
    iput-object v1, v0, Lr0/H0;->P:Ljava/lang/String;

    .line 25
    .line 26
    iput-object v1, v0, Lr0/H0;->Q:Ljava/lang/String;

    .line 27
    .line 28
    const-wide/16 v2, 0x0

    .line 29
    .line 30
    iput-wide v2, v0, Lr0/H0;->R:J

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    iput-boolean v2, v0, Lr0/H0;->S:Z

    .line 34
    .line 35
    iput-object v1, v0, Lr0/H0;->T:Ljava/lang/ref/WeakReference;

    .line 36
    .line 37
    iput-object v1, v0, Lr0/H0;->U:Ljava/lang/ref/WeakReference;

    .line 38
    .line 39
    iget-object v0, v0, Lr0/H0;->V:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 42
    .line 43
    .line 44
    :cond_1
    :goto_0
    return-void

    .line 45
    :pswitch_0
    iget-object v0, p0, Lr0/O;->c:Le0/a;

    .line 46
    .line 47
    check-cast v0, Lr0/d0;

    .line 48
    .line 49
    iget-wide v1, p0, Lr0/O;->b:J

    .line 50
    .line 51
    iget-wide v3, v0, Lr0/d0;->N:J

    .line 52
    .line 53
    cmp-long v1, v3, v1

    .line 54
    .line 55
    if-nez v1, :cond_3

    .line 56
    .line 57
    iget-boolean v1, v0, Lr0/d0;->O:Z

    .line 58
    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    const/4 v1, 0x0

    .line 63
    iput-object v1, v0, Lr0/d0;->L:Ljava/lang/String;

    .line 64
    .line 65
    iput-object v1, v0, Lr0/d0;->M:Ljava/lang/String;

    .line 66
    .line 67
    const-wide/16 v2, 0x0

    .line 68
    .line 69
    iput-wide v2, v0, Lr0/d0;->N:J

    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    iput-boolean v2, v0, Lr0/d0;->O:Z

    .line 73
    .line 74
    iput-object v1, v0, Lr0/d0;->P:Ljava/lang/ref/WeakReference;

    .line 75
    .line 76
    iget-object v0, v0, Lr0/d0;->I:Ljava/util/WeakHashMap;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->clear()V

    .line 79
    .line 80
    .line 81
    :cond_3
    :goto_1
    return-void

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
