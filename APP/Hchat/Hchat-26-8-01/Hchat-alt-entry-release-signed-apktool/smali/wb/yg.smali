.class public final synthetic Lwb/yg;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Ldb/c;


# direct methods
.method public synthetic constructor <init>(ILdb/c;Lfg/l;)V
    .locals 0

    .line 1
    iput p1, p0, Lwb/yg;->g:I

    .line 2
    .line 3
    iput-object p3, p0, Lwb/yg;->h:Lfg/l;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/yg;->i:Ldb/c;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/yg;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lwb/yg;->h:Lfg/l;

    .line 9
    .line 10
    iget-object v2, v0, Lwb/yg;->i:Ldb/c;

    .line 11
    .line 12
    invoke-interface {v1, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    :goto_0
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 16
    .line 17
    return-object v1

    .line 18
    :pswitch_0
    iget-object v2, v0, Lwb/yg;->i:Ldb/c;

    .line 19
    .line 20
    invoke-static {v2}, Lwb/ho;->T6(Ldb/c;)Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v3, Ldb/a;

    .line 25
    .line 26
    const-string v4, ""

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-direct {v3, v5, v4}, Ldb/a;-><init>(ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v3}, Ltf/m;->G1(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    move-result-object v23

    .line 36
    const/16 v25, 0x0

    .line 37
    .line 38
    const v26, 0x37ffff

    .line 39
    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v6, 0x0

    .line 45
    const/4 v7, 0x0

    .line 46
    const-wide/16 v8, 0x0

    .line 47
    .line 48
    const/4 v10, 0x0

    .line 49
    const/4 v11, 0x0

    .line 50
    const/4 v12, 0x0

    .line 51
    const/4 v13, 0x0

    .line 52
    const/4 v14, 0x0

    .line 53
    const/4 v15, 0x0

    .line 54
    const-wide/16 v16, 0x0

    .line 55
    .line 56
    const/16 v18, 0x0

    .line 57
    .line 58
    const/16 v19, 0x0

    .line 59
    .line 60
    const/16 v20, 0x0

    .line 61
    .line 62
    const/16 v21, 0x0

    .line 63
    .line 64
    const/16 v22, 0x0

    .line 65
    .line 66
    const/16 v24, 0x0

    .line 67
    .line 68
    invoke-static/range {v2 .. v26}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iget-object v2, v0, Lwb/yg;->h:Lfg/l;

    .line 73
    .line 74
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
