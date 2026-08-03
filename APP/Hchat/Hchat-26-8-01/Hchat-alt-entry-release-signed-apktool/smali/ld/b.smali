.class public final Lld/b;
.super Lig/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const-string v4, "androidx.core.os.*"

    .line 2
    .line 3
    const-string v5, "androidx.annotation.Px"

    .line 4
    .line 5
    const-string v0, "android.support.v4.*"

    .line 6
    .line 7
    const-string v1, "android.support.v7.*"

    .line 8
    .line 9
    const-string v2, "android.support.v4.os.*"

    .line 10
    .line 11
    const-string v3, "android.support.annotation.Px"

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lld/b;->a:Ljava/util/List;

    .line 22
    .line 23
    const-string v1, " "

    .line 24
    .line 25
    invoke-static {v0, v1}, Lxe/s;->j(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    return-void
.end method
