.class public final Lyyds/ᛵᛴᲈᲈ;
.super Ljava/io/FilterOutputStream;


# instance fields
.field public ᛲᛴᛳᛲ:J

.field public final ᲀᛲᛳᲀ:J

.field public final ᲇᲈᛵᛷ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xc8

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;JLjava/lang/String;)V
    .locals 2

    .line 1
    const-wide v0, -0x9eb4e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x9ebbe68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 18
    .line 19
    .line 20
    iput-wide p2, p0, Lyyds/ᛵᛴᲈᲈ;->ᲀᛲᛳᲀ:J

    .line 21
    .line 22
    iput-object p4, p0, Lyyds/ᛵᛴᲈᲈ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final native write(I)V
.end method

.method public final native write([BII)V
.end method

.method public final native ᛲᲈᲁ(J)V
.end method
