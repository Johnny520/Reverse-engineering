.class public final Lyyds/ᛴᲁᛳᲁ;
.super Lyyds/ᛸᲀᛷᛱ;

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public final synthetic ᛱᲈᲁ:J

.field public final synthetic ᛶᛷᛲᲁ:Landroid/app/Activity;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x47

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;JLyyds/ᛲᛱᛶᛸ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛴᲁᛳᲁ;->ᛶᛷᛲᲁ:Landroid/app/Activity;

    .line 2
    .line 3
    iput-wide p2, p0, Lyyds/ᛴᲁᛳᲁ;->ᛱᲈᲁ:J

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p4}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final native ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final native ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
.end method

.method public final native ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method
