.class public final La/gd$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/gd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;
    .locals 8

    sget-object v5, La/dd;->a:La/dd;

    and-int/lit8 v0, p4, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object v6, p2

    :goto_0
    and-int/lit8 p2, p4, 0x10

    if-eqz p2, :cond_1

    move-object v7, v1

    goto :goto_1

    :cond_1
    move-object v7, p3

    :goto_1
    const-string p2, "clazz"

    invoke-static {p0, p2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La/gd;

    const/4 v1, 0x1

    const/4 v3, 0x0

    move-object v2, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v7}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    return-object v0
.end method
