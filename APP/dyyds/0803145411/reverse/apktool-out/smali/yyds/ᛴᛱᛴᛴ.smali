.class public final Lyyds/ᛴᛱᛴᛴ;
.super Ljava/lang/Object;


# instance fields
.field public ᛲᲈᲁ:I

.field public final ᛵᛸᛸᛷ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xb3

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lyyds/ᛴᛱᛴᛴ;->ᛲᲈᲁ:I

    .line 5
    .line 6
    iput-boolean p2, p0, Lyyds/ᛴᛱᛴᛴ;->ᛵᛸᛸᛷ:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final native equals(Ljava/lang/Object;)Z
.end method

.method public final native hashCode()I
.end method

.method public final native toString()Ljava/lang/String;
.end method
