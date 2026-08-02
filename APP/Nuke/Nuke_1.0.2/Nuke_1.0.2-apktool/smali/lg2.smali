.class public final Llg2;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic l:Ldq1;

.field public final synthetic m:Lhg2;

.field public final synthetic n:Z


# direct methods
.method public constructor <init>(Lt00;Ldq1;Lhg2;Z)V
    .locals 0

    .line 1
    iput-object p2, p0, Llg2;->l:Ldq1;

    .line 2
    .line 3
    iput-object p3, p0, Llg2;->m:Lhg2;

    .line 4
    .line 5
    iput-boolean p4, p0, Llg2;->n:Z

    .line 6
    .line 7
    const/4 p2, 0x2

    .line 8
    invoke-direct {p0, p2, p1}, Ltw2;-><init>(ILt00;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lj20;

    .line 2
    .line 3
    check-cast p2, Lt00;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Llg2;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Llg2;

    .line 10
    .line 11
    sget-object p1, La83;->a:La83;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Llg2;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 2

    .line 1
    new-instance p2, Llg2;

    .line 2
    .line 3
    iget-object v0, p0, Llg2;->m:Lhg2;

    .line 4
    .line 5
    iget-boolean v1, p0, Llg2;->n:Z

    .line 6
    .line 7
    iget-object p0, p0, Llg2;->l:Ldq1;

    .line 8
    .line 9
    invoke-direct {p2, p1, p0, v0, v1}, Llg2;-><init>(Lt00;Ldq1;Lhg2;Z)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Llg2;->m:Lhg2;

    .line 5
    .line 6
    invoke-static {p1}, Ldq1;->S(Lhg2;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Llg2;->l:Ldq1;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ldq1;->T(Lhg2;)Ljava/io/File;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p1, Lhg2;->b:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    sget-object v3, La83;->a:La83;

    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    invoke-static {v0, v1, v1}, Ldq1;->n(Ldq1;Ljava/io/File;Ljava/io/File;)V

    .line 26
    .line 27
    .line 28
    return-object v3

    .line 29
    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/4 v4, 0x0

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v9, 0x0

    .line 44
    const/16 v10, 0x1c

    .line 45
    .line 46
    const-string v5, "ALREADY_EXISTS"

    .line 47
    .line 48
    const-string v6, "A file already exists at the target path."

    .line 49
    .line 50
    const/4 v7, 0x0

    .line 51
    const/4 v8, 0x0

    .line 52
    invoke-static/range {v5 .. v10}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 53
    .line 54
    .line 55
    return-object v4

    .line 56
    :cond_2
    iget-boolean p0, p0, Llg2;->n:Z

    .line 57
    .line 58
    if-eqz p0, :cond_3

    .line 59
    .line 60
    iget-object p0, p1, Lhg2;->a:Lfg2;

    .line 61
    .line 62
    invoke-virtual {v0, p0}, Ldq1;->U(Lfg2;)Ljava/io/File;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {v0, v1, p0}, Ldq1;->n(Ldq1;Ljava/io/File;Ljava/io/File;)V

    .line 67
    .line 68
    .line 69
    return-object v3

    .line 70
    :cond_3
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-eqz p0, :cond_5

    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-eqz p0, :cond_4

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/io/File;->mkdir()Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-eqz p0, :cond_4

    .line 87
    .line 88
    :goto_0
    return-object v3

    .line 89
    :cond_4
    const-string p0, "Unable to create directory."

    .line 90
    .line 91
    invoke-static {p0}, Lc80;->v(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-object v4

    .line 95
    :cond_5
    const/4 v9, 0x0

    .line 96
    const/16 v10, 0x1c

    .line 97
    .line 98
    const-string v5, "IO_ERROR"

    .line 99
    .line 100
    const-string v6, "Directory has no parent."

    .line 101
    .line 102
    const/4 v7, 0x0

    .line 103
    const/4 v8, 0x0

    .line 104
    invoke-static/range {v5 .. v10}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 105
    .line 106
    .line 107
    return-object v4
.end method
