.class public final Lh/r0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final b:Lh/r0;


# instance fields
.field public final a:Lh/h1;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lh/r0;

    .line 2
    .line 3
    new-instance v1, Lh/h1;

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    const/16 v7, 0x7f

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    invoke-direct/range {v1 .. v7}, Lh/h1;-><init>(Lh/t0;Lh/f1;Lh/a0;Lh/a0;Ljava/util/LinkedHashMap;I)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, Lh/r0;-><init>(Lh/h1;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lh/r0;->b:Lh/r0;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(Lh/h1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh/r0;->a:Lh/h1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lh/r0;)Lh/r0;
    .locals 8

    .line 1
    new-instance v0, Lh/r0;

    .line 2
    .line 3
    new-instance v1, Lh/h1;

    .line 4
    .line 5
    iget-object p1, p1, Lh/r0;->a:Lh/h1;

    .line 6
    .line 7
    iget-object v2, p1, Lh/h1;->a:Lh/t0;

    .line 8
    .line 9
    iget-object v3, p0, Lh/r0;->a:Lh/h1;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iget-object v2, v3, Lh/h1;->a:Lh/t0;

    .line 14
    .line 15
    :cond_0
    iget-object v4, p1, Lh/h1;->b:Lh/f1;

    .line 16
    .line 17
    if-nez v4, :cond_1

    .line 18
    .line 19
    iget-object v4, v3, Lh/h1;->b:Lh/f1;

    .line 20
    .line 21
    :cond_1
    iget-object v3, v3, Lh/h1;->d:Ljava/util/Map;

    .line 22
    .line 23
    iget-object p1, p1, Lh/h1;->d:Ljava/util/Map;

    .line 24
    .line 25
    invoke-static {v3, p1}, Ltf/y;->c0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    const/16 v7, 0x20

    .line 30
    .line 31
    move-object v3, v4

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    invoke-direct/range {v1 .. v7}, Lh/h1;-><init>(Lh/t0;Lh/f1;Lh/a0;Lh/a0;Ljava/util/LinkedHashMap;I)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, v1}, Lh/r0;-><init>(Lh/h1;)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lh/r0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lh/r0;

    .line 6
    .line 7
    iget-object p1, p1, Lh/r0;->a:Lh/h1;

    .line 8
    .line 9
    iget-object v0, p0, Lh/r0;->a:Lh/h1;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lh/h1;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lh/r0;->a:Lh/h1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh/h1;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, Lh/r0;->b:Lh/r0;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lh/r0;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v0, "EnterTransition.None"

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, "EnterTransition: \nFade - "

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lh/r0;->a:Lh/h1;

    .line 20
    .line 21
    iget-object v2, v1, Lh/h1;->a:Lh/t0;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-virtual {v2}, Lh/t0;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-object v2, v3

    .line 32
    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v2, ",\nSlide - "

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object v1, v1, Lh/h1;->b:Lh/f1;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    invoke-virtual {v1}, Lh/f1;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move-object v1, v3

    .line 50
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ",\nShrink - "

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ",\nScale - "

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    return-object v0
.end method
