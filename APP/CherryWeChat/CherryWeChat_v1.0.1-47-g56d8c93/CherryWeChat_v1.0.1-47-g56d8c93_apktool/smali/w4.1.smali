.class public final Lw4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lzw;
.implements LXt;
.implements Lfu;


# static fields
.field public static volatile e:Lw4;

.field public static final f:Ljava/lang/Object;

.field public static g:Lw4;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lw4;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lw4;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LZt;LYg;LPg;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, Lw4;->a:I

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lw4;->d:Ljava/lang/Object;

    .line 51
    iput-object p2, p0, Lw4;->b:Ljava/lang/Object;

    .line 52
    iput-object p3, p0, Lw4;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lw4;->a:I

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lw4;->d:Ljava/lang/Object;

    .line 32
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lw4;->c:Ljava/lang/Object;

    .line 33
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lw4;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 1

    const/16 v0, 0x17

    iput v0, p0, Lw4;->a:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lw4;->d:Ljava/lang/Object;

    .line 19
    iput-object p2, p0, Lw4;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/location/LocationManager;)V
    .locals 1

    const/16 v0, 0x18

    iput v0, p0, Lw4;->a:I

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, LSB;

    .line 26
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object v0, p0, Lw4;->c:Ljava/lang/Object;

    .line 28
    iput-object p1, p0, Lw4;->d:Ljava/lang/Object;

    .line 29
    iput-object p2, p0, Lw4;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/os/ParcelFileDescriptor;Ljava/util/ArrayList;Lzp;)V
    .locals 1

    const/16 v0, 0x11

    iput v0, p0, Lw4;->a:I

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    const-string v0, "Argument must not be null"

    invoke-static {v0, p3}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 65
    iput-object p3, p0, Lw4;->b:Ljava/lang/Object;

    .line 66
    invoke-static {v0, p2}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 67
    iput-object p2, p0, Lw4;->c:Ljava/lang/Object;

    .line 68
    new-instance p2, Lcom/bumptech/glide/load/data/a;

    invoke-direct {p2, p1}, Lcom/bumptech/glide/load/data/a;-><init>(Landroid/os/ParcelFileDescriptor;)V

    iput-object p2, p0, Lw4;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcg;Lty;Lig;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Lw4;->a:I

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw4;->d:Ljava/lang/Object;

    .line 70
    iput-object p2, p0, Lw4;->c:Ljava/lang/Object;

    .line 71
    iput-object p3, p0, Lw4;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lw4;->a:I

    iput-object p1, p0, Lw4;->b:Ljava/lang/Object;

    iput-object p2, p0, Lw4;->c:Ljava/lang/Object;

    iput-object p3, p0, Lw4;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, Lw4;->a:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lw4;->d:Ljava/lang/Object;

    .line 22
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lw4;->b:Ljava/lang/Object;

    .line 23
    iput-object p1, p0, Lw4;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ConcurrentMap;Lsu;Les;Ljava/lang/Class;)V
    .locals 0

    const/16 p4, 0x16

    iput p4, p0, Lw4;->a:I

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Lw4;->b:Ljava/lang/Object;

    .line 61
    iput-object p2, p0, Lw4;->c:Ljava/lang/Object;

    .line 62
    iput-object p3, p0, Lw4;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lnn;Ljava/util/List;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, Lw4;->a:I

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p1, p0, Lw4;->b:Ljava/lang/Object;

    .line 74
    iput-object p2, p0, Lw4;->c:Ljava/lang/Object;

    .line 75
    sget-object p1, Les;->b:Les;

    iput-object p1, p0, Lw4;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lqs;Lm6;LRc;Ljava/util/Set;)V
    .locals 7

    const/16 v0, 0xb

    iput v0, p0, Lw4;->a:I

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p2, p0, Lw4;->b:Ljava/lang/Object;

    .line 42
    iput-object p1, p0, Lw4;->c:Ljava/lang/Object;

    .line 43
    iput-object p3, p0, Lw4;->d:Ljava/lang/Object;

    .line 44
    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    .line 45
    :cond_0
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [I

    .line 46
    new-instance v1, Ljava/lang/String;

    const/4 p3, 0x0

    array-length p4, p2

    invoke-direct {v1, p2, p3, p4}, Ljava/lang/String;-><init>([III)V

    .line 47
    new-instance v6, Lv1;

    const/16 p2, 0x9

    invoke-direct {v6, v1, p2}, Lv1;-><init>(Ljava/lang/String;I)V

    .line 48
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v2, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lw4;->C(Ljava/lang/CharSequence;IIIZLzf;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public constructor <init>(Lsb;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lw4;->a:I

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lw4;->b:Ljava/lang/Object;

    .line 36
    new-instance v0, LE5;

    .line 37
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object v0, p0, Lw4;->c:Ljava/lang/Object;

    .line 39
    iput-object p1, p0, Lw4;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lvq;Ljava/util/ArrayList;Lzp;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, Lw4;->a:I

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    const-string v0, "Argument must not be null"

    invoke-static {v0, p3}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 55
    iput-object p3, p0, Lw4;->c:Ljava/lang/Object;

    .line 56
    invoke-static {v0, p2}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 57
    iput-object p2, p0, Lw4;->d:Ljava/lang/Object;

    .line 58
    new-instance p2, LD2;

    invoke-direct {p2, p1, p3}, LD2;-><init>(Ljava/io/InputStream;Lzp;)V

    iput-object p2, p0, Lw4;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 3

    const/16 v0, 0x15

    iput v0, p0, Lw4;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    array-length v0, p1

    invoke-static {v0}, LCD;->a(I)V

    .line 5
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, p1, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    iput-object v0, p0, Lw4;->b:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 6
    invoke-static {p1}, Lph;->b(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 7
    sget-object v1, Leg;->b:Leg;

    const-string v2, "AES/ECB/NoPadding"

    .line 8
    iget-object v1, v1, Leg;->a:Ldg;

    .line 9
    invoke-virtual {v1, v2}, Ldg;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 10
    check-cast v1, Ljavax/crypto/Cipher;

    .line 11
    invoke-virtual {v1, p1, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    const/16 p1, 0x10

    .line 12
    new-array p1, p1, [B

    .line 13
    invoke-virtual {v1, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    .line 14
    invoke-static {p1}, Lcr;->u([B)[B

    move-result-object p1

    iput-object p1, p0, Lw4;->c:Ljava/lang/Object;

    .line 15
    invoke-static {p1}, Lcr;->u([B)[B

    move-result-object p1

    iput-object p1, p0, Lw4;->d:Ljava/lang/Object;

    return-void

    .line 16
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use AES-CMAC in FIPS-mode."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static A(Landroid/content/Context;Landroid/util/AttributeSet;[II)Lw4;
    .locals 2

    new-instance v0, Lw4;

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lw4;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    return-object v0
.end method

.method public static final D(LD2;LW1;)Lw4;
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [B

    iget-object p0, p0, LD2;->b:Ljava/lang/Object;

    check-cast p0, Ljava/io/ByteArrayInputStream;

    :try_start_0
    invoke-static {}, LTg;->a()LTg;

    move-result-object v1

    invoke-static {p0, v1}, LUf;->A(Ljava/io/ByteArrayInputStream;LTg;)LUf;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    invoke-virtual {v1}, LUf;->y()Ly6;

    move-result-object p0

    invoke-virtual {p0}, Ly6;->size()I

    move-result p0

    const-string v2, "empty keyset"

    if-eqz p0, :cond_1

    :try_start_1
    invoke-virtual {v1}, LUf;->y()Ly6;

    move-result-object p0

    invoke-virtual {p0}, Ly6;->g()[B

    move-result-object p0

    invoke-virtual {p1, p0, v0}, LW1;->b([B[B)[B

    move-result-object p0

    invoke-static {}, LTg;->a()LTg;

    move-result-object p1

    invoke-static {p0, p1}, Lnn;->E([BLTg;)Lnn;

    move-result-object p0

    invoke-virtual {p0}, Lnn;->z()I

    move-result p1
    :try_end_1
    .catch LPl; {:try_start_1 .. :try_end_1} :catch_0

    if-lez p1, :cond_0

    invoke-static {p0}, Lw4;->o(Lnn;)Lw4;

    move-result-object p0

    return-object p0

    :cond_0
    :try_start_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_2
    .catch LPl; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "invalid keyset, corrupted key material"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    throw p1
.end method

.method private final I()V
    .locals 0

    return-void
.end method

.method private final J()V
    .locals 0

    return-void
.end method

.method public static l(Landroid/text/Editable;Landroid/view/KeyEvent;Z)Z
    .locals 6

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    move-result p1

    invoke-static {p1}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result p1

    invoke-static {p0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v1

    const/4 v2, -0x1

    if-eq p1, v2, :cond_6

    if-eq v1, v2, :cond_6

    if-eq p1, v1, :cond_1

    goto :goto_1

    :cond_1
    const-class v2, LZB;

    invoke-interface {p0, p1, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [LZB;

    if-eqz v1, :cond_6

    array-length v2, v1

    if-lez v2, :cond_6

    array-length v2, v1

    move v3, v0

    :goto_0
    if-ge v3, v2, :cond_6

    aget-object v4, v1, v3

    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v5

    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v4

    if-eqz p2, :cond_2

    if-eq v5, p1, :cond_4

    :cond_2
    if-nez p2, :cond_3

    if-eq v4, p1, :cond_4

    :cond_3
    if-le p1, v5, :cond_5

    if-ge p1, v4, :cond_5

    :cond_4
    invoke-interface {p0, v5, v4}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    const/4 p0, 0x1

    return p0

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_6
    :goto_1
    return v0
.end method

.method public static final o(Lnn;)Lw4;
    .locals 9

    invoke-virtual {p0}, Lnn;->z()I

    move-result v0

    if-lez v0, :cond_4

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lnn;->z()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, Lnn;->A()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmn;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Lmn;->B()I

    move-result v3

    invoke-virtual {v2}, Lmn;->C()Lyt;

    move-result-object v4

    sget-object v5, Lyt;->e:Lyt;

    const/4 v6, 0x0

    if-ne v4, v5, :cond_0

    move-object v3, v6

    goto :goto_1

    :cond_0
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :goto_1
    :try_start_0
    invoke-virtual {v2}, Lmn;->A()LVm;

    move-result-object v4

    invoke-virtual {v4}, LVm;->B()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lmn;->A()LVm;

    move-result-object v5

    invoke-virtual {v5}, LVm;->C()Ly6;

    move-result-object v5

    invoke-virtual {v2}, Lmn;->A()LVm;

    move-result-object v7

    invoke-virtual {v7}, LVm;->A()LUm;

    move-result-object v7

    invoke-virtual {v2}, Lmn;->C()Lyt;

    move-result-object v8

    invoke-static {v4, v5, v7, v8, v3}, LFu;->d(Ljava/lang/String;Ly6;LUm;Lyt;Ljava/lang/Integer;)LFu;

    move-result-object v3
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    sget-object v4, Lzs;->b:Lzs;

    invoke-virtual {v4, v3}, Lzs;->a(LFu;)LTB;

    move-result-object v3

    new-instance v4, Lon;

    invoke-virtual {v2}, Lmn;->D()Lcn;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/4 v5, 0x1

    if-eq v2, v5, :cond_2

    const/4 v5, 0x2

    if-eq v2, v5, :cond_2

    const/4 v5, 0x3

    if-ne v2, v5, :cond_1

    goto :goto_2

    :cond_1
    new-instance v2, Ljava/security/GeneralSecurityException;

    const-string v3, "Unknown key status"

    invoke-direct {v2, v3}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_2
    :goto_2
    invoke-direct {v4, v3}, Lon;-><init>(LTB;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_1
    move-exception p0

    new-instance v0, LFa;

    const-string v1, "Creating a protokey serialization failed"

    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_3
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lw4;

    invoke-direct {v1, p0, v0}, Lw4;-><init>(Lnn;Ljava/util/List;)V

    return-object v1

    :cond_4
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "empty keyset"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static u(Landroid/content/Context;)Lw4;
    .locals 2

    sget-object v0, Lw4;->e:Lw4;

    if-nez v0, :cond_1

    sget-object v0, Lw4;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lw4;->e:Lw4;

    if-nez v1, :cond_0

    new-instance v1, Lw4;

    invoke-direct {v1, p0}, Lw4;-><init>(Landroid/content/Context;)V

    sput-object v1, Lw4;->e:Lw4;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_2
    sget-object p0, Lw4;->e:Lw4;

    return-object p0
.end method


# virtual methods
.method public B()Z
    .locals 2

    iget-object v0, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LEr;

    check-cast v1, Lsi;

    iget-object v1, v1, Lsi;->a:Lzi;

    invoke-virtual {v1}, Lzi;->o()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public C(Ljava/lang/CharSequence;IIIZLzf;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move/from16 v3, p4

    move-object/from16 v4, p6

    new-instance v5, LAf;

    iget-object v6, v0, Lw4;->c:Ljava/lang/Object;

    check-cast v6, Lqs;

    iget-object v6, v6, Lqs;->c:Ljava/lang/Object;

    check-cast v6, LQr;

    invoke-direct {v5, v6}, LAf;-><init>(LQr;)V

    invoke-static/range {p1 .. p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x1

    move v9, v6

    move v10, v7

    move v11, v8

    move/from16 v6, p2

    :cond_0
    :goto_0
    move v7, v6

    :goto_1
    const/4 v12, 0x2

    if-ge v6, v2, :cond_f

    if-ge v10, v3, :cond_f

    if-eqz v11, :cond_f

    iget-object v13, v5, LAf;->c:LQr;

    iget-object v13, v13, LQr;->a:Landroid/util/SparseArray;

    if-nez v13, :cond_1

    const/4 v13, 0x0

    goto :goto_2

    :cond_1
    invoke-virtual {v13, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LQr;

    :goto_2
    iget v14, v5, LAf;->a:I

    const/4 v15, 0x3

    if-eq v14, v12, :cond_3

    if-nez v13, :cond_2

    invoke-virtual {v5}, LAf;->a()V

    :goto_3
    move v13, v8

    goto :goto_6

    :cond_2
    iput v12, v5, LAf;->a:I

    iput-object v13, v5, LAf;->c:LQr;

    iput v8, v5, LAf;->f:I

    :goto_4
    move v13, v12

    goto :goto_6

    :cond_3
    if-eqz v13, :cond_4

    iput-object v13, v5, LAf;->c:LQr;

    iget v13, v5, LAf;->f:I

    add-int/2addr v13, v8

    iput v13, v5, LAf;->f:I

    goto :goto_4

    :cond_4
    const v13, 0xfe0e

    if-ne v9, v13, :cond_5

    invoke-virtual {v5}, LAf;->a()V

    goto :goto_3

    :cond_5
    const v13, 0xfe0f

    if-ne v9, v13, :cond_6

    goto :goto_4

    :cond_6
    iget-object v13, v5, LAf;->c:LQr;

    iget-object v14, v13, LQr;->b:LYB;

    if-eqz v14, :cond_9

    iget v14, v5, LAf;->f:I

    if-ne v14, v8, :cond_8

    invoke-virtual {v5}, LAf;->b()Z

    move-result v13

    if-eqz v13, :cond_7

    iget-object v13, v5, LAf;->c:LQr;

    iput-object v13, v5, LAf;->d:LQr;

    invoke-virtual {v5}, LAf;->a()V

    :goto_5
    move v13, v15

    goto :goto_6

    :cond_7
    invoke-virtual {v5}, LAf;->a()V

    goto :goto_3

    :cond_8
    iput-object v13, v5, LAf;->d:LQr;

    invoke-virtual {v5}, LAf;->a()V

    goto :goto_5

    :cond_9
    invoke-virtual {v5}, LAf;->a()V

    goto :goto_3

    :goto_6
    iput v9, v5, LAf;->e:I

    if-eq v13, v8, :cond_e

    if-eq v13, v12, :cond_c

    if-eq v13, v15, :cond_a

    goto :goto_1

    :cond_a
    if-nez p5, :cond_b

    iget-object v12, v5, LAf;->d:LQr;

    iget-object v12, v12, LQr;->b:LYB;

    invoke-virtual {v0, v1, v7, v6, v12}, Lw4;->x(Ljava/lang/CharSequence;IILYB;)Z

    move-result v12

    if-nez v12, :cond_0

    :cond_b
    iget-object v11, v5, LAf;->d:LQr;

    iget-object v11, v11, LQr;->b:LYB;

    invoke-interface {v4, v1, v7, v6, v11}, Lzf;->i(Ljava/lang/CharSequence;IILYB;)Z

    move-result v11

    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    :cond_c
    invoke-static {v9}, Ljava/lang/Character;->charCount(I)I

    move-result v12

    add-int/2addr v12, v6

    if-ge v12, v2, :cond_d

    invoke-static {v1, v12}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v6

    move v9, v6

    :cond_d
    move v6, v12

    goto/16 :goto_1

    :cond_e
    invoke-static {v1, v7}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    move-result v6

    add-int/2addr v6, v7

    if-ge v6, v2, :cond_0

    invoke-static {v1, v6}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v7

    move v9, v7

    goto/16 :goto_0

    :cond_f
    iget v2, v5, LAf;->a:I

    if-ne v2, v12, :cond_12

    iget-object v2, v5, LAf;->c:LQr;

    iget-object v2, v2, LQr;->b:LYB;

    if-eqz v2, :cond_12

    iget v2, v5, LAf;->f:I

    if-gt v2, v8, :cond_10

    invoke-virtual {v5}, LAf;->b()Z

    move-result v2

    if-eqz v2, :cond_12

    :cond_10
    if-ge v10, v3, :cond_12

    if-eqz v11, :cond_12

    if-nez p5, :cond_11

    iget-object v2, v5, LAf;->c:LQr;

    iget-object v2, v2, LQr;->b:LYB;

    invoke-virtual {v0, v1, v7, v6, v2}, Lw4;->x(Ljava/lang/CharSequence;IILYB;)Z

    move-result v2

    if-nez v2, :cond_12

    :cond_11
    iget-object v2, v5, LAf;->c:LQr;

    iget-object v2, v2, LQr;->b:LYB;

    invoke-interface {v4, v1, v7, v6, v2}, Lzf;->i(Ljava/lang/CharSequence;IILYB;)Z

    :cond_12
    invoke-interface {v4}, Lzf;->a()Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public E()V
    .locals 1

    iget-object v0, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public F(LEr;)V
    .locals 2

    iget-object v0, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lor;

    if-eqz p1, :cond_0

    iget-object v0, p1, Lor;->a:LRn;

    iget-object v1, p1, Lor;->b:LUn;

    invoke-virtual {v0, v1}, LRn;->b(LXn;)V

    const/4 v0, 0x0

    iput-object v0, p1, Lor;->b:LUn;

    :cond_0
    iget-object p1, p0, Lw4;->c:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public G(I)V
    .locals 2

    const/16 v0, 0x10

    if-eq p1, v0, :cond_1

    const/16 v0, 0x20

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    mul-int/lit8 p1, p1, 0x8

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Invalid key size %d; only 128-bit and 256-bit AES keys are supported"

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lw4;->b:Ljava/lang/Object;

    return-void
.end method

.method public H(Lsb;III)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p1, Lrb;->b0:I

    iget v1, p1, Lrb;->c0:I

    const/4 v2, 0x0

    iput v2, p1, Lrb;->b0:I

    iput v2, p1, Lrb;->c0:I

    invoke-virtual {p1, p3}, Lrb;->O(I)V

    invoke-virtual {p1, p4}, Lrb;->L(I)V

    if-gez v0, :cond_0

    iput v2, p1, Lrb;->b0:I

    goto :goto_0

    :cond_0
    iput v0, p1, Lrb;->b0:I

    :goto_0
    if-gez v1, :cond_1

    iput v2, p1, Lrb;->c0:I

    goto :goto_1

    :cond_1
    iput v1, p1, Lrb;->c0:I

    :goto_1
    iget-object p1, p0, Lw4;->d:Ljava/lang/Object;

    check-cast p1, Lsb;

    iput p2, p1, Lsb;->t0:I

    invoke-virtual {p1}, Lsb;->U()V

    return-void
.end method

.method public K(Lsb;)V
    .locals 9

    iget-object v0, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p1, Lsb;->q0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v4, 0x1

    if-ge v3, v1, :cond_2

    iget-object v5, p1, Lsb;->q0:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lrb;

    iget-object v6, v5, Lrb;->p0:[I

    aget v7, v6, v2

    const/4 v8, 0x3

    if-eq v7, v8, :cond_0

    aget v4, v6, v4

    if-ne v4, v8, :cond_1

    :cond_0
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p1, Lsb;->s0:Lud;

    iput-boolean v4, p1, Lud;->b:Z

    return-void
.end method

.method public a(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, LZg;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LZg;

    invoke-interface {v0}, LZg;->c()Lfz;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lfz;->a:Z

    :cond_0
    iget-object v0, p0, Lw4;->c:Ljava/lang/Object;

    check-cast v0, LPg;

    iget v0, v0, LPg;->a:I

    packed-switch v0, :pswitch_data_0

    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :pswitch_0
    iget-object v0, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v0, LZt;

    invoke-virtual {v0, p1}, LZt;->a(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public b(I[B)[B
    .locals 9

    const/16 v0, 0x10

    if-gt p1, v0, :cond_4

    const/4 v1, 0x1

    invoke-static {v1}, Lph;->b(I)Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v2, Leg;->b:Leg;

    const-string v3, "AES/ECB/NoPadding"

    iget-object v2, v2, Leg;->a:Ldg;

    invoke-virtual {v2, v3}, Ldg;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljavax/crypto/Cipher;

    iget-object v3, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v3, Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {v2, v1, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    array-length v3, p2

    int-to-double v3, v3

    const-wide/high16 v5, 0x4030000000000000L    # 16.0

    div-double/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v3, v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    mul-int/lit8 v4, v3, 0x10

    array-length v5, p2

    const/4 v6, 0x0

    if-ne v4, v5, :cond_0

    add-int/lit8 v4, v3, -0x1

    mul-int/2addr v4, v0

    iget-object v5, p0, Lw4;->c:Ljava/lang/Object;

    check-cast v5, [B

    invoke-static {p2, v4, v5, v6, v0}, LGu;->G([BI[BII)[B

    move-result-object v4

    goto :goto_0

    :cond_0
    add-int/lit8 v4, v3, -0x1

    mul-int/2addr v4, v0

    array-length v5, p2

    invoke-static {p2, v4, v5}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v4

    array-length v5, v4

    if-ge v5, v0, :cond_2

    invoke-static {v4, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v5

    array-length v4, v4

    const/16 v7, -0x80

    aput-byte v7, v5, v4

    iget-object v4, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v4, [B

    invoke-static {v5, v4}, LGu;->H([B[B)[B

    move-result-object v4

    :goto_0
    new-array v5, v0, [B

    move v7, v6

    :goto_1
    add-int/lit8 v8, v3, -0x1

    if-ge v7, v8, :cond_1

    mul-int/lit8 v8, v7, 0x10

    invoke-static {v5, v6, p2, v8, v0}, LGu;->G([BI[BII)[B

    move-result-object v5

    invoke-virtual {v2, v5}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v5

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_1
    invoke-static {v4, v5}, LGu;->H([B[B)[B

    move-result-object p2

    invoke-virtual {v2, p2}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p2

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "x must be smaller than a block."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Can not use AES-CMAC in FIPS-mode."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    const-string p2, "outputLength too large, max is 16 bytes"

    invoke-direct {p1, p2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v0, LZt;

    invoke-virtual {v0}, LZt;->c()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v0, LYg;

    invoke-interface {v0}, LYg;->g()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "FactoryPools"

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_0
    instance-of v1, v0, LZg;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, LZg;

    invoke-interface {v1}, LZg;->c()Lfz;

    move-result-object v1

    const/4 v2, 0x0

    iput-boolean v2, v1, Lfz;->a:Z

    :cond_1
    return-object v0
.end method

.method public d()Lo1;
    .locals 4

    iget-object v0, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v0, Lw1;

    if-eqz v0, :cond_9

    iget-object v1, p0, Lw4;->c:Ljava/lang/Object;

    check-cast v1, LXm;

    if-eqz v1, :cond_9

    iget v2, v0, Lw1;->l:I

    iget-object v1, v1, LXm;->b:Ljava/lang/Object;

    check-cast v1, Lz6;

    iget-object v1, v1, Lz6;->a:[B

    array-length v1, v1

    if-ne v2, v1, :cond_8

    iget-object v0, v0, Lw1;->n:Lv1;

    sget-object v1, Lv1;->f:Lv1;

    if-eq v0, v1, :cond_1

    iget-object v2, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    if-eq v0, v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    if-nez v2, :cond_7

    :goto_1
    const/4 v2, 0x0

    if-ne v0, v1, :cond_3

    new-array v0, v2, [B

    invoke-static {v0}, Lz6;->a([B)Lz6;

    move-result-object v0

    goto :goto_3

    :cond_3
    sget-object v1, Lv1;->e:Lv1;

    const/4 v3, 0x5

    if-eq v0, v1, :cond_6

    sget-object v1, Lv1;->d:Lv1;

    if-ne v0, v1, :cond_4

    goto :goto_2

    :cond_4
    sget-object v1, Lv1;->c:Lv1;

    if-ne v0, v1, :cond_5

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lz6;->a([B)Lz6;

    move-result-object v0

    goto :goto_3

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown AesCmacParametersParameters.Variant: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v2, Lw1;

    iget-object v2, v2, Lw1;->n:Lv1;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    :goto_2
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lz6;->a([B)Lz6;

    move-result-object v0

    :goto_3
    new-instance v1, Lo1;

    iget-object v2, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v2, Lw1;

    invoke-direct {v1, v2, v0}, Lo1;-><init>(Lw1;Lz6;)V

    return-object v1

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters and/or key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e()Lw1;
    .locals 4

    iget-object v0, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lw4;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v1, Lv1;

    if-eqz v1, :cond_0

    new-instance v1, Lw1;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Lw4;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v3, Lv1;

    invoke-direct {v1, v0, v2, v3}, Lw1;-><init>(IILv1;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "variant not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "tag size not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "key size not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public f()LP1;
    .locals 4

    iget-object v0, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v0, LS1;

    if-eqz v0, :cond_8

    iget-object v1, p0, Lw4;->c:Ljava/lang/Object;

    check-cast v1, LXm;

    if-eqz v1, :cond_8

    iget v2, v0, LS1;->l:I

    iget-object v1, v1, LXm;->b:Ljava/lang/Object;

    check-cast v1, Lz6;

    iget-object v1, v1, Lz6;->a:[B

    array-length v1, v1

    if-ne v2, v1, :cond_7

    iget-object v0, v0, LS1;->o:Lv1;

    sget-object v1, Lv1;->i:Lv1;

    if-eq v0, v1, :cond_1

    iget-object v2, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    if-eq v0, v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    if-nez v2, :cond_6

    :goto_1
    const/4 v2, 0x0

    if-ne v0, v1, :cond_3

    new-array v0, v2, [B

    invoke-static {v0}, Lz6;->a([B)Lz6;

    goto :goto_2

    :cond_3
    sget-object v1, Lv1;->h:Lv1;

    const/4 v3, 0x5

    if-ne v0, v1, :cond_4

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lz6;->a([B)Lz6;

    goto :goto_2

    :cond_4
    sget-object v1, Lv1;->g:Lv1;

    if-ne v0, v1, :cond_5

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lz6;->a([B)Lz6;

    :goto_2
    new-instance v0, LP1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown AesEaxParameters.Variant: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v2, LS1;

    iget-object v2, v2, LS1;->o:Lv1;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters and/or key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g()LZ1;
    .locals 4

    iget-object v0, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v0, Lc2;

    if-eqz v0, :cond_8

    iget-object v1, p0, Lw4;->c:Ljava/lang/Object;

    check-cast v1, LXm;

    if-eqz v1, :cond_8

    iget v2, v0, Lc2;->l:I

    iget-object v1, v1, LXm;->b:Ljava/lang/Object;

    check-cast v1, Lz6;

    iget-object v1, v1, Lz6;->a:[B

    array-length v1, v1

    if-ne v2, v1, :cond_7

    iget-object v0, v0, Lc2;->o:Lv1;

    sget-object v1, Lv1;->l:Lv1;

    if-eq v0, v1, :cond_1

    iget-object v2, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    if-eq v0, v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    if-nez v2, :cond_6

    :goto_1
    const/4 v2, 0x0

    if-ne v0, v1, :cond_3

    new-array v0, v2, [B

    invoke-static {v0}, Lz6;->a([B)Lz6;

    goto :goto_2

    :cond_3
    sget-object v1, Lv1;->k:Lv1;

    const/4 v3, 0x5

    if-ne v0, v1, :cond_4

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lz6;->a([B)Lz6;

    goto :goto_2

    :cond_4
    sget-object v1, Lv1;->j:Lv1;

    if-ne v0, v1, :cond_5

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lz6;->a([B)Lz6;

    :goto_2
    new-instance v0, LZ1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown AesGcmParameters.Variant: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v2, Lc2;

    iget-object v2, v2, Lc2;->o:Lv1;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters and/or key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h()Lh2;
    .locals 4

    iget-object v0, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v0, Lk2;

    if-eqz v0, :cond_8

    iget-object v1, p0, Lw4;->c:Ljava/lang/Object;

    check-cast v1, LXm;

    if-eqz v1, :cond_8

    iget v2, v0, Lk2;->l:I

    iget-object v1, v1, LXm;->b:Ljava/lang/Object;

    check-cast v1, Lz6;

    iget-object v1, v1, Lz6;->a:[B

    array-length v1, v1

    if-ne v2, v1, :cond_7

    iget-object v0, v0, Lk2;->m:Lv1;

    sget-object v1, Lv1;->o:Lv1;

    if-eq v0, v1, :cond_1

    iget-object v2, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    if-eq v0, v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    if-nez v2, :cond_6

    :goto_1
    const/4 v2, 0x0

    if-ne v0, v1, :cond_3

    new-array v0, v2, [B

    invoke-static {v0}, Lz6;->a([B)Lz6;

    goto :goto_2

    :cond_3
    sget-object v1, Lv1;->n:Lv1;

    const/4 v3, 0x5

    if-ne v0, v1, :cond_4

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lz6;->a([B)Lz6;

    goto :goto_2

    :cond_4
    sget-object v1, Lv1;->m:Lv1;

    if-ne v0, v1, :cond_5

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lz6;->a([B)Lz6;

    :goto_2
    new-instance v0, Lh2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown AesGcmSivParameters.Variant: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v2, Lk2;

    iget-object v2, v2, Lk2;->m:Lv1;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters and/or key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public i(Lpw;Lvt;)Lpw;
    .locals 2

    invoke-interface {p1}, Lpw;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v1, :cond_0

    iget-object p1, p0, Lw4;->c:Ljava/lang/Object;

    check-cast p1, LH5;

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v1, LN5;

    invoke-static {v1, v0}, LO5;->c(LN5;Landroid/graphics/Bitmap;)LO5;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, LH5;->i(Lpw;Lvt;)Lpw;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, v0, LAj;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v0, LPg;

    invoke-virtual {v0, p1, p2}, LPg;->i(Lpw;Lvt;)Lpw;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public j()LDk;
    .locals 4

    iget-object v0, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v0, LGk;

    if-eqz v0, :cond_9

    iget-object v1, p0, Lw4;->c:Ljava/lang/Object;

    check-cast v1, LXm;

    if-eqz v1, :cond_9

    iget v2, v0, LGk;->l:I

    iget-object v1, v1, LXm;->b:Ljava/lang/Object;

    check-cast v1, Lz6;

    iget-object v1, v1, Lz6;->a:[B

    array-length v1, v1

    if-ne v2, v1, :cond_8

    iget-object v0, v0, LGk;->n:Lv1;

    sget-object v1, Lv1;->A:Lv1;

    if-eq v0, v1, :cond_1

    iget-object v2, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    if-eq v0, v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    if-nez v2, :cond_7

    :goto_1
    const/4 v2, 0x0

    if-ne v0, v1, :cond_3

    new-array v0, v2, [B

    invoke-static {v0}, Lz6;->a([B)Lz6;

    move-result-object v0

    goto :goto_3

    :cond_3
    sget-object v1, Lv1;->z:Lv1;

    const/4 v3, 0x5

    if-eq v0, v1, :cond_6

    sget-object v1, Lv1;->y:Lv1;

    if-ne v0, v1, :cond_4

    goto :goto_2

    :cond_4
    sget-object v1, Lv1;->x:Lv1;

    if-ne v0, v1, :cond_5

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lz6;->a([B)Lz6;

    move-result-object v0

    goto :goto_3

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown HmacParameters.Variant: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v2, LGk;

    iget-object v2, v2, LGk;->n:Lv1;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    :goto_2
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lz6;->a([B)Lz6;

    move-result-object v0

    :goto_3
    new-instance v1, LDk;

    iget-object v2, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v2, LGk;

    invoke-direct {v1, v2, v0}, LDk;-><init>(LGk;Lz6;)V

    return-object v1

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters and/or key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public k(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 5

    iget v0, p0, Lw4;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v0, Lcom/bumptech/glide/load/data/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v2, 0x0

    const/16 v3, 0x22

    if-ne v1, v3, :cond_6

    const/4 v4, 0x0

    if-eq v1, v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    sget-object v3, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    if-eq v1, v3, :cond_1

    :goto_0
    move v1, v4

    goto :goto_1

    :cond_1
    sget-object v1, Lcr;->b:LBb;

    invoke-virtual {v1}, LBb;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_1
    if-eqz v1, :cond_6

    :try_start_0
    invoke-virtual {p0}, Lw4;->y()Z

    move-result v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move v1, v4

    :goto_2
    if-eqz v1, :cond_6

    iget-object v1, p1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    sget-object v3, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    if-ne v1, v3, :cond_2

    const/4 v4, 0x1

    :cond_2
    const-string v1, ""

    invoke-static {v1, v4}, LQj;->f(Ljava/lang/String;Z)V

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v1, p1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    :try_start_1
    invoke-static {v0, v2, p1}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v0, :cond_4

    if-eqz v0, :cond_3

    goto :goto_4

    :cond_3
    :goto_3
    iput-object v3, p1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    goto :goto_6

    :cond_4
    :try_start_2
    invoke-static {v0}, LfG;->l0(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_4
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_3

    :catchall_0
    move-exception v1

    move-object v2, v0

    goto :goto_5

    :catchall_1
    move-exception v1

    :goto_5
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    :cond_5
    sget-object v0, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    iput-object v0, p1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    throw v1

    :cond_6
    invoke-static {v0, v2, p1}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v2

    :goto_6
    return-object v2

    :pswitch_0
    iget-object v0, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v0, LD2;

    iget-object v0, v0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Ldv;

    invoke-virtual {v0}, Ldv;->reset()V

    invoke-static {v0, p1, p0}, LfG;->N(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;Lw4;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lt6;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v0

    new-instance v1, Lr6;

    invoke-direct {v1, v0}, Lr6;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-static {v1, p1, p0}, LfG;->N(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;Lw4;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public m(Landroid/os/Bundle;)V
    .locals 6

    iget-object v0, p0, Lw4;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashSet;

    iget-object v1, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    const v2, 0x5511001b

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    if-eqz p1, :cond_2

    :try_start_0
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const/4 v5, 0x0

    invoke-virtual {p1, v4, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const-class v5, Lol;

    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {p0, v0, v2}, Lw4;->n(Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :goto_2
    new-instance v0, LFa;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    return-void
.end method

.method public n(Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    const-string v1, "Cannot initialize "

    invoke-static {}, LOj;->F()Z

    move-result v2

    if-eqz v2, :cond_0

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LOj;->c(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_0
    :goto_0
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    :try_start_1
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lol;

    invoke-interface {v1}, Lol;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {p0, v3, p2}, Lw4;->n(Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_2
    iget-object v2, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    invoke-interface {v1, v2}, Lol;->b(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p2, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :goto_2
    :try_start_2
    new-instance p2, LFa;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-object v1

    :cond_4
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". Cycle detected."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
.end method

.method public p(I)Landroid/content/res/ColorStateList;
    .locals 3

    iget-object v0, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    invoke-static {v2, v1}, LGu;->o(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1
.end method

.method public q(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    iget-object v0, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lw4;->d:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, v1}, LfG;->U(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public r(I)Landroid/graphics/drawable/Drawable;
    .locals 4

    iget-object v0, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, LG3;->a()LG3;

    move-result-object v0

    iget-object v1, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, LG3;->a:Lyw;

    const/4 v3, 0x1

    invoke-virtual {v2, v1, p1, v3}, Lyw;->d(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public s(IILg4;)Landroid/graphics/Typeface;
    .locals 9

    iget-object v0, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lw4;->c:Ljava/lang/Object;

    check-cast p1, Landroid/util/TypedValue;

    if-nez p1, :cond_1

    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    iput-object p1, p0, Lw4;->c:Ljava/lang/Object;

    :cond_1
    iget-object p1, p0, Lw4;->d:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Landroid/content/Context;

    iget-object p1, p0, Lw4;->c:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Landroid/util/TypedValue;

    sget-object p1, LCw;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Landroid/content/Context;->isRestricted()Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x0

    return-object p1

    :cond_2
    const/4 v7, 0x1

    const/4 v8, 0x0

    move v5, p2

    move-object v6, p3

    invoke-static/range {v2 .. v8}, LCw;->a(Landroid/content/Context;ILandroid/util/TypedValue;ILNj;ZZ)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1
.end method

.method public t()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 10

    iget v0, p0, Lw4;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lw4;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v1, Lcom/bumptech/glide/load/data/a;

    iget-object v2, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v2, Lzp;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ldl;

    const/4 v6, 0x0

    :try_start_0
    new-instance v7, Ldv;

    new-instance v8, Ljava/io/FileInputStream;

    invoke-virtual {v1}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    move-result-object v9

    invoke-virtual {v9}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    invoke-direct {v7, v8, v2}, Ldv;-><init>(Ljava/io/InputStream;Lzp;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-interface {v5, v7}, Ldl;->f(Ljava/io/InputStream;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v7}, Ldv;->f()V

    invoke-virtual {v1}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    sget-object v6, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-eq v5, v6, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v6, v7

    goto :goto_1

    :catchall_1
    move-exception v0

    :goto_1
    if-eqz v6, :cond_1

    invoke-virtual {v6}, Ldv;->f()V

    :cond_1
    invoke-virtual {v1}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    throw v0

    :cond_2
    sget-object v5, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    :goto_2
    return-object v5

    :pswitch_0
    iget-object v0, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v1, LD2;

    iget-object v1, v1, LD2;->b:Ljava/lang/Object;

    check-cast v1, Ldv;

    invoke-virtual {v1}, Ldv;->reset()V

    iget-object v2, p0, Lw4;->c:Ljava/lang/Object;

    check-cast v2, Lzp;

    invoke-static {v0, v1, v2}, LfG;->W(Ljava/util/List;Ljava/io/InputStream;Lzp;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lw4;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v1, Ljava/nio/ByteBuffer;

    invoke-static {v1}, Lt6;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {v0, v1}, LfG;->X(Ljava/util/List;Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lw4;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v0, Lnn;

    invoke-static {v0}, LxD;->a(Lnn;)Lsn;

    move-result-object v0

    invoke-virtual {v0}, Lvj;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_0
    .end packed-switch
.end method

.method public v(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    sget-object v0, LOv;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :try_start_0
    sget-object v0, Lxs;->b:Lxs;

    invoke-virtual {v0, v2}, Lxs;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    goto :goto_0

    :catch_0
    const/4 v4, 0x0

    :goto_0
    const-string v5, "No wrapper found for "

    if-eqz v4, :cond_15

    iget-object v0, v1, Lw4;->c:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    iget-object v0, v1, Lw4;->b:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lnn;

    sget v0, LxD;->a:I

    invoke-virtual {v7}, Lnn;->B()I

    move-result v0

    invoke-virtual {v7}, Lnn;->A()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x1

    move v11, v9

    move v12, v11

    move v13, v10

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    sget-object v15, Lcn;->c:Lcn;

    if-eqz v14, :cond_7

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lmn;

    invoke-virtual {v14}, Lmn;->D()Lcn;

    move-result-object v3

    if-eq v3, v15, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v14}, Lmn;->E()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v14}, Lmn;->C()Lyt;

    move-result-object v3

    sget-object v15, Lyt;->b:Lyt;

    if-eq v3, v15, :cond_5

    invoke-virtual {v14}, Lmn;->D()Lcn;

    move-result-object v3

    sget-object v15, Lcn;->b:Lcn;

    if-eq v3, v15, :cond_4

    invoke-virtual {v14}, Lmn;->B()I

    move-result v3

    if-ne v3, v0, :cond_2

    if-nez v12, :cond_1

    move v12, v10

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v2, "keyset contains multiple primary keys"

    invoke-direct {v0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_2
    invoke-virtual {v14}, Lmn;->A()LVm;

    move-result-object v3

    invoke-virtual {v3}, LVm;->A()LUm;

    move-result-object v3

    sget-object v14, LUm;->e:LUm;

    if-eq v3, v14, :cond_3

    move v13, v9

    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {v14}, Lmn;->B()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "key %d has unknown status"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {v14}, Lmn;->B()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "key %d has unknown prefix"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {v14}, Lmn;->B()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "key %d has no key data"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    if-eqz v11, :cond_14

    if-nez v12, :cond_9

    if-eqz v13, :cond_8

    goto :goto_3

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v2, "keyset doesn\'t contain a valid primary key"

    invoke-direct {v0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    :goto_3
    new-instance v3, Lqs;

    const/4 v0, 0x7

    invoke-direct {v3, v0, v4}, Lqs;-><init>(ILjava/lang/Class;)V

    iget-object v0, v1, Lw4;->d:Ljava/lang/Object;

    check-cast v0, Les;

    iget-object v8, v3, Lqs;->b:Ljava/lang/Object;

    check-cast v8, Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v8, :cond_13

    iput-object v0, v3, Lqs;->d:Ljava/lang/Object;

    move v8, v9

    :goto_4
    invoke-virtual {v7}, Lnn;->z()I

    move-result v0

    if-ge v8, v0, :cond_f

    invoke-virtual {v7, v8}, Lnn;->y(I)Lmn;

    move-result-object v11

    invoke-virtual {v11}, Lmn;->D()Lcn;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    :try_start_1
    invoke-virtual {v11}, Lmn;->A()LVm;

    move-result-object v0

    sget-object v12, LOv;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, LVm;->B()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, LVm;->C()Ly6;

    move-result-object v0

    invoke-static {v12, v0, v4}, LOv;->c(Ljava/lang/String;Ly6;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_6

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v12

    const-string v13, "No key manager found for key type "

    invoke-virtual {v12, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_b

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v12

    const-string v13, " not supported by key manager of type "

    invoke-virtual {v12, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_a

    goto :goto_5

    :cond_a
    throw v0

    :cond_b
    :goto_5
    const/4 v0, 0x0

    :goto_6
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    if-eqz v12, :cond_c

    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lon;

    iget-object v12, v12, Lon;->a:LTB;

    :try_start_2
    invoke-static {v12, v4}, LOv;->b(LTB;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v12
    :try_end_2
    .catch Ljava/security/GeneralSecurityException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_7

    :catch_2
    :cond_c
    const/4 v12, 0x0

    :goto_7
    invoke-virtual {v11}, Lmn;->B()I

    move-result v13

    invoke-virtual {v7}, Lnn;->B()I

    move-result v14

    if-ne v13, v14, :cond_d

    invoke-virtual {v3, v12, v0, v11, v10}, Lqs;->e(Ljava/lang/Object;Ljava/lang/Object;Lmn;Z)V

    goto :goto_8

    :cond_d
    invoke-virtual {v3, v12, v0, v11, v9}, Lqs;->e(Ljava/lang/Object;Ljava/lang/Object;Lmn;Z)V

    :cond_e
    :goto_8
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_f
    iget-object v0, v3, Lqs;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_12

    new-instance v4, Lw4;

    iget-object v6, v3, Lqs;->c:Ljava/lang/Object;

    check-cast v6, Lsu;

    iget-object v7, v3, Lqs;->d:Ljava/lang/Object;

    check-cast v7, Les;

    iget-object v8, v3, Lqs;->a:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Class;

    invoke-direct {v4, v0, v6, v7, v8}, Lw4;-><init>(Ljava/util/concurrent/ConcurrentMap;Lsu;Les;Ljava/lang/Class;)V

    const/4 v6, 0x0

    iput-object v6, v3, Lqs;->b:Ljava/lang/Object;

    sget-object v0, LOv;->a:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Lxs;->b:Lxs;

    iget-object v0, v0, Lxs;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqu;

    iget-object v0, v0, Lqu;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luu;

    invoke-interface {v0}, Luu;->a()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface {v0}, Luu;->a()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface {v0, v4}, Luu;->b(Lw4;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_10
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v2, "Input primitive type of the wrapper doesn\'t match the type of primitives in the provided PrimitiveSet"

    invoke-direct {v0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "build cannot be called twice"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "setAnnotations cannot be called after build"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v2, "keyset must contain at least one ENABLED key"

    invoke-direct {v0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public w([B)Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ConcurrentMap;

    new-instance v1, Ltu;

    invoke-direct {v1, p1}, Ltu;-><init>([B)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public x(Ljava/lang/CharSequence;IILYB;)Z
    .locals 7

    iget v0, p4, LYB;->c:I

    and-int/lit8 v0, v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_4

    iget-object v0, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v0, Lmf;

    invoke-virtual {p4}, LYB;->b()LOr;

    move-result-object v4

    const/16 v5, 0x8

    invoke-virtual {v4, v5}, Lnq;->a(I)I

    move-result v5

    if-eqz v5, :cond_0

    iget-object v6, v4, Lnq;->d:Ljava/lang/Object;

    check-cast v6, Ljava/nio/ByteBuffer;

    iget v4, v4, Lnq;->a:I

    add-int/2addr v5, v4

    invoke-virtual {v6, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    :cond_0
    check-cast v0, LRc;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, LRc;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v5}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    :goto_0
    if-ge p2, p3, :cond_2

    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, v0, LRc;->a:Landroid/text/TextPaint;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget p3, LDt;->a:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->hasGlyph(Ljava/lang/String;)Z

    move-result p1

    iget p2, p4, LYB;->c:I

    and-int/lit8 p2, p2, 0x4

    if-eqz p1, :cond_3

    or-int/lit8 p1, p2, 0x2

    goto :goto_1

    :cond_3
    or-int/lit8 p1, p2, 0x1

    :goto_1
    iput p1, p4, LYB;->c:I

    :cond_4
    iget p1, p4, LYB;->c:I

    and-int/lit8 p1, p1, 0x3

    if-ne p1, v1, :cond_5

    return v3

    :cond_5
    return v2
.end method

.method public y()Z
    .locals 11

    iget v0, p0, Lw4;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lw4;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v1, Lcom/bumptech/glide/load/data/a;

    iget-object v2, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v2, Lzp;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_2

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ldl;

    const/4 v7, 0x0

    :try_start_0
    new-instance v8, Ldv;

    new-instance v9, Ljava/io/FileInputStream;

    invoke-virtual {v1}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    move-result-object v10

    invoke-virtual {v10}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v10

    invoke-direct {v9, v10}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    invoke-direct {v8, v9, v2}, Ldv;-><init>(Ljava/io/InputStream;Lzp;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-interface {v6, v8, v2}, Ldl;->e(Ljava/io/InputStream;Lzp;)Z

    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v8}, Ldv;->f()V

    invoke-virtual {v1}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    if-eqz v6, :cond_0

    const/4 v4, 0x1

    goto :goto_2

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v7, v8

    goto :goto_1

    :catchall_1
    move-exception v0

    :goto_1
    if-eqz v7, :cond_1

    invoke-virtual {v7}, Ldv;->f()V

    :cond_1
    invoke-virtual {v1}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    throw v0

    :cond_2
    :goto_2
    return v4

    :pswitch_0
    iget-object v0, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v1, LD2;

    iget-object v1, v1, LD2;->b:Ljava/lang/Object;

    check-cast v1, Ldv;

    invoke-virtual {v1}, Ldv;->reset()V

    iget-object v2, p0, Lw4;->c:Ljava/lang/Object;

    check-cast v2, Lzp;

    const/high16 v3, 0x500000

    invoke-virtual {v1, v3}, Ldv;->mark(I)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_3
    if-ge v5, v3, :cond_4

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ldl;

    :try_start_2
    invoke-interface {v6, v1, v2}, Ldl;->e(Ljava/io/InputStream;Lzp;)Z

    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {v1}, Ldv;->reset()V

    if-eqz v6, :cond_3

    const/4 v4, 0x1

    goto :goto_4

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :catchall_2
    move-exception v0

    invoke-virtual {v1}, Ldv;->reset()V

    throw v0

    :cond_4
    :goto_4
    return v4

    :pswitch_1
    iget-object v0, p0, Lw4;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lw4;->b:Ljava/lang/Object;

    check-cast v1, Ljava/nio/ByteBuffer;

    invoke-static {v1}, Lt6;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget-object v2, p0, Lw4;->d:Ljava/lang/Object;

    check-cast v2, Lzp;

    const/4 v3, 0x0

    if-nez v1, :cond_5

    goto :goto_6

    :cond_5
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    move v5, v3

    :goto_5
    if-ge v5, v4, :cond_7

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ldl;

    :try_start_3
    invoke-interface {v6, v1, v2}, Ldl;->c(Ljava/nio/ByteBuffer;Lzp;)Z

    move-result v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v7

    check-cast v7, Ljava/nio/ByteBuffer;

    if-eqz v6, :cond_6

    const/4 v3, 0x1

    goto :goto_6

    :cond_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :catchall_3
    move-exception v0

    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v1

    check-cast v1, Ljava/nio/ByteBuffer;

    throw v0

    :cond_7
    :goto_6
    return v3

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public z(ILhb;Lrb;)Z
    .locals 6

    iget-object v0, p0, Lw4;->c:Ljava/lang/Object;

    check-cast v0, LE5;

    iget-object v1, p3, Lrb;->p0:[I

    iget-object v2, p3, Lrb;->t:[I

    const/4 v3, 0x0

    aget v4, v1, v3

    iput v4, v0, LE5;->a:I

    const/4 v4, 0x1

    aget v1, v1, v4

    iput v1, v0, LE5;->b:I

    invoke-virtual {p3}, Lrb;->q()I

    move-result v1

    iput v1, v0, LE5;->c:I

    invoke-virtual {p3}, Lrb;->k()I

    move-result v1

    iput v1, v0, LE5;->d:I

    iput-boolean v3, v0, LE5;->i:Z

    iput p1, v0, LE5;->j:I

    iget p1, v0, LE5;->a:I

    const/4 v1, 0x3

    if-ne p1, v1, :cond_0

    move p1, v4

    goto :goto_0

    :cond_0
    move p1, v3

    :goto_0
    iget v5, v0, LE5;->b:I

    if-ne v5, v1, :cond_1

    move v1, v4

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    const/4 v5, 0x0

    if-eqz p1, :cond_2

    iget p1, p3, Lrb;->W:F

    cmpl-float p1, p1, v5

    if-lez p1, :cond_2

    move p1, v4

    goto :goto_2

    :cond_2
    move p1, v3

    :goto_2
    if-eqz v1, :cond_3

    iget v1, p3, Lrb;->W:F

    cmpl-float v1, v1, v5

    if-lez v1, :cond_3

    move v1, v4

    goto :goto_3

    :cond_3
    move v1, v3

    :goto_3
    const/4 v5, 0x4

    if-eqz p1, :cond_4

    aget p1, v2, v3

    if-ne p1, v5, :cond_4

    iput v4, v0, LE5;->a:I

    :cond_4
    if-eqz v1, :cond_5

    aget p1, v2, v4

    if-ne p1, v5, :cond_5

    iput v4, v0, LE5;->b:I

    :cond_5
    invoke-virtual {p2, p3, v0}, Lhb;->b(Lrb;LE5;)V

    iget p1, v0, LE5;->e:I

    invoke-virtual {p3, p1}, Lrb;->O(I)V

    iget p1, v0, LE5;->f:I

    invoke-virtual {p3, p1}, Lrb;->L(I)V

    iget-boolean p1, v0, LE5;->h:Z

    iput-boolean p1, p3, Lrb;->E:Z

    iget p1, v0, LE5;->g:I

    invoke-virtual {p3, p1}, Lrb;->I(I)V

    iput v3, v0, LE5;->j:I

    iget-boolean p1, v0, LE5;->i:Z

    return p1
.end method
