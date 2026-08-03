.class public LYue/ۥۡۡۡ;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۡۡ$ۥ;
    }
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟:Ljava/lang/String;


# instance fields
.field public ۥ:LYue/ۥۡۡۡ$ۥ;

.field public ۥ۟:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x22f

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LYue/ۥۡۡۡ;->ۥ۟:Ljava/util/HashMap;

    new-instance v0, LYue/ۥۡۡۡ$ۥ;

    invoke-direct {v0}, LYue/ۥۡۡۡ$ۥ;-><init>()V

    iput-object v0, p0, LYue/ۥۡۡۡ;->ۥ:LYue/ۥۡۡۡ$ۥ;

    new-instance v0, LYue/ۥۡۡۡ$ۥ;

    invoke-direct {v0}, LYue/ۥۡۡۡ$ۥ;-><init>()V

    iput-object v0, p0, LYue/ۥۡۡۡ;->ۥ:LYue/ۥۡۡۡ$ۥ;

    invoke-static {v0, p1}, LYue/ۥۡۡۡ$ۥ;->ۥ۟(LYue/ۥۡۡۡ$ۥ;Ljava/lang/Class;)Ljava/lang/Class;

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native ۥ۟۟(Ljava/lang/Class;)LYue/ۥۡۡۡ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "LYue/\u06e5\u06e1\u06e1\u06e1;"
        }
    .end annotation
.end method

.method public static native ۥ۟۟۟(Ljava/lang/Object;)LYue/ۥۡۡۡ;
.end method


# virtual methods
.method public varargs native ۥ(Ljava/lang/ClassLoader;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public varargs native ۥ۟(Ljava/lang/ClassLoader;ILjava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public native ۥ۟۟۟۟(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;
.end method

.method public native ۥ۟۟۟۠(Ljava/lang/ClassLoader;I)Ljava/lang/reflect/Method;
.end method

.method public native ۥ۟۟۟ۡ(Ljava/lang/String;)LYue/ۥۡۡۡ;
.end method

.method public varargs native ۥ۟۟۟ۢ([Ljava/lang/Class;)LYue/ۥۡۡۡ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)",
            "LYue/\u06e5\u06e1\u06e1\u06e1;"
        }
    .end annotation
.end method

.method public native ۥۣ۟۟۟(I)LYue/ۥۡۡۡ;
.end method

.method public native ۥ۟۟۟ۤ(Ljava/lang/Class;)LYue/ۥۡۡۡ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "LYue/\u06e5\u06e1\u06e1\u06e1;"
        }
    .end annotation
.end method
