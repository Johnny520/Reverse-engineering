.class public final Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lorg/apache/commons/lang3/time/飘花落叶言子世楪苏兰哲;


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Ljava/lang/String;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/lang/String;

.field public final 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/Locale;


# direct methods
.method public constructor <init>(ILjava/util/TimeZone;Ljava/util/Locale;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Lorg/apache/commons/lang3/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    move-object v0, p3

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    iput-object v0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰:Ljava/util/Locale;

    .line 15
    .line 16
    iput p1, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-static {p2, v0, p1, p3}, Lorg/apache/commons/lang3/time/FastDatePrinter;->getTimeZoneDisplay(Ljava/util/TimeZone;ZILjava/util/Locale;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-static {p2, v0, p1, p3}, Lorg/apache/commons/lang3/time/FastDatePrinter;->getTimeZoneDisplay(Ljava/util/TimeZone;ZILjava/util/Locale;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Ljava/util/Calendar;Ljava/lang/Appendable;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x10

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    iget v1, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 17
    .line 18
    iget-object p0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰:Ljava/util/Locale;

    .line 19
    .line 20
    invoke-static {v0, p1, v1, p0}, Lorg/apache/commons/lang3/time/FastDatePrinter;->getTimeZoneDisplay(Ljava/util/TimeZone;ZILjava/util/Locale;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {p2, p0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()I
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object p0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method
