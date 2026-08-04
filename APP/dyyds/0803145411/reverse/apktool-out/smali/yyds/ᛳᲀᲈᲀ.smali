.class public final Lyyds/ᛳᲀᲈᲀ;
.super Ljava/lang/ClassLoader;


# static fields
.field public static final synthetic ᲇᲈᛵᛷ:I


# instance fields
.field public final ᛲᲈᲁ:Ljava/lang/ClassLoader;

.field public final ᛵᛸᛸᛷ:Ljava/lang/ClassLoader;

.field public final ᲀᛲᛳᲀ:Ljava/lang/ClassLoader;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xc2

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;Ljava/lang/ClassLoader;)V
    .locals 2

    .line 1
    const-wide v0, -0x4056de68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x40572e68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/ClassLoader;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lyyds/ᛳᲀᲈᲀ;->ᛲᲈᲁ:Ljava/lang/ClassLoader;

    .line 21
    .line 22
    iput-object p2, p0, Lyyds/ᛳᲀᲈᲀ;->ᛵᛸᛸᛷ:Ljava/lang/ClassLoader;

    .line 23
    .line 24
    const-class p1, Landroid/content/Context;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lyyds/ᛳᲀᲈᲀ;->ᲀᛲᛳᲀ:Ljava/lang/ClassLoader;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final native getResource(Ljava/lang/String;)Ljava/net/URL;
.end method

.method public final native loadClass(Ljava/lang/String;Z)Ljava/lang/Class;
.end method
