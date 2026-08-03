.class public final synthetic Lwb/xg;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Ldb/c;

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Lfg/l;Ldb/c;II)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/xg;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/xg;->h:Lfg/l;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/xg;->i:Ldb/c;

    .line 6
    .line 7
    iput p3, p0, Lwb/xg;->j:I

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/xg;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lwb/xg;->i:Ldb/c;

    .line 9
    .line 10
    invoke-static {v2}, Lwb/ho;->T6(Ldb/c;)Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v3, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v4, 0x1

    .line 24
    if-le v1, v4, :cond_0

    .line 25
    .line 26
    iget v1, v0, Lwb/xg;->j:I

    .line 27
    .line 28
    if-ltz v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-ge v1, v4, :cond_0

    .line 35
    .line 36
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    const/16 v25, 0x0

    .line 40
    .line 41
    const v26, 0x37ffff

    .line 42
    .line 43
    .line 44
    move-object/from16 v23, v3

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    const/4 v4, 0x0

    .line 48
    const/4 v5, 0x0

    .line 49
    const/4 v6, 0x0

    .line 50
    const/4 v7, 0x0

    .line 51
    const-wide/16 v8, 0x0

    .line 52
    .line 53
    const/4 v10, 0x0

    .line 54
    const/4 v11, 0x0

    .line 55
    const/4 v12, 0x0

    .line 56
    const/4 v13, 0x0

    .line 57
    const/4 v14, 0x0

    .line 58
    const/4 v15, 0x0

    .line 59
    const-wide/16 v16, 0x0

    .line 60
    .line 61
    const/16 v18, 0x0

    .line 62
    .line 63
    const/16 v19, 0x0

    .line 64
    .line 65
    const/16 v20, 0x0

    .line 66
    .line 67
    const/16 v21, 0x0

    .line 68
    .line 69
    const/16 v22, 0x0

    .line 70
    .line 71
    const/16 v24, 0x0

    .line 72
    .line 73
    invoke-static/range {v2 .. v26}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    :cond_0
    iget-object v1, v0, Lwb/xg;->h:Lfg/l;

    .line 78
    .line 79
    invoke-interface {v1, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    :goto_0
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 83
    .line 84
    return-object v1

    .line 85
    :pswitch_0
    iget v1, v0, Lwb/xg;->j:I

    .line 86
    .line 87
    const-string v2, ""

    .line 88
    .line 89
    iget-object v3, v0, Lwb/xg;->i:Ldb/c;

    .line 90
    .line 91
    invoke-static {v3, v1, v2}, Lwb/ho;->m7(Ldb/c;ILjava/lang/String;)Ldb/c;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    iget-object v2, v0, Lwb/xg;->h:Lfg/l;

    .line 96
    .line 97
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :pswitch_1
    iget v1, v0, Lwb/xg;->j:I

    .line 102
    .line 103
    const-string v2, ""

    .line 104
    .line 105
    iget-object v3, v0, Lwb/xg;->i:Ldb/c;

    .line 106
    .line 107
    invoke-static {v3, v1, v2}, Lwb/ho;->m7(Ldb/c;ILjava/lang/String;)Ldb/c;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iget-object v2, v0, Lwb/xg;->h:Lfg/l;

    .line 112
    .line 113
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
