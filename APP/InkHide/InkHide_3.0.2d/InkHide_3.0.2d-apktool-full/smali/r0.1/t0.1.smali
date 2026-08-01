.class public final synthetic Lr0/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/a;
.implements LM0/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lr0/t0;->a:I

    iput-object p2, p0, Lr0/t0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lr0/H0;Ljava/lang/Object;)V
    .locals 0

    .line 2
    const/4 p1, 0x0

    iput p1, p0, Lr0/t0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lr0/t0;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lr0/t0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    const-string v2, "notifyDataSetInvalidated"

    .line 5
    .line 6
    new-array v3, v1, [Ljava/lang/Object;

    .line 7
    .line 8
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 9
    .line 10
    invoke-interface {v4, v0, v2, v3}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    :catchall_0
    :try_start_1
    const-string v2, "notifyDataSetChanged"

    .line 14
    .line 15
    new-array v1, v1, [Ljava/lang/Object;

    .line 16
    .line 17
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 18
    .line 19
    invoke-interface {v3, v0, v2, v1}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    .line 21
    .line 22
    :catchall_1
    sget-object v0, LE0/i;->a:LE0/i;

    .line 23
    .line 24
    return-object v0
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lr0/t0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget-object v0, p0, Lr0/t0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lorg/json/JSONArray;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Lz0/r;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {p1}, LN0/g;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Lz0/r;->z(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v1, p0, Lr0/t0;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Lorg/json/JSONObject;

    .line 37
    .line 38
    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1}, Lz0/r;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance v1, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v0, ":"

    .line 55
    .line 56
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    return-object p1

    .line 67
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
