.class public final synthetic Lv8/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lv8/h;

.field public final synthetic i:Ljava/io/File;

.field public final synthetic j:Lv8/q;


# direct methods
.method public synthetic constructor <init>(Lv8/h;Ljava/io/File;Lv8/q;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lv8/c;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lv8/c;->h:Lv8/h;

    .line 8
    .line 9
    iput-object p2, p0, Lv8/c;->i:Ljava/io/File;

    .line 10
    .line 11
    iput-object p3, p0, Lv8/c;->j:Lv8/q;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lv8/q;Lv8/h;Ljava/io/File;)V
    .locals 1

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lv8/c;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv8/c;->j:Lv8/q;

    iput-object p2, p0, Lv8/c;->h:Lv8/h;

    iput-object p3, p0, Lv8/c;->i:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lv8/c;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iget-object v1, p0, Lv8/c;->h:Lv8/h;

    .line 8
    .line 9
    iput-boolean v0, v1, Lv8/h;->q:Z

    .line 10
    .line 11
    iget-object v0, p0, Lv8/c;->i:Ljava/io/File;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iput-object v0, v1, Lv8/h;->o:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v0, p0, Lv8/c;->j:Lv8/q;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lv8/q;->k(Lv8/h;)V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    new-instance v0, Ljava/io/File;

    .line 31
    .line 32
    iget-object v1, p0, Lv8/c;->h:Lv8/h;

    .line 33
    .line 34
    iget-object v1, v1, Lv8/h;->n:Ljava/lang/String;

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lv8/c;->j:Lv8/q;

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Lv8/q;->g(Ljava/io/File;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    iget-object v2, p0, Lv8/c;->i:Ljava/io/File;

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Lv8/q;->g(Ljava/io/File;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-static {v3, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Lv8/q;->a(Ljava/io/File;)V

    .line 60
    .line 61
    .line 62
    :cond_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 63
    .line 64
    return-object v0

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
