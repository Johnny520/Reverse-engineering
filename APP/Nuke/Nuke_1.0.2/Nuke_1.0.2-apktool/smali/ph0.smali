.class public final Lph0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final b:Lph0;

.field public static final c:Lph0;


# instance fields
.field public final a:Lz33;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lph0;

    .line 2
    .line 3
    new-instance v1, Lz33;

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/16 v6, 0x7f

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    invoke-direct/range {v1 .. v6}, Lz33;-><init>(Luh0;Lt11;Lcd2;Ljava/util/LinkedHashMap;I)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Lph0;-><init>(Lz33;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lph0;->b:Lph0;

    .line 18
    .line 19
    new-instance v0, Lph0;

    .line 20
    .line 21
    new-instance v1, Lz33;

    .line 22
    .line 23
    const/16 v6, 0x5f

    .line 24
    .line 25
    invoke-direct/range {v1 .. v6}, Lz33;-><init>(Luh0;Lt11;Lcd2;Ljava/util/LinkedHashMap;I)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1}, Lph0;-><init>(Lz33;)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lph0;->c:Lph0;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(Lz33;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lph0;->a:Lz33;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lph0;)Lph0;
    .locals 7

    .line 1
    new-instance v0, Lph0;

    .line 2
    .line 3
    new-instance v1, Lz33;

    .line 4
    .line 5
    iget-object p1, p1, Lph0;->a:Lz33;

    .line 6
    .line 7
    iget-object v2, p1, Lz33;->a:Luh0;

    .line 8
    .line 9
    iget-object p0, p0, Lph0;->a:Lz33;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Lz33;->a:Luh0;

    .line 14
    .line 15
    :cond_0
    iget-object v3, p1, Lz33;->b:Lcd2;

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    iget-object v3, p0, Lz33;->b:Lcd2;

    .line 20
    .line 21
    :cond_1
    move-object v4, v3

    .line 22
    iget-boolean v3, p1, Lz33;->c:Z

    .line 23
    .line 24
    if-nez v3, :cond_3

    .line 25
    .line 26
    iget-boolean v3, p0, Lz33;->c:Z

    .line 27
    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    const/4 v3, 0x0

    .line 32
    :goto_0
    move v5, v3

    .line 33
    goto :goto_2

    .line 34
    :cond_3
    :goto_1
    const/4 v3, 0x1

    .line 35
    goto :goto_0

    .line 36
    :goto_2
    iget-object p0, p0, Lz33;->d:Ljava/util/Map;

    .line 37
    .line 38
    iget-object p1, p1, Lz33;->d:Ljava/util/Map;

    .line 39
    .line 40
    invoke-static {p0, p1}, Lwe1;->r0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-direct/range {v1 .. v6}, Lz33;-><init>(Luh0;Lt11;Lcd2;ZLjava/util/Map;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1}, Lph0;-><init>(Lz33;)V

    .line 49
    .line 50
    .line 51
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lph0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lph0;

    .line 6
    .line 7
    iget-object p1, p1, Lph0;->a:Lz33;

    .line 8
    .line 9
    iget-object p0, p0, Lph0;->a:Lz33;

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Lz33;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lph0;->a:Lz33;

    .line 2
    .line 3
    invoke-virtual {p0}, Lz33;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lph0;->b:Lph0;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lph0;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string p0, "ExitTransition.None"

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object v0, Lph0;->c:Lph0;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lph0;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const-string p0, "ExitTransition.KeepUntilTransitionsFinished"

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v1, "ExitTransition: \nFade - "

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lph0;->a:Lz33;

    .line 31
    .line 32
    iget-object v1, p0, Lz33;->a:Luh0;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    invoke-virtual {v1}, Luh0;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    move-object v1, v2

    .line 43
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, ",\nSlide - null,\nShrink - "

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, ",\nScale - "

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lz33;->b:Lcd2;

    .line 60
    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    invoke-virtual {v1}, Lcd2;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    :cond_3
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, ",\nKeepUntilTransitionsFinished - "

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-boolean p0, p0, Lz33;->c:Z

    .line 76
    .line 77
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0
.end method
