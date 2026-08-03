.class public final La/sb;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/sb$a;
    }
.end annotation


# static fields
.field public static final a:La/sb$a;

.field public static b:La/sb$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La/sb$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, La/sb$a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    sput-object v0, La/sb;->a:La/sb$a;

    return-void
.end method
