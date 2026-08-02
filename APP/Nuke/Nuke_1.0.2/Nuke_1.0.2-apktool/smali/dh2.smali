.class public abstract Ldh2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    const-string v9, "nuke:messaging"

    .line 2
    .line 3
    const-string v10, "nuke:host"

    .line 4
    .line 5
    const-string v0, "nuke:runtime"

    .line 6
    .line 7
    const-string v1, "nuke:log"

    .line 8
    .line 9
    const-string v2, "nuke:timers"

    .line 10
    .line 11
    const-string v3, "nuke:encoding"

    .line 12
    .line 13
    const-string v4, "nuke:crypto"

    .line 14
    .line 15
    const-string v5, "nuke:fs"

    .line 16
    .line 17
    const-string v6, "nuke:http"

    .line 18
    .line 19
    const-string v7, "nuke:config"

    .line 20
    .line 21
    const-string v8, "nuke:ui"

    .line 22
    .line 23
    filled-new-array/range {v0 .. v10}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Ldh2;->a:Ljava/util/Set;

    .line 32
    .line 33
    return-void
.end method
