.class public abstract LJ0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LJ0/d;

.field public static b:LJ0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LJ0/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, LJ0/d;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    sput-object v0, LJ0/e;->a:LJ0/d;

    return-void
.end method
