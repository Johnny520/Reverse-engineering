.class public final LYue/ۥ۠۠ۢۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥ۠ۦۡ۠;
    name = "DurationConversionsJDK8Kt"
.end annotation

.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nDurationConversions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n+ 2 Duration.kt\nkotlin/time/Duration\n*L\n1#1,33:1\n731#2,2:34\n*S KotlinDebug\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n*L\n33#1:34,2\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDurationConversions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n+ 2 Duration.kt\nkotlin/time/Duration\n*L\n1#1,33:1\n731#2,2:34\n*S KotlinDebug\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n*L\n33#1:34,2\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(J)Ljava/time/Duration;
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.6"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۡ;
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۠۠ۢۥ;->ۥۣ۟۟ۢ(J)J

    move-result-wide v0

    invoke-static {p0, p1}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟ۢۧ(J)I

    move-result p0

    int-to-long p0, p0

    invoke-static {v0, v1, p0, p1}, Ljava/time/Duration;->ofSeconds(JJ)Ljava/time/Duration;

    move-result-object p0

    const-string p1, "toJavaDuration-LRDsOJo"

    invoke-static {p0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final ۥ۟(Ljava/time/Duration;)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.6"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۡ;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/time/Duration;->getSeconds()J

    move-result-wide v0

    sget-object v2, LYue/ۥۣ۠۠;->ۥ۟۟۠ۧ:LYue/ۥۣ۠۠;

    invoke-static {v0, v1, v2}, LYue/ۥ۠۠ۢۨ;->ۥ۟۟ۤۥ(JLYue/ۥۣ۠۠;)J

    move-result-wide v0

    invoke-virtual {p0}, Ljava/time/Duration;->getNano()I

    move-result p0

    sget-object v2, LYue/ۥۣ۠۠;->ۥ۟۟۠ۤ:LYue/ۥۣ۠۠;

    invoke-static {p0, v2}, LYue/ۥ۠۠ۢۨ;->ۥ۟۟ۤۤ(ILYue/ۥۣ۠۠;)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟ۤ۟(JJ)J

    move-result-wide v0

    return-wide v0
.end method
