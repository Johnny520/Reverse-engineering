.class public Lbsh/Parser;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lbsh/ParserTreeConstants;
.implements Lbsh/ParserConstants;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbsh/Parser$LookaheadSuccess;,
        Lbsh/Parser$JJCalls;
    }
.end annotation


# static fields
.field private static jj_la1_0:[I

.field private static jj_la1_1:[I

.field private static jj_la1_2:[I

.field private static jj_la1_3:[I

.field private static jj_la1_4:[I


# instance fields
.field private final jj_2_rtns:[Lbsh/Parser$JJCalls;

.field private jj_endpos:I

.field private jj_expentries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[I>;"
        }
    .end annotation
.end field

.field private jj_expentry:[I

.field private jj_gc:I

.field private jj_gen:I

.field jj_input_stream:Lbsh/JavaCharStream;

.field private jj_kind:I

.field private jj_la:I

.field private final jj_la1:[I

.field private jj_lastpos:Lbsh/Token;

.field private jj_lasttokens:[I

.field private jj_lookingAhead:Z

.field private final jj_ls:Lbsh/Parser$LookaheadSuccess;

.field public jj_nt:Lbsh/Token;

.field private jj_ntk:I

.field private jj_rescan:Z

.field private jj_scanpos:Lbsh/Token;

.field private jj_semLA:Z

.field protected jjtree:Lbsh/JJTParserState;

.field retainComments:Z

.field public token:Lbsh/Token;

.field public token_source:Lbsh/ParserTokenManager;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lbsh/Parser;->jj_la1_init_0()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lbsh/Parser;->jj_la1_init_1()V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lbsh/Parser;->jj_la1_init_2()V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lbsh/Parser;->jj_la1_init_3()V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lbsh/Parser;->jj_la1_init_4()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Lbsh/ParserTokenManager;)V
    .locals 4

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 127
    new-instance v0, Lbsh/JJTParserState;

    invoke-direct {v0}, Lbsh/JJTParserState;-><init>()V

    iput-object v0, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbsh/Parser;->retainComments:Z

    .line 128
    iput-boolean v0, p0, Lbsh/Parser;->jj_lookingAhead:Z

    const/16 v1, 0x7b

    .line 129
    new-array v2, v1, [I

    iput-object v2, p0, Lbsh/Parser;->jj_la1:[I

    const/16 v2, 0x29

    .line 130
    new-array v2, v2, [Lbsh/Parser$JJCalls;

    iput-object v2, p0, Lbsh/Parser;->jj_2_rtns:[Lbsh/Parser$JJCalls;

    .line 131
    iput-boolean v0, p0, Lbsh/Parser;->jj_rescan:Z

    .line 132
    iput v0, p0, Lbsh/Parser;->jj_gc:I

    .line 133
    new-instance v2, Lbsh/Parser$LookaheadSuccess;

    invoke-direct {v2, v0}, Lbsh/Parser$LookaheadSuccess;-><init>(I)V

    iput-object v2, p0, Lbsh/Parser;->jj_ls:Lbsh/Parser$LookaheadSuccess;

    .line 134
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lbsh/Parser;->jj_expentries:Ljava/util/List;

    const/4 v2, -0x1

    .line 135
    iput v2, p0, Lbsh/Parser;->jj_kind:I

    const/16 v3, 0x64

    .line 136
    new-array v3, v3, [I

    iput-object v3, p0, Lbsh/Parser;->jj_lasttokens:[I

    .line 137
    iput-object p1, p0, Lbsh/Parser;->token_source:Lbsh/ParserTokenManager;

    .line 138
    new-instance p1, Lbsh/Token;

    invoke-direct {p1}, Lbsh/Token;-><init>()V

    iput-object p1, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 139
    iput v2, p0, Lbsh/Parser;->jj_ntk:I

    .line 140
    iput v0, p0, Lbsh/Parser;->jj_gen:I

    move p1, v0

    :goto_0
    if-ge p1, v1, :cond_0

    .line 141
    iget-object v3, p0, Lbsh/Parser;->jj_la1:[I

    aput v2, v3, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 142
    :cond_0
    :goto_1
    iget-object p1, p0, Lbsh/Parser;->jj_2_rtns:[Lbsh/Parser$JJCalls;

    array-length v1, p1

    if-ge v0, v1, :cond_1

    new-instance v1, Lbsh/Parser$JJCalls;

    invoke-direct {v1}, Lbsh/Parser$JJCalls;-><init>()V

    aput-object v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lbsh/JJTParserState;

    .line 5
    .line 6
    invoke-direct {v0}, Lbsh/JJTParserState;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lbsh/Parser;->retainComments:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Lbsh/Parser;->jj_lookingAhead:Z

    .line 15
    .line 16
    const/16 v1, 0x7b

    .line 17
    .line 18
    new-array v2, v1, [I

    .line 19
    .line 20
    iput-object v2, p0, Lbsh/Parser;->jj_la1:[I

    .line 21
    .line 22
    const/16 v2, 0x29

    .line 23
    .line 24
    new-array v2, v2, [Lbsh/Parser$JJCalls;

    .line 25
    .line 26
    iput-object v2, p0, Lbsh/Parser;->jj_2_rtns:[Lbsh/Parser$JJCalls;

    .line 27
    .line 28
    iput-boolean v0, p0, Lbsh/Parser;->jj_rescan:Z

    .line 29
    .line 30
    iput v0, p0, Lbsh/Parser;->jj_gc:I

    .line 31
    .line 32
    new-instance v2, Lbsh/Parser$LookaheadSuccess;

    .line 33
    .line 34
    invoke-direct {v2, v0}, Lbsh/Parser$LookaheadSuccess;-><init>(I)V

    .line 35
    .line 36
    .line 37
    iput-object v2, p0, Lbsh/Parser;->jj_ls:Lbsh/Parser$LookaheadSuccess;

    .line 38
    .line 39
    new-instance v2, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v2, p0, Lbsh/Parser;->jj_expentries:Ljava/util/List;

    .line 45
    .line 46
    const/4 v2, -0x1

    .line 47
    iput v2, p0, Lbsh/Parser;->jj_kind:I

    .line 48
    .line 49
    const/16 v3, 0x64

    .line 50
    .line 51
    new-array v3, v3, [I

    .line 52
    .line 53
    iput-object v3, p0, Lbsh/Parser;->jj_lasttokens:[I

    .line 54
    .line 55
    new-instance v3, Lbsh/JavaCharStream;

    .line 56
    .line 57
    const/4 v4, 0x1

    .line 58
    invoke-direct {v3, p1, p2, v4, v4}, Lbsh/JavaCharStream;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;II)V

    .line 59
    .line 60
    .line 61
    iput-object v3, p0, Lbsh/Parser;->jj_input_stream:Lbsh/JavaCharStream;

    .line 62
    .line 63
    new-instance p1, Lbsh/ParserTokenManager;

    .line 64
    .line 65
    invoke-direct {p1, v3}, Lbsh/ParserTokenManager;-><init>(Lbsh/JavaCharStream;)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, Lbsh/Parser;->token_source:Lbsh/ParserTokenManager;

    .line 69
    .line 70
    new-instance p1, Lbsh/Token;

    .line 71
    .line 72
    invoke-direct {p1}, Lbsh/Token;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 76
    .line 77
    iput v2, p0, Lbsh/Parser;->jj_ntk:I

    .line 78
    .line 79
    iput v0, p0, Lbsh/Parser;->jj_gen:I

    .line 80
    .line 81
    move p1, v0

    .line 82
    :goto_0
    if-ge p1, v1, :cond_0

    .line 83
    .line 84
    iget-object p2, p0, Lbsh/Parser;->jj_la1:[I

    .line 85
    .line 86
    aput v2, p2, p1

    .line 87
    .line 88
    add-int/lit8 p1, p1, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    :goto_1
    iget-object p1, p0, Lbsh/Parser;->jj_2_rtns:[Lbsh/Parser$JJCalls;

    .line 92
    .line 93
    array-length p2, p1

    .line 94
    if-ge v0, p2, :cond_1

    .line 95
    .line 96
    new-instance p2, Lbsh/Parser$JJCalls;

    .line 97
    .line 98
    invoke-direct {p2}, Lbsh/Parser$JJCalls;-><init>()V

    .line 99
    .line 100
    .line 101
    aput-object p2, p1, v0

    .line 102
    .line 103
    add-int/lit8 v0, v0, 0x1

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_1
    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;)V
    .locals 5

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    new-instance v0, Lbsh/JJTParserState;

    invoke-direct {v0}, Lbsh/JJTParserState;-><init>()V

    iput-object v0, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbsh/Parser;->retainComments:Z

    .line 109
    iput-boolean v0, p0, Lbsh/Parser;->jj_lookingAhead:Z

    const/16 v1, 0x7b

    .line 110
    new-array v2, v1, [I

    iput-object v2, p0, Lbsh/Parser;->jj_la1:[I

    const/16 v2, 0x29

    .line 111
    new-array v2, v2, [Lbsh/Parser$JJCalls;

    iput-object v2, p0, Lbsh/Parser;->jj_2_rtns:[Lbsh/Parser$JJCalls;

    .line 112
    iput-boolean v0, p0, Lbsh/Parser;->jj_rescan:Z

    .line 113
    iput v0, p0, Lbsh/Parser;->jj_gc:I

    .line 114
    new-instance v2, Lbsh/Parser$LookaheadSuccess;

    invoke-direct {v2, v0}, Lbsh/Parser$LookaheadSuccess;-><init>(I)V

    iput-object v2, p0, Lbsh/Parser;->jj_ls:Lbsh/Parser$LookaheadSuccess;

    .line 115
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lbsh/Parser;->jj_expentries:Ljava/util/List;

    const/4 v2, -0x1

    .line 116
    iput v2, p0, Lbsh/Parser;->jj_kind:I

    const/16 v3, 0x64

    .line 117
    new-array v3, v3, [I

    iput-object v3, p0, Lbsh/Parser;->jj_lasttokens:[I

    .line 118
    new-instance v3, Lbsh/JavaCharStream;

    const/4 v4, 0x1

    invoke-direct {v3, p1, v4, v4}, Lbsh/JavaCharStream;-><init>(Ljava/io/Reader;II)V

    iput-object v3, p0, Lbsh/Parser;->jj_input_stream:Lbsh/JavaCharStream;

    .line 119
    new-instance p1, Lbsh/ParserTokenManager;

    invoke-direct {p1, v3}, Lbsh/ParserTokenManager;-><init>(Lbsh/JavaCharStream;)V

    iput-object p1, p0, Lbsh/Parser;->token_source:Lbsh/ParserTokenManager;

    .line 120
    new-instance p1, Lbsh/Token;

    invoke-direct {p1}, Lbsh/Token;-><init>()V

    iput-object p1, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 121
    iput v2, p0, Lbsh/Parser;->jj_ntk:I

    .line 122
    iput v0, p0, Lbsh/Parser;->jj_gen:I

    move p1, v0

    :goto_0
    if-ge p1, v1, :cond_0

    .line 123
    iget-object v3, p0, Lbsh/Parser;->jj_la1:[I

    aput v2, v3, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 124
    :cond_0
    :goto_1
    iget-object p1, p0, Lbsh/Parser;->jj_2_rtns:[Lbsh/Parser$JJCalls;

    array-length v1, p1

    if-ge v0, v1, :cond_1

    .line 125
    new-instance v1, Lbsh/Parser$JJCalls;

    invoke-direct {v1}, Lbsh/Parser$JJCalls;-><init>()V

    aput-object v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public static getAllCommentsBeforeNode(Lbsh/SimpleNode;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbsh/SimpleNode;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    iget-object p0, p0, Lbsh/SimpleNode;->firstToken:Lbsh/Token;

    .line 9
    .line 10
    if-eqz p0, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Lbsh/Token;->specialToken:Lbsh/Token;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    :goto_0
    iget-object v1, p0, Lbsh/Token;->specialToken:Lbsh/Token;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    move-object p0, v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    :goto_1
    if-eqz p0, :cond_1

    .line 23
    .line 24
    iget-object v1, p0, Lbsh/Token;->image:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lbsh/Token;->next:Lbsh/Token;

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    return-object v0
.end method

.method public static getFormalCommentsBeforeNode(Lbsh/SimpleNode;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbsh/SimpleNode;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_2

    .line 7
    .line 8
    iget-object p0, p0, Lbsh/SimpleNode;->firstToken:Lbsh/Token;

    .line 9
    .line 10
    if-eqz p0, :cond_2

    .line 11
    .line 12
    iget-object v1, p0, Lbsh/Token;->specialToken:Lbsh/Token;

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    :goto_0
    iget-object v1, p0, Lbsh/Token;->specialToken:Lbsh/Token;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    move-object p0, v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    :goto_1
    if-eqz p0, :cond_2

    .line 23
    .line 24
    iget-object v1, p0, Lbsh/Token;->image:Ljava/lang/String;

    .line 25
    .line 26
    const-string v2, "/**"

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    iget-object v1, p0, Lbsh/Token;->image:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-object p0, p0, Lbsh/Token;->next:Lbsh/Token;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    return-object v0
.end method

.method private getRadix(Ljava/lang/String;)I
    .locals 1

    .line 1
    const-string v0, "0b"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_4

    .line 8
    .line 9
    const-string v0, "0B"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const-string v0, "0x"

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_3

    .line 25
    .line 26
    const-string v0, "0X"

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const-string v0, "0"

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    const/4 v0, 0x1

    .line 48
    if-le p1, v0, :cond_2

    .line 49
    .line 50
    const/16 p1, 0x8

    .line 51
    .line 52
    return p1

    .line 53
    :cond_2
    const/16 p1, 0xa

    .line 54
    .line 55
    return p1

    .line 56
    :cond_3
    :goto_0
    const/16 p1, 0x10

    .line 57
    .line 58
    return p1

    .line 59
    :cond_4
    :goto_1
    const/4 p1, 0x2

    .line 60
    return p1
.end method

.method private getStartIdx(I)I
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    const/16 v0, 0x8

    .line 8
    .line 9
    if-ne p1, v0, :cond_1

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_1
    const/4 p1, 0x2

    .line 14
    return p1
.end method

.method private jj_2_1(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x0

    .line 11
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_1()Z

    .line 12
    .line 13
    .line 14
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    xor-int/2addr v0, v2

    .line 16
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 17
    .line 18
    .line 19
    return v0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 26
    .line 27
    .line 28
    return v0
.end method

.method private jj_2_10(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x9

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_10()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_11(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0xa

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_11()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_12(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0xb

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_12()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_13(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0xc

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_13()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_14(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0xd

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_14()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_15(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0xe

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_15()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_16(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0xf

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_16()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_17(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x10

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_17()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_18(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x11

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_18()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_19(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x12

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_19()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_2(I)Z
    .locals 2

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_2()Z

    .line 11
    .line 12
    .line 13
    move-result v1
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    xor-int/2addr v1, v0

    .line 15
    invoke-direct {p0, v0, p1}, Lbsh/Parser;->jj_save(II)V

    .line 16
    .line 17
    .line 18
    return v1

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    invoke-direct {p0, v0, p1}, Lbsh/Parser;->jj_save(II)V

    .line 21
    .line 22
    .line 23
    throw v1

    .line 24
    :catch_0
    invoke-direct {p0, v0, p1}, Lbsh/Parser;->jj_save(II)V

    .line 25
    .line 26
    .line 27
    return v0
.end method

.method private jj_2_20(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x13

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_20()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_21(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x14

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_21()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_22(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x15

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_22()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_23(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x16

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_23()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_24(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x17

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_24()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_25(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x18

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_25()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_26(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x19

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_26()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_27(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x1a

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_27()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_28(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x1b

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_28()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_29(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x1c

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_29()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_3(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x2

    .line 11
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_3()Z

    .line 12
    .line 13
    .line 14
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    xor-int/2addr v0, v2

    .line 16
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 17
    .line 18
    .line 19
    return v0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 26
    .line 27
    .line 28
    return v0
.end method

.method private jj_2_30(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x1d

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_30()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_31(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x1e

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_31()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_32(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x1f

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_32()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_33(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x20

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_33()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_34(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x21

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_34()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_35(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x22

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_35()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_36(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x23

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_36()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_37(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x24

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_37()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_38(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x25

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_38()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_39(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x26

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_39()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_4(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x3

    .line 11
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_4()Z

    .line 12
    .line 13
    .line 14
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    xor-int/2addr v0, v2

    .line 16
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 17
    .line 18
    .line 19
    return v0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 26
    .line 27
    .line 28
    return v0
.end method

.method private jj_2_40(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x27

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_40()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_41(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x28

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_41()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_2_5(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x4

    .line 11
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_5()Z

    .line 12
    .line 13
    .line 14
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    xor-int/2addr v0, v2

    .line 16
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 17
    .line 18
    .line 19
    return v0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 26
    .line 27
    .line 28
    return v0
.end method

.method private jj_2_6(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x5

    .line 11
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_6()Z

    .line 12
    .line 13
    .line 14
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    xor-int/2addr v0, v2

    .line 16
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 17
    .line 18
    .line 19
    return v0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 26
    .line 27
    .line 28
    return v0
.end method

.method private jj_2_7(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x6

    .line 11
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_7()Z

    .line 12
    .line 13
    .line 14
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    xor-int/2addr v0, v2

    .line 16
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 17
    .line 18
    .line 19
    return v0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 26
    .line 27
    .line 28
    return v0
.end method

.method private jj_2_8(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x7

    .line 11
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_8()Z

    .line 12
    .line 13
    .line 14
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    xor-int/2addr v0, v2

    .line 16
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 17
    .line 18
    .line 19
    return v0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 26
    .line 27
    .line 28
    return v0
.end method

.method private jj_2_9(I)Z
    .locals 3

    .line 1
    iput p1, p0, Lbsh/Parser;->jj_la:I

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    :try_start_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_9()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    invoke-direct {p0, v1, p1}, Lbsh/Parser;->jj_save(II)V

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method private jj_3R_100()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_125()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_101()Z
    .locals 3

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_61()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_126()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_127()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    return v1

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    return v0
.end method

.method private jj_3R_102()Z
    .locals 3

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_61()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_128()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_129()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    return v1

    .line 26
    :cond_1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_44()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    return v1

    .line 33
    :cond_2
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 34
    .line 35
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_238()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 42
    .line 43
    :cond_3
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 44
    .line 45
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_239()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_4

    .line 50
    .line 51
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 52
    .line 53
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_240()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    return v1

    .line 60
    :cond_4
    const/4 v0, 0x0

    .line 61
    return v0
.end method

.method private jj_3R_103()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_61()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_52()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_66()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    return v1

    .line 23
    :cond_2
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 24
    .line 25
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_241()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    return v0
.end method

.method private jj_3R_104()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3_4()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_130()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_105()Z
    .locals 2

    .line 1
    const/16 v0, 0x2b

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_46()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private jj_3R_106()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3_7()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_131()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 20
    .line 21
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_132()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return v0
.end method

.method private jj_3R_107()Z
    .locals 2

    .line 1
    const/16 v0, 0x53

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_106()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private jj_3R_108()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_133()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_134()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_135()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 26
    .line 27
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_136()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 34
    .line 35
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_137()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 42
    .line 43
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_138()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 50
    .line 51
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_139()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 58
    .line 59
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_140()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    const/4 v0, 0x1

    .line 66
    return v0

    .line 67
    :cond_0
    const/4 v0, 0x0

    .line 68
    return v0
.end method

.method private jj_3R_109()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_142()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method private jj_3R_110()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3_25()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_143()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_144()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method private jj_3R_111()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_145()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_149()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_112()Z
    .locals 2

    .line 1
    const/16 v0, 0x53

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_46()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private jj_3R_113()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_114()Z
    .locals 3

    .line 1
    const/16 v0, 0x33

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x4c

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    return v1

    .line 27
    :cond_2
    const/16 v0, 0x4d

    .line 28
    .line 29
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    return v1

    .line 36
    :cond_3
    const/16 v0, 0x4e

    .line 37
    .line 38
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    return v1

    .line 45
    :cond_4
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 46
    .line 47
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_254()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 54
    .line 55
    const/16 v0, 0x4f

    .line 56
    .line 57
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_5

    .line 62
    .line 63
    return v1

    .line 64
    :cond_5
    const/4 v0, 0x0

    .line 65
    return v0
.end method

.method private jj_3R_115()Z
    .locals 3

    .line 1
    const/16 v0, 0x21

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x4c

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    return v1

    .line 27
    :cond_2
    const/16 v0, 0x4d

    .line 28
    .line 29
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    return v1

    .line 36
    :cond_3
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 37
    .line 38
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_255()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_4

    .line 43
    .line 44
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 45
    .line 46
    invoke-direct {p0}, Lbsh/Parser;->jj_3_35()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    return v1

    .line 53
    :cond_4
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 54
    .line 55
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_256()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_5

    .line 60
    .line 61
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 62
    .line 63
    :cond_5
    const/4 v0, 0x0

    .line 64
    return v0
.end method

.method private jj_3R_116()Z
    .locals 2

    .line 1
    const/16 v0, 0x3d

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x4c

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    return v1

    .line 27
    :cond_2
    const/16 v0, 0x4d

    .line 28
    .line 29
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    return v1

    .line 36
    :cond_3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_63()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_4

    .line 41
    .line 42
    return v1

    .line 43
    :cond_4
    const/4 v0, 0x0

    .line 44
    return v0
.end method

.method private jj_3R_117()Z
    .locals 2

    .line 1
    const/16 v0, 0x16

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_63()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/16 v0, 0x3d

    .line 19
    .line 20
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    return v1

    .line 27
    :cond_2
    const/16 v0, 0x4c

    .line 28
    .line 29
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    return v1

    .line 36
    :cond_3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_4

    .line 41
    .line 42
    return v1

    .line 43
    :cond_4
    const/16 v0, 0x4d

    .line 44
    .line 45
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_5

    .line 50
    .line 51
    return v1

    .line 52
    :cond_5
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_48()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_6

    .line 57
    .line 58
    return v1

    .line 59
    :cond_6
    const/4 v0, 0x0

    .line 60
    return v0
.end method

.method private jj_3R_118()Z
    .locals 4

    .line 1
    const/16 v0, 0x1f

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x4c

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 21
    .line 22
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_257()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 29
    .line 30
    :cond_2
    const/16 v0, 0x52

    .line 31
    .line 32
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    return v1

    .line 39
    :cond_3
    iget-object v2, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 40
    .line 41
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_258()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_4

    .line 46
    .line 47
    iput-object v2, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 48
    .line 49
    :cond_4
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_5

    .line 54
    .line 55
    return v1

    .line 56
    :cond_5
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 57
    .line 58
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_259()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_6

    .line 63
    .line 64
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 65
    .line 66
    :cond_6
    const/16 v0, 0x4d

    .line 67
    .line 68
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_7

    .line 73
    .line 74
    return v1

    .line 75
    :cond_7
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_63()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_8

    .line 80
    .line 81
    return v1

    .line 82
    :cond_8
    const/4 v0, 0x0

    .line 83
    return v0
.end method

.method private jj_3R_119()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3_36()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_146()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_120()Z
    .locals 3

    .line 1
    const/16 v0, 0xd

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    invoke-direct {p0}, Lbsh/Parser;->jj_3_38()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 20
    .line 21
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_158()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    return v1

    .line 28
    :cond_1
    const/4 v0, 0x0

    .line 29
    return v0
.end method

.method private jj_3R_121()Z
    .locals 3

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    invoke-direct {p0}, Lbsh/Parser;->jj_3_39()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 20
    .line 21
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_159()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    return v1

    .line 28
    :cond_1
    const/4 v0, 0x0

    .line 29
    return v0
.end method

.method private jj_3R_122()Z
    .locals 3

    .line 1
    const/16 v0, 0x2f

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_160()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 20
    .line 21
    :cond_1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_48()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    return v1

    .line 28
    :cond_2
    const/4 v0, 0x0

    .line 29
    return v0
.end method

.method private jj_3R_123()Z
    .locals 2

    .line 1
    const/16 v0, 0x34

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x4c

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    return v1

    .line 27
    :cond_2
    const/16 v0, 0x4d

    .line 28
    .line 29
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    return v1

    .line 36
    :cond_3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_58()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_4

    .line 41
    .line 42
    return v1

    .line 43
    :cond_4
    const/4 v0, 0x0

    .line 44
    return v0
.end method

.method private jj_3R_124()Z
    .locals 2

    .line 1
    const/16 v0, 0x36

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_48()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    return v1

    .line 25
    :cond_2
    const/4 v0, 0x0

    .line 26
    return v0
.end method

.method private jj_3R_125()Z
    .locals 3

    .line 1
    const/16 v0, 0x39

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_161()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 20
    .line 21
    :cond_1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_58()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    return v1

    .line 28
    :cond_2
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 29
    .line 30
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_260()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 37
    .line 38
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_261()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 45
    .line 46
    :cond_3
    const/4 v0, 0x0

    .line 47
    return v0
.end method

.method private jj_3R_126()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_147()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 11
    .line 12
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_148()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return v2

    .line 19
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_58()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    return v2

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    return v0
.end method

.method private jj_3R_127()Z
    .locals 3

    .line 1
    const/16 v0, 0x19

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x49

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 21
    .line 22
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_242()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 29
    .line 30
    :cond_2
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_243()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    return v1

    .line 37
    :cond_3
    const/4 v0, 0x0

    .line 38
    return v0
.end method

.method private jj_3R_128()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_42()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_43()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method private jj_3R_129()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_43()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_130()Z
    .locals 2

    .line 1
    const/16 v0, 0x23

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x6a

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_48()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    return v1

    .line 27
    :cond_2
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method private jj_3R_131()Z
    .locals 1

    .line 1
    const/16 v0, 0x49

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_132()Z
    .locals 2

    .line 1
    const/16 v0, 0x50

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x51

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method private jj_3R_133()Z
    .locals 1

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_134()Z
    .locals 1

    .line 1
    const/16 v0, 0x12

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_135()Z
    .locals 1

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_136()Z
    .locals 1

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_137()Z
    .locals 1

    .line 1
    const/16 v0, 0x25

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_138()Z
    .locals 1

    .line 1
    const/16 v0, 0x27

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_139()Z
    .locals 1

    .line 1
    const/16 v0, 0x1e

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_140()Z
    .locals 1

    .line 1
    const/16 v0, 0x17

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_141()Z
    .locals 2

    .line 1
    const/16 v0, 0x95

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/16 v0, 0x96

    .line 19
    .line 20
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    return v1

    .line 27
    :cond_2
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_85()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    return v1

    .line 34
    :cond_3
    const/4 v0, 0x0

    .line 35
    return v0
.end method

.method private jj_3R_142()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    const/16 v1, 0x55

    .line 4
    .line 5
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    const/16 v1, 0x7e

    .line 14
    .line 15
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 22
    .line 23
    const/16 v1, 0x88

    .line 24
    .line 25
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 32
    .line 33
    const/16 v1, 0x89

    .line 34
    .line 35
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 42
    .line 43
    const/16 v1, 0x7f

    .line 44
    .line 45
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 52
    .line 53
    const/16 v1, 0x86

    .line 54
    .line 55
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_0

    .line 60
    .line 61
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 62
    .line 63
    const/16 v1, 0x87

    .line 64
    .line 65
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_0

    .line 70
    .line 71
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 72
    .line 73
    const/16 v1, 0x7c

    .line 74
    .line 75
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_0

    .line 80
    .line 81
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 82
    .line 83
    const/16 v1, 0x7d

    .line 84
    .line 85
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_0

    .line 90
    .line 91
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 92
    .line 93
    const/16 v1, 0x80

    .line 94
    .line 95
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_0

    .line 100
    .line 101
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 102
    .line 103
    const/16 v1, 0x81

    .line 104
    .line 105
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_0

    .line 110
    .line 111
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 112
    .line 113
    const/16 v1, 0x84

    .line 114
    .line 115
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_0

    .line 120
    .line 121
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 122
    .line 123
    const/16 v1, 0x85

    .line 124
    .line 125
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_0

    .line 130
    .line 131
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 132
    .line 133
    const/16 v1, 0x82

    .line 134
    .line 135
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-eqz v1, :cond_0

    .line 140
    .line 141
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 142
    .line 143
    const/16 v1, 0x83

    .line 144
    .line 145
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_0

    .line 150
    .line 151
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 152
    .line 153
    const/16 v1, 0x8a

    .line 154
    .line 155
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-eqz v1, :cond_0

    .line 160
    .line 161
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 162
    .line 163
    const/16 v1, 0x8b

    .line 164
    .line 165
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-eqz v1, :cond_0

    .line 170
    .line 171
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 172
    .line 173
    const/16 v1, 0x8c

    .line 174
    .line 175
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-eqz v1, :cond_0

    .line 180
    .line 181
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 182
    .line 183
    const/16 v1, 0x92

    .line 184
    .line 185
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    if-eqz v1, :cond_0

    .line 190
    .line 191
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 192
    .line 193
    const/16 v1, 0x8d

    .line 194
    .line 195
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-eqz v1, :cond_0

    .line 200
    .line 201
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 202
    .line 203
    const/16 v1, 0x8e

    .line 204
    .line 205
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    if-eqz v1, :cond_0

    .line 210
    .line 211
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 212
    .line 213
    const/16 v0, 0x8f

    .line 214
    .line 215
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_0

    .line 220
    .line 221
    const/4 v0, 0x1

    .line 222
    return v0

    .line 223
    :cond_0
    const/4 v0, 0x0

    .line 224
    return v0
.end method

.method private jj_3R_143()Z
    .locals 3

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_150()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_150()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_49()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    return v1

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    return v0
.end method

.method private jj_3R_144()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_49()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_145()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_151()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_152()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_146()Z
    .locals 3

    .line 1
    const/16 v0, 0x1f

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x4c

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 21
    .line 22
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_266()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 29
    .line 30
    :cond_2
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_52()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    return v1

    .line 37
    :cond_3
    const/16 v0, 0x49

    .line 38
    .line 39
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    return v1

    .line 46
    :cond_4
    const/16 v0, 0x96

    .line 47
    .line 48
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_6

    .line 60
    .line 61
    return v1

    .line 62
    :cond_6
    const/16 v0, 0x4d

    .line 63
    .line 64
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_7

    .line 69
    .line 70
    return v1

    .line 71
    :cond_7
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_63()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_8

    .line 76
    .line 77
    return v1

    .line 78
    :cond_8
    const/4 v0, 0x0

    .line 79
    return v0
.end method

.method private jj_3R_147()Z
    .locals 2

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x49

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 21
    .line 22
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_247()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 29
    .line 30
    :cond_2
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 31
    .line 32
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_248()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 39
    .line 40
    :cond_3
    const/4 v0, 0x0

    .line 41
    return v0
.end method

.method private jj_3R_148()Z
    .locals 2

    .line 1
    const/16 v0, 0x26

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x49

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 21
    .line 22
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_249()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 29
    .line 30
    :cond_2
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method private jj_3R_149()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    const/16 v1, 0x93

    .line 4
    .line 5
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 13
    .line 14
    const/16 v1, 0x94

    .line 15
    .line 16
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 23
    .line 24
    const/16 v0, 0x91

    .line 25
    .line 26
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    return v2

    .line 33
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_145()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    return v2

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    return v0
.end method

.method private jj_3R_150()Z
    .locals 2

    .line 1
    const/16 v0, 0x50

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x51

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method private jj_3R_151()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_153()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_154()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_152()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    const/16 v1, 0x62

    .line 4
    .line 5
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 13
    .line 14
    const/16 v0, 0x63

    .line 15
    .line 16
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    return v2

    .line 23
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_151()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    return v2

    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method private jj_3R_153()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_155()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_156()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_154()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 13
    .line 14
    const/16 v0, 0x65

    .line 15
    .line 16
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    return v2

    .line 23
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_153()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    return v2

    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method private jj_3R_155()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_157()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_162()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_156()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    const/16 v1, 0x6e

    .line 4
    .line 5
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 13
    .line 14
    const/16 v0, 0x6f

    .line 15
    .line 16
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    return v2

    .line 23
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_155()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    return v2

    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method private jj_3R_157()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_163()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_165()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_158()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_48()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_159()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_48()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_160()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_161()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_164()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_162()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    const/16 v1, 0x70

    .line 4
    .line 5
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 13
    .line 14
    const/16 v0, 0x71

    .line 15
    .line 16
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    return v2

    .line 23
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_157()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    return v2

    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method private jj_3R_163()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_166()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_167()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_164()Z
    .locals 3

    .line 1
    const/16 v0, 0x4c

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_275()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 19
    .line 20
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_276()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 27
    .line 28
    const/16 v0, 0x4d

    .line 29
    .line 30
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    return v1

    .line 37
    :cond_2
    const/4 v0, 0x0

    .line 38
    return v0
.end method

.method private jj_3R_165()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    const/16 v1, 0x6c

    .line 4
    .line 5
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 13
    .line 14
    const/16 v0, 0x6d

    .line 15
    .line 16
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    return v2

    .line 23
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_163()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    return v2

    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method private jj_3R_166()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_168()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_169()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_167()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    const/16 v1, 0x5c

    .line 4
    .line 5
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 13
    .line 14
    const/16 v0, 0x61

    .line 15
    .line 16
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    return v2

    .line 23
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_166()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    return v2

    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method private jj_3R_168()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_170()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_171()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_169()Z
    .locals 2

    .line 1
    const/16 v0, 0x24

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_52()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private jj_3R_170()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_172()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_173()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_171()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    const/16 v1, 0x58

    .line 4
    .line 5
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 13
    .line 14
    const/16 v1, 0x59

    .line 15
    .line 16
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 23
    .line 24
    const/16 v1, 0x56

    .line 25
    .line 26
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 33
    .line 34
    const/16 v1, 0x57

    .line 35
    .line 36
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 43
    .line 44
    const/16 v1, 0x5d

    .line 45
    .line 46
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 53
    .line 54
    const/16 v1, 0x5e

    .line 55
    .line 56
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 63
    .line 64
    const/16 v1, 0x5f

    .line 65
    .line 66
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_0

    .line 71
    .line 72
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 73
    .line 74
    const/16 v0, 0x60

    .line 75
    .line 76
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_0

    .line 81
    .line 82
    return v2

    .line 83
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_170()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_1

    .line 88
    .line 89
    return v2

    .line 90
    :cond_1
    const/4 v0, 0x0

    .line 91
    return v0
.end method

.method private jj_3R_172()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_174()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_175()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_173()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    const/16 v1, 0x76

    .line 4
    .line 5
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 13
    .line 14
    const/16 v1, 0x77

    .line 15
    .line 16
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 23
    .line 24
    const/16 v1, 0x78

    .line 25
    .line 26
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 33
    .line 34
    const/16 v1, 0x79

    .line 35
    .line 36
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 43
    .line 44
    const/16 v1, 0x7a

    .line 45
    .line 46
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 53
    .line 54
    const/16 v0, 0x7b

    .line 55
    .line 56
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    return v2

    .line 63
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_172()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    return v2

    .line 70
    :cond_1
    const/4 v0, 0x0

    .line 71
    return v0
.end method

.method private jj_3R_174()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_176()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_177()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_175()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    const/16 v1, 0x68

    .line 4
    .line 5
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 13
    .line 14
    const/16 v0, 0x69

    .line 15
    .line 16
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    return v2

    .line 23
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_174()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    return v2

    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method private jj_3R_176()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_178()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_179()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_177()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    const/16 v1, 0x6a

    .line 4
    .line 5
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 13
    .line 14
    const/16 v1, 0x6b

    .line 15
    .line 16
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 23
    .line 24
    const/16 v1, 0x72

    .line 25
    .line 26
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 33
    .line 34
    const/16 v0, 0x73

    .line 35
    .line 36
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    return v2

    .line 43
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_176()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    return v2

    .line 50
    :cond_1
    const/4 v0, 0x0

    .line 51
    return v0
.end method

.method private jj_3R_178()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_180()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_181()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_182()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 26
    .line 27
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_183()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 34
    .line 35
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_184()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    return v0

    .line 43
    :cond_0
    const/4 v0, 0x0

    .line 44
    return v0
.end method

.method private jj_3R_179()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    const/16 v1, 0x74

    .line 4
    .line 5
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 13
    .line 14
    const/16 v0, 0x75

    .line 15
    .line 16
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    return v2

    .line 23
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_178()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    return v2

    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method private jj_3R_180()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    const/16 v1, 0x68

    .line 4
    .line 5
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 13
    .line 14
    const/16 v1, 0x69

    .line 15
    .line 16
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 23
    .line 24
    const/16 v1, 0x5b

    .line 25
    .line 26
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 33
    .line 34
    const/16 v0, 0x5a

    .line 35
    .line 36
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    return v2

    .line 43
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_178()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    return v2

    .line 50
    :cond_1
    const/4 v0, 0x0

    .line 51
    return v0
.end method

.method private jj_3R_181()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    const/16 v1, 0x66

    .line 4
    .line 5
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 13
    .line 14
    const/16 v0, 0x67

    .line 15
    .line 16
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    return v2

    .line 23
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_187()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    return v2

    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method private jj_3R_182()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_185()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_183()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_186()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_184()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_187()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_188()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_185()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_189()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 11
    .line 12
    const/16 v0, 0x49

    .line 13
    .line 14
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    return v2

    .line 21
    :cond_0
    const/16 v0, 0x90

    .line 22
    .line 23
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    return v2

    .line 30
    :cond_1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 31
    .line 32
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_191()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 39
    .line 40
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_192()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    return v2

    .line 47
    :cond_2
    const/4 v0, 0x0

    .line 48
    return v0
.end method

.method private jj_3R_186()Z
    .locals 2

    .line 1
    const/16 v0, 0x4c

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_52()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/16 v0, 0x4d

    .line 19
    .line 20
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    return v1

    .line 27
    :cond_2
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_178()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    return v1

    .line 34
    :cond_3
    const/4 v0, 0x0

    .line 35
    return v0
.end method

.method private jj_3R_187()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_190()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3_15()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_188()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    const/16 v1, 0x66

    .line 4
    .line 5
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    const/16 v0, 0x67

    .line 14
    .line 15
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method private jj_3R_189()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_44()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_190()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_193()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_194()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_195()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 26
    .line 27
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_196()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 34
    .line 35
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_197()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 42
    .line 43
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_198()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 50
    .line 51
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_199()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    return v0

    .line 59
    :cond_0
    const/4 v0, 0x0

    .line 60
    return v0
.end method

.method private jj_3R_191()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_58()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_192()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_193()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_200()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_194()Z
    .locals 2

    .line 1
    const/16 v0, 0x4c

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/16 v0, 0x4d

    .line 19
    .line 20
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    return v1

    .line 27
    :cond_2
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method private jj_3R_195()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_201()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_196()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_57()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_197()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_202()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_198()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_52()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_199()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_46()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_200()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_203()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_204()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_205()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 26
    .line 27
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_206()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 34
    .line 35
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_207()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 42
    .line 43
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_208()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 50
    .line 51
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_209()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 58
    .line 59
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_210()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    const/4 v0, 0x1

    .line 66
    return v0

    .line 67
    :cond_0
    const/4 v0, 0x0

    .line 68
    return v0
.end method

.method private jj_3R_201()Z
    .locals 3

    .line 1
    const/16 v0, 0x3c

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x4c

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    return v1

    .line 27
    :cond_2
    const/16 v0, 0x4d

    .line 28
    .line 29
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    return v1

    .line 36
    :cond_3
    const/16 v0, 0x4e

    .line 37
    .line 38
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    return v1

    .line 45
    :cond_4
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_211()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_5

    .line 50
    .line 51
    return v1

    .line 52
    :cond_5
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 53
    .line 54
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_211()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_5

    .line 59
    .line 60
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 61
    .line 62
    const/16 v0, 0x4f

    .line 63
    .line 64
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_6

    .line 69
    .line 70
    return v1

    .line 71
    :cond_6
    const/4 v0, 0x0

    .line 72
    return v0
.end method

.method private jj_3R_202()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_46()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_212()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method private jj_3R_203()Z
    .locals 1

    .line 1
    const/16 v0, 0x3e

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_204()Z
    .locals 1

    .line 1
    const/16 v0, 0x43

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_205()Z
    .locals 1

    .line 1
    const/16 v0, 0x46

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_206()Z
    .locals 1

    .line 1
    const/16 v0, 0x47

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_207()Z
    .locals 1

    .line 1
    const/16 v0, 0x48

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_208()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_217()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_209()Z
    .locals 1

    .line 1
    const/16 v0, 0x2a

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_210()Z
    .locals 1

    .line 1
    const/16 v0, 0x3a

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_211()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_218()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_212()Z
    .locals 3

    .line 1
    const/16 v0, 0x4c

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_222()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 20
    .line 21
    :cond_1
    const/16 v0, 0x4d

    .line 22
    .line 23
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    return v1

    .line 30
    :cond_2
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method private jj_3R_213()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_214()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_223()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_224()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_215()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_212()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_216()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_212()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_217()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_225()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_226()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_218()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_227()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_228()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_219()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_108()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_110()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method private jj_3R_220()Z
    .locals 3

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_46()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_229()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_230()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    return v1

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    return v0
.end method

.method private jj_3R_221()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_110()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_222()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_231()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_223()Z
    .locals 2

    .line 1
    const/16 v0, 0x97

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_232()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 20
    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method private jj_3R_224()Z
    .locals 2

    .line 1
    const/16 v0, 0x96

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_233()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 22
    .line 23
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_234()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 30
    .line 31
    :cond_2
    const/4 v0, 0x0

    .line 32
    return v0
.end method

.method private jj_3R_225()Z
    .locals 1

    .line 1
    const/16 v0, 0x38

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_226()Z
    .locals 1

    .line 1
    const/16 v0, 0x1b

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_227()Z
    .locals 2

    .line 1
    const/16 v0, 0x18

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x90

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    return v1

    .line 27
    :cond_2
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method private jj_3R_228()Z
    .locals 3

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_235()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    const/16 v0, 0x90

    .line 20
    .line 21
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    return v1

    .line 28
    :cond_1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    return v1

    .line 35
    :cond_2
    const/4 v0, 0x0

    .line 36
    return v0
.end method

.method private jj_3R_229()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_110()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_230()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_212()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3_22()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_231()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_236()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_232()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_233()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_234()Z
    .locals 2

    .line 1
    const/16 v0, 0x96

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_237()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 20
    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method private jj_3R_235()Z
    .locals 2

    .line 1
    const/16 v0, 0x53

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private jj_3R_236()Z
    .locals 2

    .line 1
    const/16 v0, 0x53

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private jj_3R_237()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_238()Z
    .locals 2

    .line 1
    const/16 v0, 0x37

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_87()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private jj_3R_239()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_58()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_240()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_244()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_241()Z
    .locals 2

    .line 1
    const/16 v0, 0x53

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_66()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private jj_3R_242()Z
    .locals 2

    .line 1
    const/16 v0, 0x22

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_87()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private jj_3R_243()Z
    .locals 3

    .line 1
    const/16 v0, 0x4e

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_250()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 22
    .line 23
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_251()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 30
    .line 31
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_252()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 38
    .line 39
    :cond_2
    const/16 v0, 0x4f

    .line 40
    .line 41
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    return v1

    .line 48
    :cond_3
    const/4 v0, 0x0

    .line 49
    return v0
.end method

.method private jj_3R_244()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    const/16 v1, 0x52

    .line 4
    .line 5
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lbsh/Parser;->jj_lookingAhead:Z

    .line 16
    .line 17
    invoke-virtual {p0}, Lbsh/Parser;->isImplicitMethodTerminator()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iput-boolean v1, p0, Lbsh/Parser;->jj_semLA:Z

    .line 22
    .line 23
    iput-boolean v2, p0, Lbsh/Parser;->jj_lookingAhead:Z

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_253()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    :cond_0
    return v0

    .line 34
    :cond_1
    return v2
.end method

.method private jj_3R_245()Z
    .locals 2

    .line 1
    const/16 v0, 0x50

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x51

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method private jj_3R_246()Z
    .locals 2

    .line 1
    const/16 v0, 0x55

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_50()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private jj_3R_247()Z
    .locals 2

    .line 1
    const/16 v0, 0x1a

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_46()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private jj_3R_248()Z
    .locals 2

    .line 1
    const/16 v0, 0x22

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_87()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private jj_3R_249()Z
    .locals 2

    .line 1
    const/16 v0, 0x1a

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_87()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private jj_3R_250()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_262()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_251()Z
    .locals 2

    .line 1
    const/16 v0, 0x53

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_262()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private jj_3R_252()Z
    .locals 2

    .line 1
    const/16 v0, 0x52

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    invoke-direct {p0}, Lbsh/Parser;->jj_3_2()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method private jj_3R_253()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method private jj_3R_254()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_263()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3_34()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_255()Z
    .locals 1

    .line 1
    const/16 v0, 0x52

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_256()Z
    .locals 2

    .line 1
    const/16 v0, 0x18

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_63()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private jj_3R_257()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_264()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_258()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_259()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_265()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_260()Z
    .locals 2

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x4c

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_267()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    return v1

    .line 27
    :cond_2
    const/16 v0, 0x4d

    .line 28
    .line 29
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    return v1

    .line 36
    :cond_3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_58()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_4

    .line 41
    .line 42
    return v1

    .line 43
    :cond_4
    const/4 v0, 0x0

    .line 44
    return v0
.end method

.method private jj_3R_261()Z
    .locals 2

    .line 1
    const/16 v0, 0x1d

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_58()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private jj_3R_262()Z
    .locals 2

    .line 1
    const/16 v0, 0x49

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_268()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 22
    .line 23
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_269()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 30
    .line 31
    :cond_2
    const/4 v0, 0x0

    .line 32
    return v0
.end method

.method private jj_3R_263()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_270()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_271()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_264()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_272()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_273()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_265()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_274()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_266()Z
    .locals 1

    .line 1
    const/16 v0, 0x1c

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_267()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3_40()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_277()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_268()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_212()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_269()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_58()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_270()Z
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/16 v0, 0x96

    .line 19
    .line 20
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    return v1

    .line 27
    :cond_2
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method private jj_3R_271()Z
    .locals 1

    .line 1
    const/16 v0, 0x9a

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_272()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_103()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_273()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_274()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_274()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_113()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_278()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_275()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3_41()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_279()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_276()Z
    .locals 2

    .line 1
    const/16 v0, 0x52

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_275()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private jj_3R_277()Z
    .locals 1

    .line 1
    const/16 v0, 0x49

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_278()Z
    .locals 2

    .line 1
    const/16 v0, 0x53

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_113()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private jj_3R_279()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_66()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_41()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_67()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_68()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_69()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 26
    .line 27
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_70()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 34
    .line 35
    invoke-direct {p0}, Lbsh/Parser;->jj_3_33()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 42
    .line 43
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_71()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 50
    .line 51
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_72()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    return v0

    .line 59
    :cond_0
    const/4 v0, 0x0

    .line 60
    return v0
.end method

.method private jj_3R_42()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_73()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_74()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_43()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    const/16 v1, 0x49

    .line 4
    .line 5
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    const/16 v1, 0xc

    .line 14
    .line 15
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 22
    .line 23
    const/16 v1, 0x12

    .line 24
    .line 25
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 32
    .line 33
    const/16 v1, 0xf

    .line 34
    .line 35
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 42
    .line 43
    const/16 v1, 0x30

    .line 44
    .line 45
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 52
    .line 53
    const/16 v1, 0x25

    .line 54
    .line 55
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_0

    .line 60
    .line 61
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 62
    .line 63
    const/16 v1, 0x27

    .line 64
    .line 65
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_0

    .line 70
    .line 71
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 72
    .line 73
    const/16 v1, 0x1e

    .line 74
    .line 75
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_0

    .line 80
    .line 81
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 82
    .line 83
    const/16 v0, 0x17

    .line 84
    .line 85
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_0

    .line 90
    .line 91
    const/4 v0, 0x1

    .line 92
    return v0

    .line 93
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 94
    .line 95
    invoke-direct {p0}, Lbsh/Parser;->jj_3_10()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_0

    .line 100
    .line 101
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 102
    .line 103
    :cond_1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 104
    .line 105
    invoke-direct {p0}, Lbsh/Parser;->jj_3_11()Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_1

    .line 110
    .line 111
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 112
    .line 113
    const/4 v0, 0x0

    .line 114
    return v0
.end method

.method private jj_3R_44()Z
    .locals 3

    .line 1
    const/16 v0, 0x4c

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_75()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 20
    .line 21
    :cond_1
    const/16 v0, 0x4d

    .line 22
    .line 23
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    return v1

    .line 30
    :cond_2
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method private jj_3R_45()Z
    .locals 1

    .line 1
    const/16 v0, 0x31

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_46()Z
    .locals 2

    .line 1
    const/16 v0, 0x49

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    invoke-direct {p0}, Lbsh/Parser;->jj_3_9()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method private jj_3R_47()Z
    .locals 2

    .line 1
    const/16 v0, 0x54

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x6a

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method private jj_3R_48()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    const/16 v1, 0x52

    .line 4
    .line 5
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method private jj_3R_49()Z
    .locals 3

    .line 1
    const/16 v0, 0x4e

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_76()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 22
    .line 23
    const/16 v2, 0x53

    .line 24
    .line 25
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 32
    .line 33
    :cond_2
    const/16 v0, 0x4f

    .line 34
    .line 35
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    return v1

    .line 42
    :cond_3
    const/4 v0, 0x0

    .line 43
    return v0
.end method

.method private jj_3R_50()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3_5()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_77()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_51()Z
    .locals 1

    .line 1
    const/16 v0, 0x1c

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_52()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_78()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_79()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 20
    .line 21
    invoke-direct {p0}, Lbsh/Parser;->jj_3_8()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return v0
.end method

.method private jj_3R_53()Z
    .locals 1

    .line 1
    const/16 v0, 0x98

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_54()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_44()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_55()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3_18()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_3

    .line 9
    .line 10
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 11
    .line 12
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_80()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_3

    .line 17
    .line 18
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    iput-boolean v1, p0, Lbsh/Parser;->jj_lookingAhead:Z

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lbsh/Parser;->getToken(I)Lbsh/Token;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget v3, v3, Lbsh/Token;->kind:I

    .line 28
    .line 29
    const/16 v4, 0x97

    .line 30
    .line 31
    if-ne v3, v4, :cond_1

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    invoke-virtual {p0, v3}, Lbsh/Parser;->getToken(I)Lbsh/Token;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    iget v4, v4, Lbsh/Token;->kind:I

    .line 39
    .line 40
    const/16 v5, 0x49

    .line 41
    .line 42
    if-eq v4, v5, :cond_0

    .line 43
    .line 44
    invoke-virtual {p0, v3}, Lbsh/Parser;->getToken(I)Lbsh/Token;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    iget v3, v3, Lbsh/Token;->kind:I

    .line 49
    .line 50
    const/16 v4, 0x29

    .line 51
    .line 52
    if-ne v3, v4, :cond_1

    .line 53
    .line 54
    :cond_0
    const/4 v3, 0x3

    .line 55
    invoke-virtual {p0, v3}, Lbsh/Parser;->getToken(I)Lbsh/Token;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    iget v3, v3, Lbsh/Token;->kind:I

    .line 60
    .line 61
    const/16 v4, 0x51

    .line 62
    .line 63
    if-eq v3, v4, :cond_1

    .line 64
    .line 65
    move v3, v1

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    move v3, v2

    .line 68
    :goto_0
    iput-boolean v3, p0, Lbsh/Parser;->jj_semLA:Z

    .line 69
    .line 70
    iput-boolean v2, p0, Lbsh/Parser;->jj_lookingAhead:Z

    .line 71
    .line 72
    if-eqz v3, :cond_2

    .line 73
    .line 74
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_81()Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_3

    .line 79
    .line 80
    :cond_2
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 81
    .line 82
    invoke-direct {p0}, Lbsh/Parser;->jj_3_19()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_3

    .line 87
    .line 88
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 89
    .line 90
    invoke-direct {p0}, Lbsh/Parser;->jj_3_20()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_3

    .line 95
    .line 96
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 97
    .line 98
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_82()Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_3

    .line 103
    .line 104
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 105
    .line 106
    invoke-direct {p0}, Lbsh/Parser;->jj_3_21()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_3

    .line 111
    .line 112
    return v1

    .line 113
    :cond_3
    return v2
.end method

.method private jj_3R_56()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_57()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_83()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_84()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_58()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    const/16 v1, 0x31

    .line 4
    .line 5
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    :cond_0
    const/16 v0, 0x4e

    .line 14
    .line 15
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x1

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    return v1

    .line 23
    :cond_1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 24
    .line 25
    invoke-direct {p0}, Lbsh/Parser;->jj_3_28()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 32
    .line 33
    const/16 v0, 0x4f

    .line 34
    .line 35
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    return v1

    .line 42
    :cond_2
    const/4 v0, 0x0

    .line 43
    return v0
.end method

.method private jj_3R_59()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_85()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_109()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_60()Z
    .locals 2

    .line 1
    const/16 v0, 0x49

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x96

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_63()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    return v1

    .line 27
    :cond_2
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method private jj_3R_61()Z
    .locals 2

    .line 1
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_86()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_62()Z
    .locals 2

    .line 1
    const/16 v0, 0x37

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_87()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private jj_3R_63()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3_26()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 11
    .line 12
    invoke-direct {p0}, Lbsh/Parser;->jj_3_27()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 19
    .line 20
    const/16 v1, 0x52

    .line 21
    .line 22
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 29
    .line 30
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_88()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 37
    .line 38
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_89()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 45
    .line 46
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_90()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 53
    .line 54
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_91()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 61
    .line 62
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_92()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 69
    .line 70
    const/4 v1, 0x1

    .line 71
    iput-boolean v1, p0, Lbsh/Parser;->jj_lookingAhead:Z

    .line 72
    .line 73
    invoke-virtual {p0}, Lbsh/Parser;->isRegularForStatement()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    iput-boolean v3, p0, Lbsh/Parser;->jj_semLA:Z

    .line 78
    .line 79
    iput-boolean v2, p0, Lbsh/Parser;->jj_lookingAhead:Z

    .line 80
    .line 81
    if-eqz v3, :cond_0

    .line 82
    .line 83
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_93()Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eqz v3, :cond_1

    .line 88
    .line 89
    :cond_0
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 90
    .line 91
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_94()Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eqz v3, :cond_1

    .line 96
    .line 97
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 98
    .line 99
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_95()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_1

    .line 104
    .line 105
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 106
    .line 107
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_96()Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-eqz v3, :cond_1

    .line 112
    .line 113
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 114
    .line 115
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_97()Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-eqz v3, :cond_1

    .line 120
    .line 121
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 122
    .line 123
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_98()Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-eqz v3, :cond_1

    .line 128
    .line 129
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 130
    .line 131
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_99()Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-eqz v3, :cond_1

    .line 136
    .line 137
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 138
    .line 139
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_100()Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eqz v0, :cond_1

    .line 144
    .line 145
    return v1

    .line 146
    :cond_1
    return v2
.end method

.method private jj_3R_64()Z
    .locals 1

    .line 1
    const/16 v0, 0x1c

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_65()Z
    .locals 2

    .line 1
    const/16 v0, 0x6e

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_52()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private jj_3R_66()Z
    .locals 2

    .line 1
    const/16 v0, 0x49

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_245()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 20
    .line 21
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_246()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 28
    .line 29
    :cond_1
    const/4 v0, 0x0

    .line 30
    return v0
.end method

.method private jj_3R_67()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_101()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_68()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_102()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_69()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_102()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_70()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_103()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_48()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method private jj_3R_71()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_104()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_72()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_105()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_73()Z
    .locals 1

    .line 1
    const/16 v0, 0x3a

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private jj_3R_74()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_52()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_75()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_106()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_107()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_76()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_50()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3_6()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_77()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_78()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_108()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_79()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_46()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_80()Z
    .locals 3

    .line 1
    const/16 v0, 0x50

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_213()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 22
    .line 23
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_214()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 30
    .line 31
    :cond_2
    const/16 v0, 0x51

    .line 32
    .line 33
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    return v1

    .line 40
    :cond_3
    const/4 v0, 0x0

    .line 41
    return v0
.end method

.method private jj_3R_81()Z
    .locals 3

    .line 1
    const/16 v0, 0x97

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    const/16 v2, 0x49

    .line 14
    .line 15
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 22
    .line 23
    const/16 v0, 0x29

    .line 24
    .line 25
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    return v1

    .line 32
    :cond_1
    const/4 v0, 0x0

    .line 33
    return v0
.end method

.method private jj_3R_82()Z
    .locals 2

    .line 1
    const/16 v0, 0x4e

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/16 v0, 0x4f

    .line 19
    .line 20
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    return v1

    .line 27
    :cond_2
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method private jj_3R_83()Z
    .locals 3

    .line 1
    const/16 v0, 0x29

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_219()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 20
    .line 21
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_220()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 28
    .line 29
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_221()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    return v1

    .line 36
    :cond_1
    const/4 v0, 0x0

    .line 37
    return v0
.end method

.method private jj_3R_84()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_110()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_85()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_111()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_141()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_86()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    const/16 v1, 0x2c

    .line 4
    .line 5
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    const/16 v1, 0x2d

    .line 14
    .line 15
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 22
    .line 23
    const/16 v1, 0x2e

    .line 24
    .line 25
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 32
    .line 33
    const/16 v1, 0x34

    .line 34
    .line 35
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 42
    .line 43
    const/16 v1, 0x1c

    .line 44
    .line 45
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 52
    .line 53
    const/16 v1, 0x28

    .line 54
    .line 55
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_0

    .line 60
    .line 61
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 62
    .line 63
    const/16 v1, 0x35

    .line 64
    .line 65
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_0

    .line 70
    .line 71
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 72
    .line 73
    const/16 v1, 0x3b

    .line 74
    .line 75
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_0

    .line 80
    .line 81
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 82
    .line 83
    const/16 v1, 0xb

    .line 84
    .line 85
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_0

    .line 90
    .line 91
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 92
    .line 93
    const/16 v1, 0x31

    .line 94
    .line 95
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_0

    .line 100
    .line 101
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 102
    .line 103
    const/16 v1, 0x32

    .line 104
    .line 105
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_0

    .line 110
    .line 111
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 112
    .line 113
    const/16 v0, 0x15

    .line 114
    .line 115
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_0

    .line 120
    .line 121
    const/4 v0, 0x1

    .line 122
    return v0

    .line 123
    :cond_0
    const/4 v0, 0x0

    .line 124
    return v0
.end method

.method private jj_3R_87()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_46()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_112()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private jj_3R_88()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_113()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_48()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method private jj_3R_89()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_114()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_90()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_115()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_91()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_116()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_92()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_117()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_93()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_118()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_94()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_119()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_95()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_120()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_96()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_121()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_97()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_122()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_98()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_123()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3R_99()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_124()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3_1()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_41()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3_10()Z
    .locals 2

    .line 1
    const/16 v0, 0x50

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x51

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method private jj_3_11()Z
    .locals 2

    .line 1
    const/16 v0, 0x54

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x49

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 21
    .line 22
    invoke-direct {p0}, Lbsh/Parser;->jj_3_12()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method private jj_3_12()Z
    .locals 2

    .line 1
    const/16 v0, 0x50

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x51

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method private jj_3_13()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_54()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 11
    .line 12
    const/16 v0, 0x49

    .line 13
    .line 14
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    return v2

    .line 21
    :cond_0
    const/16 v0, 0x90

    .line 22
    .line 23
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    return v2

    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method private jj_3_14()Z
    .locals 2

    .line 1
    const/16 v0, 0x4c

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_52()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/16 v0, 0x4d

    .line 19
    .line 20
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    return v1

    .line 27
    :cond_2
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method private jj_3_15()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_55()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3_16()Z
    .locals 3

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_46()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/16 v0, 0x4c

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 19
    .line 20
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_56()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 27
    .line 28
    const/16 v0, 0x4d

    .line 29
    .line 30
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    return v1

    .line 37
    :cond_2
    const/4 v0, 0x0

    .line 38
    return v0
.end method

.method private jj_3_17()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_52()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/16 v0, 0x54

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/16 v0, 0xe

    .line 19
    .line 20
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    return v1

    .line 27
    :cond_2
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method private jj_3_18()Z
    .locals 2

    .line 1
    const/16 v0, 0x54

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0xe

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method private jj_3_19()Z
    .locals 2

    .line 1
    const/16 v0, 0x99

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x49

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 21
    .line 22
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_215()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 29
    .line 30
    :cond_2
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method private jj_3_2()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_41()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3_20()Z
    .locals 2

    .line 1
    const/16 v0, 0x54

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x49

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 21
    .line 22
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_216()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 29
    .line 30
    :cond_2
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method private jj_3_21()Z
    .locals 2

    .line 1
    const/16 v0, 0x54

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_57()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private jj_3_22()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_58()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3_23()Z
    .locals 2

    .line 1
    const/16 v0, 0x50

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/16 v0, 0x51

    .line 19
    .line 20
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    return v1

    .line 27
    :cond_2
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method private jj_3_24()Z
    .locals 2

    .line 1
    const/16 v0, 0x50

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x51

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method private jj_3_25()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3_23()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    invoke-direct {p0}, Lbsh/Parser;->jj_3_23()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 20
    .line 21
    invoke-direct {p0}, Lbsh/Parser;->jj_3_24()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return v0
.end method

.method private jj_3_26()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_60()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3_27()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_58()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3_28()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_41()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3_29()Z
    .locals 3

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_61()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    const/16 v2, 0xe

    .line 12
    .line 13
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 20
    .line 21
    const/16 v2, 0x26

    .line 22
    .line 23
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 30
    .line 31
    const/16 v0, 0x19

    .line 32
    .line 33
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    return v1

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    return v0
.end method

.method private jj_3_3()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_42()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_43()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_44()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    return v1

    .line 23
    :cond_2
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method private jj_3_30()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_61()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_42()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_43()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    return v1

    .line 23
    :cond_2
    const/16 v0, 0x4c

    .line 24
    .line 25
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    return v1

    .line 32
    :cond_3
    const/4 v0, 0x0

    .line 33
    return v0
.end method

.method private jj_3_31()Z
    .locals 3

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_61()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_43()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_44()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    return v1

    .line 23
    :cond_2
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 24
    .line 25
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_62()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_3

    .line 30
    .line 31
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 32
    .line 33
    :cond_3
    const/16 v0, 0x4e

    .line 34
    .line 35
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    return v1

    .line 42
    :cond_4
    const/4 v0, 0x0

    .line 43
    return v0
.end method

.method private jj_3_32()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_61()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_52()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    const/16 v0, 0x49

    .line 17
    .line 18
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    return v1

    .line 25
    :cond_2
    const/4 v0, 0x0

    .line 26
    return v0
.end method

.method private jj_3_33()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_63()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3_34()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_41()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3_35()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_63()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3_36()Z
    .locals 2

    .line 1
    const/16 v0, 0x1f

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x4c

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    const/16 v0, 0x49

    .line 21
    .line 22
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    return v1

    .line 29
    :cond_2
    const/16 v0, 0x96

    .line 30
    .line 31
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    return v1

    .line 38
    :cond_3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_59()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    return v1

    .line 45
    :cond_4
    const/16 v0, 0x4d

    .line 46
    .line 47
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_5

    .line 52
    .line 53
    return v1

    .line 54
    :cond_5
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_63()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_6

    .line 59
    .line 60
    return v1

    .line 61
    :cond_6
    const/4 v0, 0x0

    .line 62
    return v0
.end method

.method private jj_3_37()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_61()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_52()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    const/16 v0, 0x49

    .line 17
    .line 18
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    return v1

    .line 25
    :cond_2
    const/4 v0, 0x0

    .line 26
    return v0
.end method

.method private jj_3_38()Z
    .locals 2

    .line 1
    const/16 v0, 0x49

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x52

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method private jj_3_39()Z
    .locals 2

    .line 1
    const/16 v0, 0x49

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x52

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method private jj_3_4()Z
    .locals 3

    .line 1
    const/16 v0, 0x23

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 12
    .line 13
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_45()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 20
    .line 21
    :cond_1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_46()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    return v1

    .line 28
    :cond_2
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 29
    .line 30
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_47()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 37
    .line 38
    :cond_3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_48()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    return v1

    .line 45
    :cond_4
    const/4 v0, 0x0

    .line 46
    return v0
.end method

.method private jj_3_40()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_64()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_52()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    return v1

    .line 19
    :cond_1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 20
    .line 21
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_65()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 28
    .line 29
    const/16 v0, 0x49

    .line 30
    .line 31
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    return v1

    .line 38
    :cond_2
    const/4 v0, 0x0

    .line 39
    return v0
.end method

.method private jj_3_41()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_52()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_66()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method private jj_3_5()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_49()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private jj_3_6()Z
    .locals 2

    .line 1
    const/16 v0, 0x53

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_50()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private jj_3_7()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_51()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 10
    .line 11
    :cond_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_52()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    return v1

    .line 19
    :cond_1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 20
    .line 21
    invoke-direct {p0}, Lbsh/Parser;->jj_3R_53()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 28
    .line 29
    :cond_2
    const/16 v0, 0x49

    .line 30
    .line 31
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    return v1

    .line 38
    :cond_3
    const/4 v0, 0x0

    .line 39
    return v0
.end method

.method private jj_3_8()Z
    .locals 2

    .line 1
    const/16 v0, 0x50

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x51

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method private jj_3_9()Z
    .locals 2

    .line 1
    const/16 v0, 0x54

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/16 v0, 0x49

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_scan_token(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method private jj_add_error_token(II)V
    .locals 6

    .line 1
    const/16 v0, 0x64

    .line 2
    .line 3
    if-lt p2, v0, :cond_0

    .line 4
    .line 5
    goto :goto_3

    .line 6
    :cond_0
    iget v0, p0, Lbsh/Parser;->jj_endpos:I

    .line 7
    .line 8
    add-int/lit8 v1, v0, 0x1

    .line 9
    .line 10
    if-ne p2, v1, :cond_1

    .line 11
    .line 12
    iget-object p2, p0, Lbsh/Parser;->jj_lasttokens:[I

    .line 13
    .line 14
    add-int/lit8 v1, v0, 0x1

    .line 15
    .line 16
    iput v1, p0, Lbsh/Parser;->jj_endpos:I

    .line 17
    .line 18
    aput p1, p2, v0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    if-eqz v0, :cond_7

    .line 22
    .line 23
    new-array v0, v0, [I

    .line 24
    .line 25
    iput-object v0, p0, Lbsh/Parser;->jj_expentry:[I

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    move v1, v0

    .line 29
    :goto_0
    iget v2, p0, Lbsh/Parser;->jj_endpos:I

    .line 30
    .line 31
    if-ge v1, v2, :cond_2

    .line 32
    .line 33
    iget-object v2, p0, Lbsh/Parser;->jj_expentry:[I

    .line 34
    .line 35
    iget-object v3, p0, Lbsh/Parser;->jj_lasttokens:[I

    .line 36
    .line 37
    aget v3, v3, v1

    .line 38
    .line 39
    aput v3, v2, v1

    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    iget-object v1, p0, Lbsh/Parser;->jj_expentries:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_6

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, [I

    .line 61
    .line 62
    array-length v3, v2

    .line 63
    iget-object v4, p0, Lbsh/Parser;->jj_expentry:[I

    .line 64
    .line 65
    array-length v4, v4

    .line 66
    if-ne v3, v4, :cond_3

    .line 67
    .line 68
    move v3, v0

    .line 69
    :goto_2
    iget-object v4, p0, Lbsh/Parser;->jj_expentry:[I

    .line 70
    .line 71
    array-length v5, v4

    .line 72
    if-ge v3, v5, :cond_5

    .line 73
    .line 74
    aget v5, v2, v3

    .line 75
    .line 76
    aget v4, v4, v3

    .line 77
    .line 78
    if-eq v5, v4, :cond_4

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    iget-object v0, p0, Lbsh/Parser;->jj_expentries:Ljava/util/List;

    .line 85
    .line 86
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    :cond_6
    if-eqz p2, :cond_7

    .line 90
    .line 91
    iput p2, p0, Lbsh/Parser;->jj_endpos:I

    .line 92
    .line 93
    iget-object v0, p0, Lbsh/Parser;->jj_lasttokens:[I

    .line 94
    .line 95
    add-int/lit8 p2, p2, -0x1

    .line 96
    .line 97
    aput p1, v0, p2

    .line 98
    .line 99
    :cond_7
    :goto_3
    return-void
.end method

.method private jj_consume_token(I)Lbsh/Token;
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 2
    .line 3
    iget-object v1, v0, Lbsh/Token;->next:Lbsh/Token;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iput-object v1, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v1, p0, Lbsh/Parser;->token_source:Lbsh/ParserTokenManager;

    .line 11
    .line 12
    invoke-virtual {v1}, Lbsh/ParserTokenManager;->getNextToken()Lbsh/Token;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, v0, Lbsh/Token;->next:Lbsh/Token;

    .line 17
    .line 18
    iget-object v1, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 19
    .line 20
    iget-object v1, v1, Lbsh/Token;->next:Lbsh/Token;

    .line 21
    .line 22
    iput-object v1, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 23
    .line 24
    :goto_0
    const/4 v1, -0x1

    .line 25
    iput v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 26
    .line 27
    iget-object v1, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 28
    .line 29
    iget v1, v1, Lbsh/Token;->kind:I

    .line 30
    .line 31
    if-ne v1, p1, :cond_4

    .line 32
    .line 33
    iget p1, p0, Lbsh/Parser;->jj_gen:I

    .line 34
    .line 35
    add-int/lit8 p1, p1, 0x1

    .line 36
    .line 37
    iput p1, p0, Lbsh/Parser;->jj_gen:I

    .line 38
    .line 39
    iget p1, p0, Lbsh/Parser;->jj_gc:I

    .line 40
    .line 41
    add-int/lit8 p1, p1, 0x1

    .line 42
    .line 43
    iput p1, p0, Lbsh/Parser;->jj_gc:I

    .line 44
    .line 45
    const/16 v0, 0x64

    .line 46
    .line 47
    if-le p1, v0, :cond_3

    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    iput p1, p0, Lbsh/Parser;->jj_gc:I

    .line 51
    .line 52
    :goto_1
    iget-object v0, p0, Lbsh/Parser;->jj_2_rtns:[Lbsh/Parser$JJCalls;

    .line 53
    .line 54
    array-length v1, v0

    .line 55
    if-ge p1, v1, :cond_3

    .line 56
    .line 57
    aget-object v0, v0, p1

    .line 58
    .line 59
    :goto_2
    if-eqz v0, :cond_2

    .line 60
    .line 61
    iget v1, v0, Lbsh/Parser$JJCalls;->gen:I

    .line 62
    .line 63
    iget v2, p0, Lbsh/Parser;->jj_gen:I

    .line 64
    .line 65
    if-ge v1, v2, :cond_1

    .line 66
    .line 67
    const/4 v1, 0x0

    .line 68
    iput-object v1, v0, Lbsh/Parser$JJCalls;->first:Lbsh/Token;

    .line 69
    .line 70
    :cond_1
    iget-object v0, v0, Lbsh/Parser$JJCalls;->next:Lbsh/Parser$JJCalls;

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    iget-object p1, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 77
    .line 78
    return-object p1

    .line 79
    :cond_4
    iput-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 80
    .line 81
    iput p1, p0, Lbsh/Parser;->jj_kind:I

    .line 82
    .line 83
    invoke-virtual {p0}, Lbsh/Parser;->generateParseException()Lbsh/ParseException;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    throw p1
.end method

.method private static jj_la1_init_0()V
    .locals 1

    .line 1
    const/16 v0, 0x7b

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lbsh/Parser;->jj_la1_0:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x1
        0x10200800
        0x10200800
        0x4000000
        0x0
        0x4000000
        0x4000
        0x0
        0x2004000
        0x0
        0x0
        0x0
        0x0
        0x0
        0x40849000
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x48849000    # 271488.0f
        0x48849000    # 271488.0f
        0x0
        0x0
        0x50849000
        0x10000000
        0x0
        0x0
        0x40849000
        0x40849000
        0x40849000
        0x40849000
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x48849000    # 271488.0f
        0x0
        0x48849000    # 271488.0f
        0x49849000    # 1085952.0f
        0x0
        0x49849000    # 1085952.0f
        0x8000000
        0x0
        0x48849000    # 271488.0f
        0x48849000    # 271488.0f
        0x48849000    # 271488.0f
        0x48849000    # 271488.0f
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x8000000
        0x8000000
        0x48849000    # 271488.0f
        0x0
        0x0
        0x40849000
        0x0
        0x0
        0x0
        0x48c49000    # 402560.0f
        -0x7fefe000
        0x0
        0x0
        0x0
        0x0
        0x10000
        0x10000
        0x0
        0x1000000
        0x58a49800
        0x48849000    # 271488.0f
        0x48849000    # 271488.0f
        0x10000000
        -0x80000000
        0x48849000    # 271488.0f
        0x0
        0x0
        0x0
        0x20000
        0x20000000
        0x10000000
        0x0
        0x0
        0x0
        0x0
    .end array-data
.end method

.method private static jj_la1_init_1()V
    .locals 1

    .line 1
    const/16 v0, 0x7b

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lbsh/Parser;->jj_la1_1:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x0
        0x8367100
        0x8367100
        0x0
        0x4
        0x0
        0x40
        0x4
        0x40
        0x0
        0x20000
        0x0
        0x0
        0x0
        0x100a0
        0x800000
        0x20000
        0x20000
        0x0
        0x8
        0x0
        0x0
        0x550106a0
        0x550106a0
        0x0
        0x0
        0x100a0
        0x0
        0x0
        0x0
        0x100a0
        0x40100a0
        0x100a0
        0x100a0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x10
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x550106a0
        0x0
        0x550306a0
        0x550106a0
        0x0
        0x550106a0
        0x55000600
        0x0
        0x550106a0
        0x550106a0
        0x550106a0
        0x550106a0
        0x0
        0x0
        0x0
        0x200
        0x0
        0x0
        0x0
        0x0
        0x45000400    # 2048.25f
        0x1000000
        0x550106a0
        0x0
        0x0
        0x100a0
        0x200
        0x0
        0x0
        0x750906a2
        0x2508000
        0x20000
        0x808
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x5d3777a0
        0x550106a0
        0x550106a0
        0x0
        0x0
        0x550106a0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data
.end method

.method private static jj_la1_init_2()V
    .locals 1

    .line 1
    const/16 v0, 0x7b

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lbsh/Parser;->jj_la1_2:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x1000
        0x4000
        0x200
        0x80000
        0x40000
        0x200
        0x0
        0x4000
        0x0
        0x100000
        0x0
        0x10000
        0x200000
        0xc0153c8
        0xc0153c8
        0x80000
        0x80000
        0x200
        0x0
        0x0
        0x200
        0x200
        0x200
        0x0
        0x200
        0x80000
        0x200000
        0x200000
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x10000000
        0x10000000
        0x0
        -0x1c400000
        -0x1c400000
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0xc000000
        0x0
        0x0
        0x0
        0xc000000
        0x153c8
        0x1200
        0xc0153c8
        0xc0153c8
        0x80000
        0xc0153c8
        0x151c8
        0x200
        0xc0153c8
        0xc0153c8
        0xc0153c8
        0xc0153c8
        0x0
        0x0
        0x0
        0x200
        0x1000
        0x1000
        0x10000
        0x4000
        0x1c8
        0x0
        0xc0153c8
        0x80000
        0x15000
        0x14200
        0x14000
        0x10000
        0x14000
        0xc0553c8
        0x0
        0x0
        0x0
        0x40000
        0x40000
        0x0
        0x0
        0x40000
        0x0
        0xc0153c8
        0xc0153c8
        0xc0153c8
        0x0
        0x0
        0xc0153c8
        0x80000
        0x80000
        0x1000
        0x0
        0x0
        0x0
        0x0
        0x200
        0x40000
        0x200
    .end array-data
.end method

.method private static jj_la1_init_3()V
    .locals 1

    .line 1
    const/16 v0, 0x7b

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lbsh/Parser;->jj_la1_3:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x3c0
        0x3c0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        -0x10000000
        -0x10000000
        0x0
        0x0
        0x0
        0xc
        0xc
        0x30
        0x30
        0xc000
        0xc000
        0x30000
        0x30000
        0x3000
        0x3000
        0x2
        0x2
        0x0
        0x1
        0x1
        0xfc00000
        0xfc00000
        0x300
        0x300
        0xc0c00
        0xc0c00
        0x300000
        0x300000
        0x300
        0xc0
        0xc0
        0xc0
        0x3c0
        0x0
        0x0
        0x3c0
        0x3c0
        0x0
        0x3c0
        0x0
        0x0
        0x3c0
        0x3c0
        0x3c0
        0x3c0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x3c0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x3c0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x3c0
        0x3c0
        0x3c0
        0x0
        0x0
        0x3c0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x4000
        0x0
        0x0
        0x0
    .end array-data
.end method

.method private static jj_la1_init_4()V
    .locals 1

    .line 1
    const/16 v0, 0x7b

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lbsh/Parser;->jj_la1_4:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x1000000
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x4ffff
        0x4ffff
        0x200000
        0x1a0000
        0x1a0000
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x400000
        0xc00000
        0xc00000
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x4000000
        0x4000000
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data
.end method

.method private jj_ntk_f()I
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 2
    .line 3
    iget-object v1, v0, Lbsh/Token;->next:Lbsh/Token;

    .line 4
    .line 5
    iput-object v1, p0, Lbsh/Parser;->jj_nt:Lbsh/Token;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lbsh/Parser;->token_source:Lbsh/ParserTokenManager;

    .line 10
    .line 11
    invoke-virtual {v1}, Lbsh/ParserTokenManager;->getNextToken()Lbsh/Token;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iput-object v1, v0, Lbsh/Token;->next:Lbsh/Token;

    .line 16
    .line 17
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 18
    .line 19
    iget-object v0, v0, Lbsh/Token;->next:Lbsh/Token;

    .line 20
    .line 21
    iget v0, v0, Lbsh/Token;->kind:I

    .line 22
    .line 23
    iput v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 24
    .line 25
    return v0

    .line 26
    :cond_0
    iget v0, v1, Lbsh/Token;->kind:I

    .line 27
    .line 28
    iput v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 29
    .line 30
    return v0
.end method

.method private jj_rescan_token()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lbsh/Parser;->jj_rescan:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    move v1, v0

    .line 6
    :goto_0
    const/16 v2, 0x29

    .line 7
    .line 8
    if-ge v1, v2, :cond_2

    .line 9
    .line 10
    :try_start_0
    iget-object v2, p0, Lbsh/Parser;->jj_2_rtns:[Lbsh/Parser$JJCalls;

    .line 11
    .line 12
    aget-object v2, v2, v1

    .line 13
    .line 14
    :cond_0
    iget v3, v2, Lbsh/Parser$JJCalls;->gen:I

    .line 15
    .line 16
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 17
    .line 18
    if-le v3, v4, :cond_1

    .line 19
    .line 20
    iget v3, v2, Lbsh/Parser$JJCalls;->arg:I

    .line 21
    .line 22
    iput v3, p0, Lbsh/Parser;->jj_la:I

    .line 23
    .line 24
    iget-object v3, v2, Lbsh/Parser$JJCalls;->first:Lbsh/Token;

    .line 25
    .line 26
    iput-object v3, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 27
    .line 28
    iput-object v3, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 29
    .line 30
    packed-switch v1, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    goto/16 :goto_1

    .line 34
    .line 35
    :pswitch_0
    invoke-direct {p0}, Lbsh/Parser;->jj_3_41()Z

    .line 36
    .line 37
    .line 38
    goto/16 :goto_1

    .line 39
    .line 40
    :pswitch_1
    invoke-direct {p0}, Lbsh/Parser;->jj_3_40()Z

    .line 41
    .line 42
    .line 43
    goto/16 :goto_1

    .line 44
    .line 45
    :pswitch_2
    invoke-direct {p0}, Lbsh/Parser;->jj_3_39()Z

    .line 46
    .line 47
    .line 48
    goto/16 :goto_1

    .line 49
    .line 50
    :pswitch_3
    invoke-direct {p0}, Lbsh/Parser;->jj_3_38()Z

    .line 51
    .line 52
    .line 53
    goto/16 :goto_1

    .line 54
    .line 55
    :pswitch_4
    invoke-direct {p0}, Lbsh/Parser;->jj_3_37()Z

    .line 56
    .line 57
    .line 58
    goto/16 :goto_1

    .line 59
    .line 60
    :pswitch_5
    invoke-direct {p0}, Lbsh/Parser;->jj_3_36()Z

    .line 61
    .line 62
    .line 63
    goto/16 :goto_1

    .line 64
    .line 65
    :pswitch_6
    invoke-direct {p0}, Lbsh/Parser;->jj_3_35()Z

    .line 66
    .line 67
    .line 68
    goto/16 :goto_1

    .line 69
    .line 70
    :pswitch_7
    invoke-direct {p0}, Lbsh/Parser;->jj_3_34()Z

    .line 71
    .line 72
    .line 73
    goto/16 :goto_1

    .line 74
    .line 75
    :pswitch_8
    invoke-direct {p0}, Lbsh/Parser;->jj_3_33()Z

    .line 76
    .line 77
    .line 78
    goto/16 :goto_1

    .line 79
    .line 80
    :pswitch_9
    invoke-direct {p0}, Lbsh/Parser;->jj_3_32()Z

    .line 81
    .line 82
    .line 83
    goto/16 :goto_1

    .line 84
    .line 85
    :pswitch_a
    invoke-direct {p0}, Lbsh/Parser;->jj_3_31()Z

    .line 86
    .line 87
    .line 88
    goto/16 :goto_1

    .line 89
    .line 90
    :pswitch_b
    invoke-direct {p0}, Lbsh/Parser;->jj_3_30()Z

    .line 91
    .line 92
    .line 93
    goto/16 :goto_1

    .line 94
    .line 95
    :pswitch_c
    invoke-direct {p0}, Lbsh/Parser;->jj_3_29()Z

    .line 96
    .line 97
    .line 98
    goto/16 :goto_1

    .line 99
    .line 100
    :pswitch_d
    invoke-direct {p0}, Lbsh/Parser;->jj_3_28()Z

    .line 101
    .line 102
    .line 103
    goto/16 :goto_1

    .line 104
    .line 105
    :pswitch_e
    invoke-direct {p0}, Lbsh/Parser;->jj_3_27()Z

    .line 106
    .line 107
    .line 108
    goto/16 :goto_1

    .line 109
    .line 110
    :pswitch_f
    invoke-direct {p0}, Lbsh/Parser;->jj_3_26()Z

    .line 111
    .line 112
    .line 113
    goto/16 :goto_1

    .line 114
    .line 115
    :pswitch_10
    invoke-direct {p0}, Lbsh/Parser;->jj_3_25()Z

    .line 116
    .line 117
    .line 118
    goto/16 :goto_1

    .line 119
    .line 120
    :pswitch_11
    invoke-direct {p0}, Lbsh/Parser;->jj_3_24()Z

    .line 121
    .line 122
    .line 123
    goto/16 :goto_1

    .line 124
    .line 125
    :pswitch_12
    invoke-direct {p0}, Lbsh/Parser;->jj_3_23()Z

    .line 126
    .line 127
    .line 128
    goto/16 :goto_1

    .line 129
    .line 130
    :pswitch_13
    invoke-direct {p0}, Lbsh/Parser;->jj_3_22()Z

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :pswitch_14
    invoke-direct {p0}, Lbsh/Parser;->jj_3_21()Z

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :pswitch_15
    invoke-direct {p0}, Lbsh/Parser;->jj_3_20()Z

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :pswitch_16
    invoke-direct {p0}, Lbsh/Parser;->jj_3_19()Z

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :pswitch_17
    invoke-direct {p0}, Lbsh/Parser;->jj_3_18()Z

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :pswitch_18
    invoke-direct {p0}, Lbsh/Parser;->jj_3_17()Z

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :pswitch_19
    invoke-direct {p0}, Lbsh/Parser;->jj_3_16()Z

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :pswitch_1a
    invoke-direct {p0}, Lbsh/Parser;->jj_3_15()Z

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :pswitch_1b
    invoke-direct {p0}, Lbsh/Parser;->jj_3_14()Z

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :pswitch_1c
    invoke-direct {p0}, Lbsh/Parser;->jj_3_13()Z

    .line 167
    .line 168
    .line 169
    goto :goto_1

    .line 170
    :pswitch_1d
    invoke-direct {p0}, Lbsh/Parser;->jj_3_12()Z

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :pswitch_1e
    invoke-direct {p0}, Lbsh/Parser;->jj_3_11()Z

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :pswitch_1f
    invoke-direct {p0}, Lbsh/Parser;->jj_3_10()Z

    .line 179
    .line 180
    .line 181
    goto :goto_1

    .line 182
    :pswitch_20
    invoke-direct {p0}, Lbsh/Parser;->jj_3_9()Z

    .line 183
    .line 184
    .line 185
    goto :goto_1

    .line 186
    :pswitch_21
    invoke-direct {p0}, Lbsh/Parser;->jj_3_8()Z

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :pswitch_22
    invoke-direct {p0}, Lbsh/Parser;->jj_3_7()Z

    .line 191
    .line 192
    .line 193
    goto :goto_1

    .line 194
    :pswitch_23
    invoke-direct {p0}, Lbsh/Parser;->jj_3_6()Z

    .line 195
    .line 196
    .line 197
    goto :goto_1

    .line 198
    :pswitch_24
    invoke-direct {p0}, Lbsh/Parser;->jj_3_5()Z

    .line 199
    .line 200
    .line 201
    goto :goto_1

    .line 202
    :pswitch_25
    invoke-direct {p0}, Lbsh/Parser;->jj_3_4()Z

    .line 203
    .line 204
    .line 205
    goto :goto_1

    .line 206
    :pswitch_26
    invoke-direct {p0}, Lbsh/Parser;->jj_3_3()Z

    .line 207
    .line 208
    .line 209
    goto :goto_1

    .line 210
    :pswitch_27
    invoke-direct {p0}, Lbsh/Parser;->jj_3_2()Z

    .line 211
    .line 212
    .line 213
    goto :goto_1

    .line 214
    :pswitch_28
    invoke-direct {p0}, Lbsh/Parser;->jj_3_1()Z

    .line 215
    .line 216
    .line 217
    :cond_1
    :goto_1
    iget-object v2, v2, Lbsh/Parser$JJCalls;->next:Lbsh/Parser$JJCalls;
    :try_end_0
    .catch Lbsh/Parser$LookaheadSuccess; {:try_start_0 .. :try_end_0} :catch_0

    .line 218
    .line 219
    if-nez v2, :cond_0

    .line 220
    .line 221
    :catch_0
    add-int/lit8 v1, v1, 0x1

    .line 222
    .line 223
    goto/16 :goto_0

    .line 224
    .line 225
    :cond_2
    iput-boolean v0, p0, Lbsh/Parser;->jj_rescan:Z

    .line 226
    .line 227
    return-void

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private jj_save(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_2_rtns:[Lbsh/Parser$JJCalls;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    :goto_0
    iget v0, p1, Lbsh/Parser$JJCalls;->gen:I

    .line 6
    .line 7
    iget v1, p0, Lbsh/Parser;->jj_gen:I

    .line 8
    .line 9
    if-le v0, v1, :cond_1

    .line 10
    .line 11
    iget-object v0, p1, Lbsh/Parser$JJCalls;->next:Lbsh/Parser$JJCalls;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lbsh/Parser$JJCalls;

    .line 16
    .line 17
    invoke-direct {v0}, Lbsh/Parser$JJCalls;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p1, Lbsh/Parser$JJCalls;->next:Lbsh/Parser$JJCalls;

    .line 21
    .line 22
    move-object p1, v0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move-object p1, v0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    :goto_1
    iget v0, p0, Lbsh/Parser;->jj_gen:I

    .line 27
    .line 28
    add-int/2addr v0, p2

    .line 29
    iget v1, p0, Lbsh/Parser;->jj_la:I

    .line 30
    .line 31
    sub-int/2addr v0, v1

    .line 32
    iput v0, p1, Lbsh/Parser$JJCalls;->gen:I

    .line 33
    .line 34
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 35
    .line 36
    iput-object v0, p1, Lbsh/Parser$JJCalls;->first:Lbsh/Token;

    .line 37
    .line 38
    iput p2, p1, Lbsh/Parser$JJCalls;->arg:I

    .line 39
    .line 40
    return-void
.end method

.method private jj_scan_token(I)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 2
    .line 3
    iget-object v1, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    .line 8
    iget v1, p0, Lbsh/Parser;->jj_la:I

    .line 9
    .line 10
    sub-int/2addr v1, v2

    .line 11
    iput v1, p0, Lbsh/Parser;->jj_la:I

    .line 12
    .line 13
    iget-object v1, v0, Lbsh/Token;->next:Lbsh/Token;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lbsh/Parser;->token_source:Lbsh/ParserTokenManager;

    .line 18
    .line 19
    invoke-virtual {v1}, Lbsh/ParserTokenManager;->getNextToken()Lbsh/Token;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, v0, Lbsh/Token;->next:Lbsh/Token;

    .line 24
    .line 25
    iput-object v1, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 26
    .line 27
    iput-object v1, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iput-object v1, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 31
    .line 32
    iput-object v1, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object v0, v0, Lbsh/Token;->next:Lbsh/Token;

    .line 36
    .line 37
    iput-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 38
    .line 39
    :goto_0
    iget-boolean v0, p0, Lbsh/Parser;->jj_rescan:Z

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 45
    .line 46
    move v3, v1

    .line 47
    :goto_1
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget-object v4, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 50
    .line 51
    if-eq v0, v4, :cond_2

    .line 52
    .line 53
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    iget-object v0, v0, Lbsh/Token;->next:Lbsh/Token;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    if-eqz v0, :cond_3

    .line 59
    .line 60
    invoke-direct {p0, p1, v3}, Lbsh/Parser;->jj_add_error_token(II)V

    .line 61
    .line 62
    .line 63
    :cond_3
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 64
    .line 65
    iget v3, v0, Lbsh/Token;->kind:I

    .line 66
    .line 67
    if-eq v3, p1, :cond_4

    .line 68
    .line 69
    return v2

    .line 70
    :cond_4
    iget p1, p0, Lbsh/Parser;->jj_la:I

    .line 71
    .line 72
    if-nez p1, :cond_6

    .line 73
    .line 74
    iget-object p1, p0, Lbsh/Parser;->jj_lastpos:Lbsh/Token;

    .line 75
    .line 76
    if-eq v0, p1, :cond_5

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_5
    iget-object p1, p0, Lbsh/Parser;->jj_ls:Lbsh/Parser$LookaheadSuccess;

    .line 80
    .line 81
    throw p1

    .line 82
    :cond_6
    :goto_2
    return v1
.end method

.method public static main([Ljava/lang/String;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v1, p0, v0

    .line 3
    .line 4
    const-string v2, "-p"

    .line 5
    .line 6
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    move v0, v2

    .line 14
    :cond_0
    move v1, v0

    .line 15
    :goto_0
    array-length v3, p0

    .line 16
    if-ge v0, v3, :cond_3

    .line 17
    .line 18
    new-instance v3, Lbsh/FileReader;

    .line 19
    .line 20
    aget-object v4, p0, v0

    .line 21
    .line 22
    invoke-direct {v3, v4}, Lbsh/FileReader;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v4, Lbsh/Parser;

    .line 26
    .line 27
    invoke-direct {v4, v3}, Lbsh/Parser;-><init>(Ljava/io/Reader;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4, v2}, Lbsh/Parser;->setRetainComments(Z)V

    .line 31
    .line 32
    .line 33
    :cond_1
    :goto_1
    invoke-virtual {v4}, Lbsh/Parser;->Line()Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-nez v5, :cond_2

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 42
    .line 43
    invoke-virtual {v4}, Lbsh/Parser;->popNode()Lbsh/SimpleNode;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    invoke-virtual {v3}, Ljava/io/Reader;->close()V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v0, v0, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    return-void
.end method


# virtual methods
.method public final AdditiveExpression()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lbsh/Parser;->MultiplicativeExpression()V

    .line 2
    .line 3
    .line 4
    :goto_0
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :cond_0
    const/16 v2, 0x69

    .line 14
    .line 15
    const/16 v3, 0x68

    .line 16
    .line 17
    if-eq v0, v3, :cond_1

    .line 18
    .line 19
    if-eq v0, v2, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 22
    .line 23
    const/16 v1, 0x39

    .line 24
    .line 25
    iget v2, p0, Lbsh/Parser;->jj_gen:I

    .line 26
    .line 27
    aput v2, v0, v1

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 31
    .line 32
    if-ne v0, v1, :cond_2

    .line 33
    .line 34
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    :cond_2
    if-eq v0, v3, :cond_4

    .line 39
    .line 40
    if-ne v0, v2, :cond_3

    .line 41
    .line 42
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 48
    .line 49
    const/16 v2, 0x3a

    .line 50
    .line 51
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 52
    .line 53
    aput v3, v0, v2

    .line 54
    .line 55
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 56
    .line 57
    .line 58
    invoke-static {}, Lbsh/j;->a()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_4
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :goto_1
    invoke-virtual {p0}, Lbsh/Parser;->MultiplicativeExpression()V

    .line 67
    .line 68
    .line 69
    new-instance v1, Lbsh/BSHBinaryExpression;

    .line 70
    .line 71
    const/16 v2, 0x11

    .line 72
    .line 73
    invoke-direct {v1, v2}, Lbsh/BSHBinaryExpression;-><init>(I)V

    .line 74
    .line 75
    .line 76
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 77
    .line 78
    invoke-virtual {v2, v1}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 82
    .line 83
    .line 84
    const/4 v2, 0x2

    .line 85
    const/4 v3, 0x1

    .line 86
    :try_start_0
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 87
    .line 88
    invoke-virtual {v4, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 89
    .line 90
    .line 91
    const/4 v3, 0x0

    .line 92
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 93
    .line 94
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_5

    .line 99
    .line 100
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    goto :goto_3

    .line 106
    :cond_5
    :goto_2
    iget v0, v0, Lbsh/Token;->kind:I

    .line 107
    .line 108
    iput v0, v1, Lbsh/BSHBinaryExpression;->kind:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :goto_3
    if-eqz v3, :cond_6

    .line 112
    .line 113
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 114
    .line 115
    invoke-virtual {v3, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 116
    .line 117
    .line 118
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 119
    .line 120
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_6

    .line 125
    .line 126
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 127
    .line 128
    .line 129
    :cond_6
    throw v0
.end method

.method public final AllocationExpression()V
    .locals 7

    .line 1
    new-instance v0, Lbsh/BSHAllocationExpression;

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHAllocationExpression;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    :try_start_0
    iget v2, p0, Lbsh/Parser;->jj_ntk:I

    .line 18
    .line 19
    const/4 v3, -0x1

    .line 20
    if-ne v2, v3, :cond_0

    .line 21
    .line 22
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v2

    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    :cond_0
    :goto_0
    const/16 v4, 0x50

    .line 31
    .line 32
    const/16 v5, 0x4e

    .line 33
    .line 34
    const/16 v6, 0x29

    .line 35
    .line 36
    if-eq v2, v6, :cond_3

    .line 37
    .line 38
    if-eq v2, v5, :cond_2

    .line 39
    .line 40
    if-ne v2, v4, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-object v2, p0, Lbsh/Parser;->jj_la1:[I

    .line 44
    .line 45
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 46
    .line 47
    const/16 v5, 0x5e

    .line 48
    .line 49
    aput v4, v2, v5

    .line 50
    .line 51
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 52
    .line 53
    .line 54
    new-instance v2, Lbsh/ParseException;

    .line 55
    .line 56
    invoke-direct {v2}, Lbsh/ParseException;-><init>()V

    .line 57
    .line 58
    .line 59
    throw v2

    .line 60
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lbsh/Parser;->ArrayDimensions()V

    .line 61
    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    invoke-direct {p0, v6}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 65
    .line 66
    .line 67
    iget v2, p0, Lbsh/Parser;->jj_ntk:I

    .line 68
    .line 69
    if-ne v2, v3, :cond_4

    .line 70
    .line 71
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    :cond_4
    sparse-switch v2, :sswitch_data_0

    .line 76
    .line 77
    .line 78
    iget-object v2, p0, Lbsh/Parser;->jj_la1:[I

    .line 79
    .line 80
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 81
    .line 82
    const/16 v5, 0x5d

    .line 83
    .line 84
    aput v4, v2, v5

    .line 85
    .line 86
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 87
    .line 88
    .line 89
    new-instance v2, Lbsh/ParseException;

    .line 90
    .line 91
    invoke-direct {v2}, Lbsh/ParseException;-><init>()V

    .line 92
    .line 93
    .line 94
    throw v2

    .line 95
    :sswitch_0
    invoke-virtual {p0}, Lbsh/Parser;->ArrayDimensions()V

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :sswitch_1
    invoke-virtual {p0}, Lbsh/Parser;->AmbiguousName()V

    .line 100
    .line 101
    .line 102
    iget v2, p0, Lbsh/Parser;->jj_ntk:I

    .line 103
    .line 104
    if-ne v2, v3, :cond_5

    .line 105
    .line 106
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    :cond_5
    const/16 v6, 0x4c

    .line 111
    .line 112
    if-eq v2, v6, :cond_8

    .line 113
    .line 114
    if-eq v2, v5, :cond_7

    .line 115
    .line 116
    if-ne v2, v4, :cond_6

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_6
    iget-object v2, p0, Lbsh/Parser;->jj_la1:[I

    .line 120
    .line 121
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 122
    .line 123
    const/16 v5, 0x5c

    .line 124
    .line 125
    aput v4, v2, v5

    .line 126
    .line 127
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 128
    .line 129
    .line 130
    new-instance v2, Lbsh/ParseException;

    .line 131
    .line 132
    invoke-direct {v2}, Lbsh/ParseException;-><init>()V

    .line 133
    .line 134
    .line 135
    throw v2

    .line 136
    :cond_7
    :goto_2
    invoke-virtual {p0}, Lbsh/Parser;->ArrayDimensions()V

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_8
    invoke-virtual {p0}, Lbsh/Parser;->Arguments()V

    .line 141
    .line 142
    .line 143
    const/4 v2, 0x2

    .line 144
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_2_22(I)Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-eqz v2, :cond_9

    .line 149
    .line 150
    invoke-virtual {p0}, Lbsh/Parser;->Block()V

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :sswitch_2
    invoke-virtual {p0}, Lbsh/Parser;->PrimitiveType()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Lbsh/Parser;->ArrayDimensions()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 158
    .line 159
    .line 160
    :cond_9
    :goto_3
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 161
    .line 162
    invoke-virtual {v2, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 163
    .line 164
    .line 165
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 166
    .line 167
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-eqz v1, :cond_a

    .line 172
    .line 173
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 174
    .line 175
    .line 176
    :cond_a
    return-void

    .line 177
    :goto_4
    :try_start_1
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 178
    .line 179
    invoke-virtual {v3, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 180
    .line 181
    .line 182
    const/4 v3, 0x0

    .line 183
    :try_start_2
    instance-of v4, v2, Lbsh/ParseException;

    .line 184
    .line 185
    if-nez v4, :cond_c

    .line 186
    .line 187
    instance-of v4, v2, Ljava/lang/RuntimeException;

    .line 188
    .line 189
    if-eqz v4, :cond_b

    .line 190
    .line 191
    check-cast v2, Ljava/lang/RuntimeException;

    .line 192
    .line 193
    throw v2

    .line 194
    :catchall_1
    move-exception v2

    .line 195
    goto :goto_5

    .line 196
    :cond_b
    check-cast v2, Ljava/lang/Error;

    .line 197
    .line 198
    throw v2

    .line 199
    :cond_c
    check-cast v2, Lbsh/ParseException;

    .line 200
    .line 201
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 202
    :catchall_2
    move-exception v2

    .line 203
    move v3, v1

    .line 204
    :goto_5
    if-eqz v3, :cond_d

    .line 205
    .line 206
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 207
    .line 208
    invoke-virtual {v3, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 209
    .line 210
    .line 211
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 212
    .line 213
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    if-eqz v1, :cond_d

    .line 218
    .line 219
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 220
    .line 221
    .line 222
    :cond_d
    throw v2

    .line 223
    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_2
        0xf -> :sswitch_2
        0x12 -> :sswitch_2
        0x17 -> :sswitch_2
        0x1e -> :sswitch_2
        0x25 -> :sswitch_2
        0x27 -> :sswitch_2
        0x30 -> :sswitch_2
        0x49 -> :sswitch_1
        0x4e -> :sswitch_0
        0x50 -> :sswitch_0
    .end sparse-switch
.end method

.method public final AmbiguousName()V
    .locals 8

    .line 1
    new-instance v0, Lbsh/BSHAmbiguousName;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHAmbiguousName;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x49

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    :try_start_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    new-instance v4, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    iget-object v3, v3, Lbsh/Token;->image:Ljava/lang/String;

    .line 26
    .line 27
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    const/4 v3, 0x2

    .line 31
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_2_9(I)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    const/16 v3, 0x54

    .line 38
    .line 39
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    new-instance v5, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v6, "."

    .line 52
    .line 53
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-object v3, v3, Lbsh/Token;->image:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception v1

    .line 70
    move v3, v2

    .line 71
    goto :goto_2

    .line 72
    :cond_0
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 73
    .line 74
    invoke-virtual {v1, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    :try_start_1
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 79
    .line 80
    invoke-virtual {v3}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_1

    .line 85
    .line 86
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :catchall_1
    move-exception v3

    .line 91
    move-object v7, v3

    .line 92
    move v3, v1

    .line 93
    move-object v1, v7

    .line 94
    goto :goto_2

    .line 95
    :cond_1
    :goto_1
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    iput-object v3, v0, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 100
    .line 101
    return-void

    .line 102
    :goto_2
    if-eqz v3, :cond_2

    .line 103
    .line 104
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 105
    .line 106
    invoke-virtual {v3, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 107
    .line 108
    .line 109
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 110
    .line 111
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_2

    .line 116
    .line 117
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 118
    .line 119
    .line 120
    :cond_2
    throw v1
.end method

.method public final AndExpression()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lbsh/Parser;->EqualityExpression()V

    .line 2
    .line 3
    .line 4
    :goto_0
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :cond_0
    const/16 v2, 0x6d

    .line 14
    .line 15
    const/16 v3, 0x6c

    .line 16
    .line 17
    if-eq v0, v3, :cond_1

    .line 18
    .line 19
    if-eq v0, v2, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 22
    .line 23
    const/16 v1, 0x30

    .line 24
    .line 25
    iget v2, p0, Lbsh/Parser;->jj_gen:I

    .line 26
    .line 27
    aput v2, v0, v1

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 31
    .line 32
    if-ne v0, v1, :cond_2

    .line 33
    .line 34
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    :cond_2
    if-eq v0, v3, :cond_4

    .line 39
    .line 40
    if-ne v0, v2, :cond_3

    .line 41
    .line 42
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 48
    .line 49
    const/16 v2, 0x31

    .line 50
    .line 51
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 52
    .line 53
    aput v3, v0, v2

    .line 54
    .line 55
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 56
    .line 57
    .line 58
    invoke-static {}, Lbsh/j;->a()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_4
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :goto_1
    invoke-virtual {p0}, Lbsh/Parser;->EqualityExpression()V

    .line 67
    .line 68
    .line 69
    new-instance v1, Lbsh/BSHBinaryExpression;

    .line 70
    .line 71
    const/16 v2, 0x11

    .line 72
    .line 73
    invoke-direct {v1, v2}, Lbsh/BSHBinaryExpression;-><init>(I)V

    .line 74
    .line 75
    .line 76
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 77
    .line 78
    invoke-virtual {v2, v1}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 82
    .line 83
    .line 84
    const/4 v2, 0x2

    .line 85
    const/4 v3, 0x1

    .line 86
    :try_start_0
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 87
    .line 88
    invoke-virtual {v4, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 89
    .line 90
    .line 91
    const/4 v3, 0x0

    .line 92
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 93
    .line 94
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_5

    .line 99
    .line 100
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    goto :goto_3

    .line 106
    :cond_5
    :goto_2
    iget v0, v0, Lbsh/Token;->kind:I

    .line 107
    .line 108
    iput v0, v1, Lbsh/BSHBinaryExpression;->kind:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :goto_3
    if-eqz v3, :cond_6

    .line 112
    .line 113
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 114
    .line 115
    invoke-virtual {v3, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 116
    .line 117
    .line 118
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 119
    .line 120
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_6

    .line 125
    .line 126
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 127
    .line 128
    .line 129
    :cond_6
    throw v0
.end method

.method public final ArgumentList()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V

    .line 2
    .line 3
    .line 4
    :goto_0
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :cond_0
    const/16 v1, 0x53

    .line 14
    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 18
    .line 19
    const/16 v1, 0x5b

    .line 20
    .line 21
    iget v2, p0, Lbsh/Parser;->jj_gen:I

    .line 22
    .line 23
    aput v2, v0, v1

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V

    .line 30
    .line 31
    .line 32
    goto :goto_0
.end method

.method public final Arguments()V
    .locals 5

    .line 1
    new-instance v0, Lbsh/BSHArguments;

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHArguments;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x4c

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    :try_start_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 20
    .line 21
    .line 22
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 23
    .line 24
    const/4 v3, -0x1

    .line 25
    if-ne v1, v3, :cond_0

    .line 26
    .line 27
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v1

    .line 33
    goto :goto_2

    .line 34
    :cond_0
    :goto_0
    const/16 v3, 0x29

    .line 35
    .line 36
    if-eq v1, v3, :cond_1

    .line 37
    .line 38
    const/16 v3, 0x2a

    .line 39
    .line 40
    if-eq v1, v3, :cond_1

    .line 41
    .line 42
    const/16 v3, 0x5a

    .line 43
    .line 44
    if-eq v1, v3, :cond_1

    .line 45
    .line 46
    const/16 v4, 0x5b

    .line 47
    .line 48
    if-eq v1, v4, :cond_1

    .line 49
    .line 50
    sparse-switch v1, :sswitch_data_0

    .line 51
    .line 52
    .line 53
    packed-switch v1, :pswitch_data_0

    .line 54
    .line 55
    .line 56
    packed-switch v1, :pswitch_data_1

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 60
    .line 61
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 62
    .line 63
    aput v4, v1, v3

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    :pswitch_0
    :sswitch_0
    invoke-virtual {p0}, Lbsh/Parser;->ArgumentList()V

    .line 67
    .line 68
    .line 69
    :goto_1
    const/16 v1, 0x4d

    .line 70
    .line 71
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    .line 74
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 75
    .line 76
    invoke-virtual {v1, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 80
    .line 81
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_2

    .line 86
    .line 87
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    return-void

    .line 91
    :goto_2
    :try_start_1
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 92
    .line 93
    invoke-virtual {v3, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 94
    .line 95
    .line 96
    const/4 v3, 0x0

    .line 97
    :try_start_2
    instance-of v4, v1, Lbsh/ParseException;

    .line 98
    .line 99
    if-nez v4, :cond_4

    .line 100
    .line 101
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 102
    .line 103
    if-eqz v4, :cond_3

    .line 104
    .line 105
    check-cast v1, Ljava/lang/RuntimeException;

    .line 106
    .line 107
    throw v1

    .line 108
    :catchall_1
    move-exception v1

    .line 109
    goto :goto_3

    .line 110
    :cond_3
    check-cast v1, Ljava/lang/Error;

    .line 111
    .line 112
    throw v1

    .line 113
    :cond_4
    check-cast v1, Lbsh/ParseException;

    .line 114
    .line 115
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 116
    :catchall_2
    move-exception v1

    .line 117
    move v3, v2

    .line 118
    :goto_3
    if-eqz v3, :cond_5

    .line 119
    .line 120
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 121
    .line 122
    invoke-virtual {v3, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 123
    .line 124
    .line 125
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 126
    .line 127
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-eqz v2, :cond_5

    .line 132
    .line 133
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 134
    .line 135
    .line 136
    :cond_5
    throw v1

    .line 137
    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_0
        0xf -> :sswitch_0
        0x12 -> :sswitch_0
        0x17 -> :sswitch_0
        0x1b -> :sswitch_0
        0x1e -> :sswitch_0
        0x25 -> :sswitch_0
        0x27 -> :sswitch_0
        0x30 -> :sswitch_0
        0x38 -> :sswitch_0
        0x3a -> :sswitch_0
        0x3c -> :sswitch_0
        0x3e -> :sswitch_0
        0x43 -> :sswitch_0
        0x4c -> :sswitch_0
        0x4e -> :sswitch_0
        0x50 -> :sswitch_0
    .end sparse-switch

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    :pswitch_data_0
    .packed-switch 0x46
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    :pswitch_data_1
    .packed-switch 0x66
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ArrayDimensions()V
    .locals 8

    .line 1
    new-instance v0, Lbsh/BSHArrayDimensions;

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHArrayDimensions;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x2

    .line 18
    const/4 v3, 0x1

    .line 19
    :try_start_0
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_2_25(I)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const/16 v5, 0x51

    .line 24
    .line 25
    const/16 v6, 0x50

    .line 26
    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    :goto_0
    invoke-direct {p0, v6}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lbsh/BSHArrayDimensions;->addDefinedDimension()V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_2_23(I)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    :goto_1
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_2_24(I)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_5

    .line 53
    .line 54
    invoke-direct {p0, v6}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 55
    .line 56
    .line 57
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lbsh/BSHArrayDimensions;->addUndefinedDimension()V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :catchall_0
    move-exception v2

    .line 65
    move v4, v3

    .line 66
    goto/16 :goto_4

    .line 67
    .line 68
    :cond_1
    iget v2, p0, Lbsh/Parser;->jj_ntk:I

    .line 69
    .line 70
    const/4 v4, -0x1

    .line 71
    if-ne v2, v4, :cond_2

    .line 72
    .line 73
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    :cond_2
    const/16 v7, 0x4e

    .line 78
    .line 79
    if-eq v2, v7, :cond_7

    .line 80
    .line 81
    if-ne v2, v6, :cond_6

    .line 82
    .line 83
    :cond_3
    invoke-direct {p0, v6}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 84
    .line 85
    .line 86
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Lbsh/BSHArrayDimensions;->addUndefinedDimension()V

    .line 90
    .line 91
    .line 92
    iget v2, p0, Lbsh/Parser;->jj_ntk:I

    .line 93
    .line 94
    if-ne v2, v4, :cond_4

    .line 95
    .line 96
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    :cond_4
    if-eq v2, v6, :cond_3

    .line 101
    .line 102
    iget-object v2, p0, Lbsh/Parser;->jj_la1:[I

    .line 103
    .line 104
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 105
    .line 106
    const/16 v5, 0x5f

    .line 107
    .line 108
    aput v4, v2, v5

    .line 109
    .line 110
    invoke-virtual {p0}, Lbsh/Parser;->ArrayInitializer()V

    .line 111
    .line 112
    .line 113
    :cond_5
    move v1, v3

    .line 114
    goto :goto_3

    .line 115
    :cond_6
    iget-object v2, p0, Lbsh/Parser;->jj_la1:[I

    .line 116
    .line 117
    iget v5, p0, Lbsh/Parser;->jj_gen:I

    .line 118
    .line 119
    const/16 v6, 0x60

    .line 120
    .line 121
    aput v5, v2, v6

    .line 122
    .line 123
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 124
    .line 125
    .line 126
    new-instance v2, Lbsh/ParseException;

    .line 127
    .line 128
    invoke-direct {v2}, Lbsh/ParseException;-><init>()V

    .line 129
    .line 130
    .line 131
    throw v2

    .line 132
    :cond_7
    invoke-virtual {p0}, Lbsh/Parser;->ArrayInitializer()V

    .line 133
    .line 134
    .line 135
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 136
    .line 137
    invoke-virtual {v2, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    .line 139
    .line 140
    :try_start_1
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 141
    .line 142
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-eqz v2, :cond_8

    .line 147
    .line 148
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :catchall_1
    move-exception v2

    .line 153
    move v4, v1

    .line 154
    goto :goto_4

    .line 155
    :cond_8
    :goto_2
    iput v4, v0, Lbsh/BSHArrayDimensions;->numUndefinedDims:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 156
    .line 157
    :goto_3
    if-eqz v1, :cond_9

    .line 158
    .line 159
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 160
    .line 161
    invoke-virtual {v1, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 162
    .line 163
    .line 164
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 165
    .line 166
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_9

    .line 171
    .line 172
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 173
    .line 174
    .line 175
    :cond_9
    return-void

    .line 176
    :goto_4
    iget-object v5, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 177
    .line 178
    if-eqz v4, :cond_a

    .line 179
    .line 180
    :try_start_2
    invoke-virtual {v5, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V

    .line 181
    .line 182
    .line 183
    goto :goto_5

    .line 184
    :catchall_2
    move-exception v1

    .line 185
    goto :goto_6

    .line 186
    :cond_a
    invoke-virtual {v5}, Lbsh/JJTParserState;->popNode()Lbsh/Node;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 187
    .line 188
    .line 189
    move v1, v4

    .line 190
    :goto_5
    :try_start_3
    instance-of v4, v2, Lbsh/ParseException;

    .line 191
    .line 192
    if-nez v4, :cond_c

    .line 193
    .line 194
    instance-of v4, v2, Ljava/lang/RuntimeException;

    .line 195
    .line 196
    if-eqz v4, :cond_b

    .line 197
    .line 198
    check-cast v2, Ljava/lang/RuntimeException;

    .line 199
    .line 200
    throw v2

    .line 201
    :catchall_3
    move-exception v2

    .line 202
    move v4, v1

    .line 203
    move-object v1, v2

    .line 204
    goto :goto_6

    .line 205
    :cond_b
    check-cast v2, Ljava/lang/Error;

    .line 206
    .line 207
    throw v2

    .line 208
    :cond_c
    check-cast v2, Lbsh/ParseException;

    .line 209
    .line 210
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 211
    :goto_6
    if-eqz v4, :cond_d

    .line 212
    .line 213
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 214
    .line 215
    invoke-virtual {v2, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 216
    .line 217
    .line 218
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 219
    .line 220
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    if-eqz v2, :cond_d

    .line 225
    .line 226
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 227
    .line 228
    .line 229
    :cond_d
    throw v1
.end method

.method public final ArrayInitializer()V
    .locals 7

    .line 1
    new-instance v0, Lbsh/BSHArrayInitializer;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHArrayInitializer;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x4e

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    :try_start_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 20
    .line 21
    .line 22
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 23
    .line 24
    const/4 v3, -0x1

    .line 25
    if-ne v1, v3, :cond_0

    .line 26
    .line 27
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v1

    .line 33
    goto :goto_4

    .line 34
    :cond_0
    :goto_0
    const/16 v4, 0x29

    .line 35
    .line 36
    const/16 v5, 0x53

    .line 37
    .line 38
    if-eq v1, v4, :cond_1

    .line 39
    .line 40
    const/16 v4, 0x2a

    .line 41
    .line 42
    if-eq v1, v4, :cond_1

    .line 43
    .line 44
    const/16 v4, 0x5a

    .line 45
    .line 46
    if-eq v1, v4, :cond_1

    .line 47
    .line 48
    const/16 v4, 0x5b

    .line 49
    .line 50
    if-eq v1, v4, :cond_1

    .line 51
    .line 52
    sparse-switch v1, :sswitch_data_0

    .line 53
    .line 54
    .line 55
    packed-switch v1, :pswitch_data_0

    .line 56
    .line 57
    .line 58
    packed-switch v1, :pswitch_data_1

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 62
    .line 63
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 64
    .line 65
    const/16 v6, 0x17

    .line 66
    .line 67
    aput v4, v1, v6

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_1
    :pswitch_0
    :sswitch_0
    invoke-virtual {p0}, Lbsh/Parser;->VariableInitializer()V

    .line 71
    .line 72
    .line 73
    :goto_1
    const/4 v1, 0x2

    .line 74
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_2_6(I)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_2

    .line 79
    .line 80
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lbsh/Parser;->VariableInitializer()V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    :goto_2
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 88
    .line 89
    if-ne v1, v3, :cond_3

    .line 90
    .line 91
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    :cond_3
    if-eq v1, v5, :cond_4

    .line 96
    .line 97
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 98
    .line 99
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 100
    .line 101
    const/16 v4, 0x18

    .line 102
    .line 103
    aput v3, v1, v4

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_4
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 107
    .line 108
    .line 109
    :goto_3
    const/16 v1, 0x4f

    .line 110
    .line 111
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    .line 113
    .line 114
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 115
    .line 116
    invoke-virtual {v1, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 117
    .line 118
    .line 119
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 120
    .line 121
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-eqz v1, :cond_5

    .line 126
    .line 127
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 128
    .line 129
    .line 130
    :cond_5
    return-void

    .line 131
    :goto_4
    :try_start_1
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 132
    .line 133
    invoke-virtual {v3, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 134
    .line 135
    .line 136
    const/4 v3, 0x0

    .line 137
    :try_start_2
    instance-of v4, v1, Lbsh/ParseException;

    .line 138
    .line 139
    if-nez v4, :cond_7

    .line 140
    .line 141
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 142
    .line 143
    if-eqz v4, :cond_6

    .line 144
    .line 145
    check-cast v1, Ljava/lang/RuntimeException;

    .line 146
    .line 147
    throw v1

    .line 148
    :catchall_1
    move-exception v1

    .line 149
    goto :goto_5

    .line 150
    :cond_6
    check-cast v1, Ljava/lang/Error;

    .line 151
    .line 152
    throw v1

    .line 153
    :cond_7
    check-cast v1, Lbsh/ParseException;

    .line 154
    .line 155
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 156
    :catchall_2
    move-exception v1

    .line 157
    move v3, v2

    .line 158
    :goto_5
    if-eqz v3, :cond_8

    .line 159
    .line 160
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 161
    .line 162
    invoke-virtual {v3, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 163
    .line 164
    .line 165
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 166
    .line 167
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-eqz v2, :cond_8

    .line 172
    .line 173
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 174
    .line 175
    .line 176
    :cond_8
    throw v1

    .line 177
    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_0
        0xf -> :sswitch_0
        0x12 -> :sswitch_0
        0x17 -> :sswitch_0
        0x1b -> :sswitch_0
        0x1e -> :sswitch_0
        0x25 -> :sswitch_0
        0x27 -> :sswitch_0
        0x30 -> :sswitch_0
        0x38 -> :sswitch_0
        0x3a -> :sswitch_0
        0x3c -> :sswitch_0
        0x3e -> :sswitch_0
        0x43 -> :sswitch_0
        0x4c -> :sswitch_0
        0x4e -> :sswitch_0
        0x50 -> :sswitch_0
    .end sparse-switch

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    :pswitch_data_0
    .packed-switch 0x46
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    :pswitch_data_1
    .packed-switch 0x66
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final AssignmentOperator()I
    .locals 4

    .line 1
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    :cond_0
    const/16 v2, 0x55

    .line 11
    .line 12
    if-eq v0, v2, :cond_2

    .line 13
    .line 14
    const/16 v2, 0x92

    .line 15
    .line 16
    if-eq v0, v2, :cond_1

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 22
    .line 23
    const/16 v2, 0x24

    .line 24
    .line 25
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 26
    .line 27
    aput v3, v0, v2

    .line 28
    .line 29
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lbsh/j;->a()V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    return v0

    .line 37
    :pswitch_0
    const/16 v0, 0x8f

    .line 38
    .line 39
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 40
    .line 41
    .line 42
    goto/16 :goto_0

    .line 43
    .line 44
    :pswitch_1
    const/16 v0, 0x8e

    .line 45
    .line 46
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 47
    .line 48
    .line 49
    goto/16 :goto_0

    .line 50
    .line 51
    :pswitch_2
    const/16 v0, 0x8d

    .line 52
    .line 53
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 54
    .line 55
    .line 56
    goto/16 :goto_0

    .line 57
    .line 58
    :pswitch_3
    const/16 v0, 0x8c

    .line 59
    .line 60
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 61
    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :pswitch_4
    const/16 v0, 0x8b

    .line 66
    .line 67
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 68
    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :pswitch_5
    const/16 v0, 0x8a

    .line 73
    .line 74
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :pswitch_6
    const/16 v0, 0x89

    .line 79
    .line 80
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :pswitch_7
    const/16 v0, 0x88

    .line 85
    .line 86
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :pswitch_8
    const/16 v0, 0x87

    .line 91
    .line 92
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :pswitch_9
    const/16 v0, 0x86

    .line 97
    .line 98
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :pswitch_a
    const/16 v0, 0x85

    .line 103
    .line 104
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :pswitch_b
    const/16 v0, 0x84

    .line 109
    .line 110
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :pswitch_c
    const/16 v0, 0x83

    .line 115
    .line 116
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :pswitch_d
    const/16 v0, 0x82

    .line 121
    .line 122
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :pswitch_e
    const/16 v0, 0x81

    .line 127
    .line 128
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :pswitch_f
    const/16 v0, 0x80

    .line 133
    .line 134
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :pswitch_10
    const/16 v0, 0x7f

    .line 139
    .line 140
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :pswitch_11
    const/16 v0, 0x7e

    .line 145
    .line 146
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 147
    .line 148
    .line 149
    goto :goto_0

    .line 150
    :pswitch_12
    const/16 v0, 0x7d

    .line 151
    .line 152
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 153
    .line 154
    .line 155
    goto :goto_0

    .line 156
    :pswitch_13
    const/16 v0, 0x7c

    .line 157
    .line 158
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 159
    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_1
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 163
    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_2
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 167
    .line 168
    .line 169
    :goto_0
    const/4 v0, 0x0

    .line 170
    invoke-virtual {p0, v0}, Lbsh/Parser;->getToken(I)Lbsh/Token;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iget v0, v0, Lbsh/Token;->kind:I

    .line 175
    .line 176
    return v0

    .line 177
    :pswitch_data_0
    .packed-switch 0x7c
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final AutoCloseable()V
    .locals 6

    .line 1
    new-instance v0, Lbsh/BSHAutoCloseable;

    .line 2
    .line 3
    const/16 v1, 0x2c

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHAutoCloseable;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x1

    .line 18
    :try_start_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_2_41(I)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Lbsh/Parser;->Type()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lbsh/Parser;->VariableDeclarator()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 34
    .line 35
    const/4 v3, -0x1

    .line 36
    if-ne v1, v3, :cond_1

    .line 37
    .line 38
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    :cond_1
    const/16 v4, 0x49

    .line 43
    .line 44
    if-ne v1, v4, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0}, Lbsh/Parser;->VariableDeclarator()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    :goto_0
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 50
    .line 51
    invoke-virtual {v1, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 55
    .line 56
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    return-void

    .line 66
    :cond_3
    :try_start_1
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 67
    .line 68
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 69
    .line 70
    const/16 v5, 0x7a

    .line 71
    .line 72
    aput v4, v1, v5

    .line 73
    .line 74
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 75
    .line 76
    .line 77
    new-instance v1, Lbsh/ParseException;

    .line 78
    .line 79
    invoke-direct {v1}, Lbsh/ParseException;-><init>()V

    .line 80
    .line 81
    .line 82
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    :goto_1
    :try_start_2
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 84
    .line 85
    invoke-virtual {v3, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 86
    .line 87
    .line 88
    const/4 v3, 0x0

    .line 89
    :try_start_3
    instance-of v4, v1, Lbsh/ParseException;

    .line 90
    .line 91
    if-nez v4, :cond_5

    .line 92
    .line 93
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 94
    .line 95
    if-eqz v4, :cond_4

    .line 96
    .line 97
    check-cast v1, Ljava/lang/RuntimeException;

    .line 98
    .line 99
    throw v1

    .line 100
    :catchall_1
    move-exception v1

    .line 101
    goto :goto_2

    .line 102
    :cond_4
    check-cast v1, Ljava/lang/Error;

    .line 103
    .line 104
    throw v1

    .line 105
    :cond_5
    check-cast v1, Lbsh/ParseException;

    .line 106
    .line 107
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 108
    :catchall_2
    move-exception v1

    .line 109
    move v3, v2

    .line 110
    :goto_2
    if-eqz v3, :cond_6

    .line 111
    .line 112
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 113
    .line 114
    invoke-virtual {v3, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 115
    .line 116
    .line 117
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 118
    .line 119
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_6

    .line 124
    .line 125
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 126
    .line 127
    .line 128
    :cond_6
    throw v1
.end method

.method public final Block()V
    .locals 6

    .line 1
    new-instance v0, Lbsh/BSHBlock;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lbsh/BSHBlock;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x1

    .line 17
    :try_start_0
    iget v3, p0, Lbsh/Parser;->jj_ntk:I

    .line 18
    .line 19
    const/4 v4, -0x1

    .line 20
    if-ne v3, v4, :cond_0

    .line 21
    .line 22
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v3

    .line 28
    move v4, v2

    .line 29
    goto :goto_4

    .line 30
    :cond_0
    :goto_0
    const/16 v4, 0x31

    .line 31
    .line 32
    if-eq v3, v4, :cond_1

    .line 33
    .line 34
    iget-object v3, p0, Lbsh/Parser;->jj_la1:[I

    .line 35
    .line 36
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 37
    .line 38
    const/16 v5, 0x63

    .line 39
    .line 40
    aput v4, v3, v5

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    :goto_1
    const/16 v4, 0x4e

    .line 49
    .line 50
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 51
    .line 52
    .line 53
    :goto_2
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_2_28(I)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_2

    .line 58
    .line 59
    invoke-virtual {p0}, Lbsh/Parser;->BlockStatement()V

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    const/16 v4, 0x4f

    .line 64
    .line 65
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 66
    .line 67
    .line 68
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 69
    .line 70
    invoke-virtual {v4, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    :try_start_1
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 74
    .line 75
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_3

    .line 80
    .line 81
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 82
    .line 83
    .line 84
    goto :goto_3

    .line 85
    :catchall_1
    move-exception v3

    .line 86
    move v4, v1

    .line 87
    goto :goto_4

    .line 88
    :cond_3
    :goto_3
    if-eqz v3, :cond_4

    .line 89
    .line 90
    iput-boolean v2, v0, Lbsh/BSHBlock;->isStatic:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 91
    .line 92
    :cond_4
    return-void

    .line 93
    :goto_4
    iget-object v5, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 94
    .line 95
    if-eqz v4, :cond_5

    .line 96
    .line 97
    :try_start_2
    invoke-virtual {v5, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V

    .line 98
    .line 99
    .line 100
    goto :goto_5

    .line 101
    :catchall_2
    move-exception v1

    .line 102
    goto :goto_6

    .line 103
    :cond_5
    invoke-virtual {v5}, Lbsh/JJTParserState;->popNode()Lbsh/Node;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 104
    .line 105
    .line 106
    move v1, v4

    .line 107
    :goto_5
    :try_start_3
    instance-of v4, v3, Lbsh/ParseException;

    .line 108
    .line 109
    if-nez v4, :cond_7

    .line 110
    .line 111
    instance-of v4, v3, Ljava/lang/RuntimeException;

    .line 112
    .line 113
    if-eqz v4, :cond_6

    .line 114
    .line 115
    check-cast v3, Ljava/lang/RuntimeException;

    .line 116
    .line 117
    throw v3

    .line 118
    :catchall_3
    move-exception v3

    .line 119
    move v4, v1

    .line 120
    move-object v1, v3

    .line 121
    goto :goto_6

    .line 122
    :cond_6
    check-cast v3, Ljava/lang/Error;

    .line 123
    .line 124
    throw v3

    .line 125
    :cond_7
    check-cast v3, Lbsh/ParseException;

    .line 126
    .line 127
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 128
    :goto_6
    if-eqz v4, :cond_8

    .line 129
    .line 130
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 131
    .line 132
    invoke-virtual {v3, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 133
    .line 134
    .line 135
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 136
    .line 137
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-eqz v2, :cond_8

    .line 142
    .line 143
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 144
    .line 145
    .line 146
    :cond_8
    throw v1
.end method

.method public final BlockStatement()V
    .locals 4

    .line 1
    const v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_2_29(I)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lbsh/Parser;->ClassDeclaration()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_2_30(I)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lbsh/Parser;->MethodDeclaration()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_2_31(I)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0}, Lbsh/Parser;->MethodDeclaration()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_2
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_2_32(I)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p0}, Lbsh/Parser;->TypedVariableDeclaration()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lbsh/Parser;->StatementTerminator()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_3
    const/4 v0, 0x1

    .line 48
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_2_33(I)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    invoke-virtual {p0}, Lbsh/Parser;->Statement()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_4
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 59
    .line 60
    const/4 v1, -0x1

    .line 61
    if-ne v0, v1, :cond_5

    .line 62
    .line 63
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    :cond_5
    const/16 v2, 0x23

    .line 68
    .line 69
    if-eq v0, v2, :cond_7

    .line 70
    .line 71
    const/16 v2, 0x2b

    .line 72
    .line 73
    if-ne v0, v2, :cond_6

    .line 74
    .line 75
    invoke-virtual {p0}, Lbsh/Parser;->PackageDeclaration()V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_6
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 80
    .line 81
    const/16 v2, 0x64

    .line 82
    .line 83
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 84
    .line 85
    aput v3, v0, v2

    .line 86
    .line 87
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 88
    .line 89
    .line 90
    invoke-static {}, Lbsh/j;->a()V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_7
    invoke-virtual {p0}, Lbsh/Parser;->ImportDeclaration()V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public final BooleanLiteral()Z
    .locals 4

    .line 1
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    :cond_0
    const/16 v2, 0x1b

    .line 11
    .line 12
    if-eq v0, v2, :cond_2

    .line 13
    .line 14
    const/16 v2, 0x38

    .line 15
    .line 16
    if-ne v0, v2, :cond_1

    .line 17
    .line 18
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_1
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 24
    .line 25
    const/16 v2, 0x59

    .line 26
    .line 27
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 28
    .line 29
    aput v3, v0, v2

    .line 30
    .line 31
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lbsh/j;->a()V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    return v0

    .line 39
    :cond_2
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    return v0
.end method

.method public final BreakStatement()V
    .locals 6

    .line 1
    new-instance v0, Lbsh/BSHReturnStatement;

    .line 2
    .line 3
    const/16 v1, 0x27

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHReturnStatement;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/16 v2, 0xd

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    :try_start_0
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 21
    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_2_38(I)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    const/16 v4, 0x49

    .line 31
    .line 32
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const/16 v5, 0x52

    .line 37
    .line 38
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 39
    .line 40
    .line 41
    iget-object v4, v4, Lbsh/Token;->image:Ljava/lang/String;

    .line 42
    .line 43
    iput-object v4, v0, Lbsh/BSHReturnStatement;->label:Ljava/lang/String;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v2

    .line 47
    move v4, v3

    .line 48
    goto :goto_2

    .line 49
    :cond_0
    invoke-virtual {p0}, Lbsh/Parser;->StatementTerminator()V

    .line 50
    .line 51
    .line 52
    :goto_0
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 53
    .line 54
    invoke-virtual {v4, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    :try_start_1
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 58
    .line 59
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_1

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :catchall_1
    move-exception v2

    .line 70
    move v4, v1

    .line 71
    goto :goto_2

    .line 72
    :cond_1
    :goto_1
    iput v2, v0, Lbsh/BSHReturnStatement;->kind:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    .line 74
    return-void

    .line 75
    :goto_2
    iget-object v5, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 76
    .line 77
    if-eqz v4, :cond_2

    .line 78
    .line 79
    :try_start_2
    invoke-virtual {v5, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V

    .line 80
    .line 81
    .line 82
    goto :goto_3

    .line 83
    :catchall_2
    move-exception v1

    .line 84
    goto :goto_4

    .line 85
    :cond_2
    invoke-virtual {v5}, Lbsh/JJTParserState;->popNode()Lbsh/Node;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 86
    .line 87
    .line 88
    move v1, v4

    .line 89
    :goto_3
    :try_start_3
    instance-of v4, v2, Lbsh/ParseException;

    .line 90
    .line 91
    if-nez v4, :cond_4

    .line 92
    .line 93
    instance-of v4, v2, Ljava/lang/RuntimeException;

    .line 94
    .line 95
    if-eqz v4, :cond_3

    .line 96
    .line 97
    check-cast v2, Ljava/lang/RuntimeException;

    .line 98
    .line 99
    throw v2

    .line 100
    :catchall_3
    move-exception v2

    .line 101
    move v4, v1

    .line 102
    move-object v1, v2

    .line 103
    goto :goto_4

    .line 104
    :cond_3
    check-cast v2, Ljava/lang/Error;

    .line 105
    .line 106
    throw v2

    .line 107
    :cond_4
    check-cast v2, Lbsh/ParseException;

    .line 108
    .line 109
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 110
    :goto_4
    if-eqz v4, :cond_5

    .line 111
    .line 112
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 113
    .line 114
    invoke-virtual {v2, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 115
    .line 116
    .line 117
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 118
    .line 119
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_5

    .line 124
    .line 125
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 126
    .line 127
    .line 128
    :cond_5
    throw v1
.end method

.method public final CastExpression()V
    .locals 5

    .line 1
    new-instance v0, Lbsh/BSHCastExpression;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHCastExpression;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x4c

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    :try_start_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lbsh/Parser;->Type()V

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x4d

    .line 26
    .line 27
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lbsh/Parser;->UnaryExpression()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 39
    .line 40
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    return-void

    .line 50
    :catchall_0
    move-exception v1

    .line 51
    :try_start_1
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 52
    .line 53
    invoke-virtual {v3, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 54
    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    :try_start_2
    instance-of v4, v1, Lbsh/ParseException;

    .line 58
    .line 59
    if-nez v4, :cond_2

    .line 60
    .line 61
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 62
    .line 63
    if-eqz v4, :cond_1

    .line 64
    .line 65
    check-cast v1, Ljava/lang/RuntimeException;

    .line 66
    .line 67
    throw v1

    .line 68
    :catchall_1
    move-exception v1

    .line 69
    goto :goto_0

    .line 70
    :cond_1
    check-cast v1, Ljava/lang/Error;

    .line 71
    .line 72
    throw v1

    .line 73
    :cond_2
    check-cast v1, Lbsh/ParseException;

    .line 74
    .line 75
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 76
    :catchall_2
    move-exception v1

    .line 77
    move v3, v2

    .line 78
    :goto_0
    if-eqz v3, :cond_3

    .line 79
    .line 80
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 81
    .line 82
    invoke-virtual {v3, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 83
    .line 84
    .line 85
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 86
    .line 87
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_3

    .line 92
    .line 93
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 94
    .line 95
    .line 96
    :cond_3
    throw v1
.end method

.method public final ClassDeclaration()V
    .locals 11

    .line 1
    new-instance v0, Lbsh/BSHClassDeclaration;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lbsh/BSHClassDeclaration;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 8
    .line 9
    invoke-virtual {v2, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    :try_start_0
    invoke-virtual {p0, v2, v2}, Lbsh/Parser;->Modifiers(IZ)Lbsh/Modifiers;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget v4, p0, Lbsh/Parser;->jj_ntk:I

    .line 21
    .line 22
    const/4 v5, -0x1

    .line 23
    if-ne v4, v5, :cond_0

    .line 24
    .line 25
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v3

    .line 31
    move v4, v1

    .line 32
    goto/16 :goto_7

    .line 33
    .line 34
    :cond_0
    :goto_0
    const/16 v6, 0x49

    .line 35
    .line 36
    const/16 v7, 0x26

    .line 37
    .line 38
    const/16 v8, 0xe

    .line 39
    .line 40
    const/16 v9, 0x22

    .line 41
    .line 42
    if-eq v4, v8, :cond_5

    .line 43
    .line 44
    const/16 v10, 0x19

    .line 45
    .line 46
    if-eq v4, v10, :cond_2

    .line 47
    .line 48
    if-ne v4, v7, :cond_1

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_1
    iget-object v3, p0, Lbsh/Parser;->jj_la1:[I

    .line 52
    .line 53
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 54
    .line 55
    const/16 v6, 0x8

    .line 56
    .line 57
    aput v4, v3, v6

    .line 58
    .line 59
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 60
    .line 61
    .line 62
    new-instance v3, Lbsh/ParseException;

    .line 63
    .line 64
    invoke-direct {v3}, Lbsh/ParseException;-><init>()V

    .line 65
    .line 66
    .line 67
    throw v3

    .line 68
    :cond_2
    invoke-direct {p0, v10}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 69
    .line 70
    .line 71
    sget-object v4, Lbsh/ClassGenerator$Type;->ENUM:Lbsh/ClassGenerator$Type;

    .line 72
    .line 73
    iput-object v4, v0, Lbsh/BSHClassDeclaration;->type:Lbsh/ClassGenerator$Type;

    .line 74
    .line 75
    invoke-direct {p0, v6}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    iget v6, p0, Lbsh/Parser;->jj_ntk:I

    .line 80
    .line 81
    if-ne v6, v5, :cond_3

    .line 82
    .line 83
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    :cond_3
    if-eq v6, v9, :cond_4

    .line 88
    .line 89
    iget-object v5, p0, Lbsh/Parser;->jj_la1:[I

    .line 90
    .line 91
    iget v6, p0, Lbsh/Parser;->jj_gen:I

    .line 92
    .line 93
    const/4 v7, 0x7

    .line 94
    aput v6, v5, v7

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_4
    invoke-direct {p0, v9}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lbsh/Parser;->NameList()I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    iput v5, v0, Lbsh/BSHClassDeclaration;->numInterfaces:I

    .line 105
    .line 106
    :goto_1
    invoke-virtual {p0}, Lbsh/Parser;->EnumBlock()V

    .line 107
    .line 108
    .line 109
    goto/16 :goto_5

    .line 110
    .line 111
    :cond_5
    :goto_2
    iget v4, p0, Lbsh/Parser;->jj_ntk:I

    .line 112
    .line 113
    if-ne v4, v5, :cond_6

    .line 114
    .line 115
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    :cond_6
    const/16 v10, 0x1a

    .line 120
    .line 121
    if-eq v4, v8, :cond_a

    .line 122
    .line 123
    if-ne v4, v7, :cond_9

    .line 124
    .line 125
    invoke-direct {p0, v7}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 126
    .line 127
    .line 128
    sget-object v4, Lbsh/ClassGenerator$Type;->INTERFACE:Lbsh/ClassGenerator$Type;

    .line 129
    .line 130
    iput-object v4, v0, Lbsh/BSHClassDeclaration;->type:Lbsh/ClassGenerator$Type;

    .line 131
    .line 132
    invoke-direct {p0, v6}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    iget v6, p0, Lbsh/Parser;->jj_ntk:I

    .line 137
    .line 138
    if-ne v6, v5, :cond_7

    .line 139
    .line 140
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    :cond_7
    if-eq v6, v10, :cond_8

    .line 145
    .line 146
    iget-object v5, p0, Lbsh/Parser;->jj_la1:[I

    .line 147
    .line 148
    iget v6, p0, Lbsh/Parser;->jj_gen:I

    .line 149
    .line 150
    const/4 v7, 0x5

    .line 151
    aput v6, v5, v7

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_8
    invoke-direct {p0, v10}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Lbsh/Parser;->NameList()I

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    iput v5, v0, Lbsh/BSHClassDeclaration;->numInterfaces:I

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_9
    iget-object v3, p0, Lbsh/Parser;->jj_la1:[I

    .line 165
    .line 166
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 167
    .line 168
    const/4 v6, 0x6

    .line 169
    aput v4, v3, v6

    .line 170
    .line 171
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 172
    .line 173
    .line 174
    new-instance v3, Lbsh/ParseException;

    .line 175
    .line 176
    invoke-direct {v3}, Lbsh/ParseException;-><init>()V

    .line 177
    .line 178
    .line 179
    throw v3

    .line 180
    :cond_a
    invoke-direct {p0, v8}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 181
    .line 182
    .line 183
    sget-object v4, Lbsh/ClassGenerator$Type;->CLASS:Lbsh/ClassGenerator$Type;

    .line 184
    .line 185
    iput-object v4, v0, Lbsh/BSHClassDeclaration;->type:Lbsh/ClassGenerator$Type;

    .line 186
    .line 187
    invoke-direct {p0, v6}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    iget v6, p0, Lbsh/Parser;->jj_ntk:I

    .line 192
    .line 193
    if-ne v6, v5, :cond_b

    .line 194
    .line 195
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 196
    .line 197
    .line 198
    move-result v6

    .line 199
    :cond_b
    if-eq v6, v10, :cond_c

    .line 200
    .line 201
    iget-object v6, p0, Lbsh/Parser;->jj_la1:[I

    .line 202
    .line 203
    iget v7, p0, Lbsh/Parser;->jj_gen:I

    .line 204
    .line 205
    const/4 v8, 0x3

    .line 206
    aput v7, v6, v8

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_c
    invoke-direct {p0, v10}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0}, Lbsh/Parser;->AmbiguousName()V

    .line 213
    .line 214
    .line 215
    iput-boolean v1, v0, Lbsh/BSHClassDeclaration;->extend:Z

    .line 216
    .line 217
    :goto_3
    iget v6, p0, Lbsh/Parser;->jj_ntk:I

    .line 218
    .line 219
    if-ne v6, v5, :cond_d

    .line 220
    .line 221
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 222
    .line 223
    .line 224
    move-result v6

    .line 225
    :cond_d
    if-eq v6, v9, :cond_e

    .line 226
    .line 227
    iget-object v5, p0, Lbsh/Parser;->jj_la1:[I

    .line 228
    .line 229
    iget v6, p0, Lbsh/Parser;->jj_gen:I

    .line 230
    .line 231
    const/4 v7, 0x4

    .line 232
    aput v6, v5, v7

    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_e
    invoke-direct {p0, v9}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 236
    .line 237
    .line 238
    invoke-virtual {p0}, Lbsh/Parser;->NameList()I

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    iput v5, v0, Lbsh/BSHClassDeclaration;->numInterfaces:I

    .line 243
    .line 244
    :goto_4
    invoke-virtual {p0}, Lbsh/Parser;->Block()V

    .line 245
    .line 246
    .line 247
    :goto_5
    iget-object v5, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 248
    .line 249
    invoke-virtual {v5, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 250
    .line 251
    .line 252
    :try_start_1
    iget-object v5, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 253
    .line 254
    invoke-virtual {v5}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 255
    .line 256
    .line 257
    move-result v5

    .line 258
    if-eqz v5, :cond_f

    .line 259
    .line 260
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 261
    .line 262
    .line 263
    goto :goto_6

    .line 264
    :catchall_1
    move-exception v3

    .line 265
    move v4, v2

    .line 266
    goto :goto_7

    .line 267
    :cond_f
    :goto_6
    if-eqz v3, :cond_10

    .line 268
    .line 269
    iput-object v3, v0, Lbsh/BSHClassDeclaration;->modifiers:Lbsh/Modifiers;

    .line 270
    .line 271
    :cond_10
    iget-object v3, v4, Lbsh/Token;->image:Ljava/lang/String;

    .line 272
    .line 273
    iput-object v3, v0, Lbsh/BSHClassDeclaration;->name:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 274
    .line 275
    return-void

    .line 276
    :goto_7
    iget-object v5, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 277
    .line 278
    if-eqz v4, :cond_11

    .line 279
    .line 280
    :try_start_2
    invoke-virtual {v5, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V

    .line 281
    .line 282
    .line 283
    goto :goto_8

    .line 284
    :catchall_2
    move-exception v2

    .line 285
    goto :goto_9

    .line 286
    :cond_11
    invoke-virtual {v5}, Lbsh/JJTParserState;->popNode()Lbsh/Node;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 287
    .line 288
    .line 289
    move v2, v4

    .line 290
    :goto_8
    :try_start_3
    instance-of v4, v3, Lbsh/ParseException;

    .line 291
    .line 292
    if-nez v4, :cond_13

    .line 293
    .line 294
    instance-of v4, v3, Ljava/lang/RuntimeException;

    .line 295
    .line 296
    if-eqz v4, :cond_12

    .line 297
    .line 298
    check-cast v3, Ljava/lang/RuntimeException;

    .line 299
    .line 300
    throw v3

    .line 301
    :catchall_3
    move-exception v3

    .line 302
    move v4, v2

    .line 303
    move-object v2, v3

    .line 304
    goto :goto_9

    .line 305
    :cond_12
    check-cast v3, Ljava/lang/Error;

    .line 306
    .line 307
    throw v3

    .line 308
    :cond_13
    check-cast v3, Lbsh/ParseException;

    .line 309
    .line 310
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 311
    :goto_9
    if-eqz v4, :cond_14

    .line 312
    .line 313
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 314
    .line 315
    invoke-virtual {v3, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 316
    .line 317
    .line 318
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 319
    .line 320
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    if-eqz v1, :cond_14

    .line 325
    .line 326
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 327
    .line 328
    .line 329
    :cond_14
    throw v2
.end method

.method public final ConditionalAndExpression()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lbsh/Parser;->InclusiveOrExpression()V

    .line 2
    .line 3
    .line 4
    :goto_0
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :cond_0
    const/16 v2, 0x65

    .line 14
    .line 15
    const/16 v3, 0x64

    .line 16
    .line 17
    if-eq v0, v3, :cond_1

    .line 18
    .line 19
    if-eq v0, v2, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 22
    .line 23
    const/16 v1, 0x2a

    .line 24
    .line 25
    iget v2, p0, Lbsh/Parser;->jj_gen:I

    .line 26
    .line 27
    aput v2, v0, v1

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 31
    .line 32
    if-ne v0, v1, :cond_2

    .line 33
    .line 34
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    :cond_2
    if-eq v0, v3, :cond_4

    .line 39
    .line 40
    if-ne v0, v2, :cond_3

    .line 41
    .line 42
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 48
    .line 49
    const/16 v2, 0x2b

    .line 50
    .line 51
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 52
    .line 53
    aput v3, v0, v2

    .line 54
    .line 55
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 56
    .line 57
    .line 58
    invoke-static {}, Lbsh/j;->a()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_4
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :goto_1
    invoke-virtual {p0}, Lbsh/Parser;->InclusiveOrExpression()V

    .line 67
    .line 68
    .line 69
    new-instance v1, Lbsh/BSHBinaryExpression;

    .line 70
    .line 71
    const/16 v2, 0x11

    .line 72
    .line 73
    invoke-direct {v1, v2}, Lbsh/BSHBinaryExpression;-><init>(I)V

    .line 74
    .line 75
    .line 76
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 77
    .line 78
    invoke-virtual {v2, v1}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 82
    .line 83
    .line 84
    const/4 v2, 0x2

    .line 85
    const/4 v3, 0x1

    .line 86
    :try_start_0
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 87
    .line 88
    invoke-virtual {v4, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 89
    .line 90
    .line 91
    const/4 v3, 0x0

    .line 92
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 93
    .line 94
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_5

    .line 99
    .line 100
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    goto :goto_3

    .line 106
    :cond_5
    :goto_2
    iget v0, v0, Lbsh/Token;->kind:I

    .line 107
    .line 108
    iput v0, v1, Lbsh/BSHBinaryExpression;->kind:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :goto_3
    if-eqz v3, :cond_6

    .line 112
    .line 113
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 114
    .line 115
    invoke-virtual {v3, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 116
    .line 117
    .line 118
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 119
    .line 120
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_6

    .line 125
    .line 126
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 127
    .line 128
    .line 129
    :cond_6
    throw v0
.end method

.method public final ConditionalExpression()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lbsh/Parser;->NullCoalesceElvisSpaceShipExpression()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :cond_0
    const/16 v1, 0x95

    .line 14
    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 18
    .line 19
    const/16 v1, 0x25

    .line 20
    .line 21
    iget v2, p0, Lbsh/Parser;->jj_gen:I

    .line 22
    .line 23
    aput v2, v0, v1

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V

    .line 30
    .line 31
    .line 32
    const/16 v0, 0x96

    .line 33
    .line 34
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 35
    .line 36
    .line 37
    new-instance v0, Lbsh/BSHTernaryExpression;

    .line 38
    .line 39
    const/16 v1, 0x10

    .line 40
    .line 41
    invoke-direct {v0, v1}, Lbsh/BSHTernaryExpression;-><init>(I)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x3

    .line 53
    :try_start_0
    invoke-virtual {p0}, Lbsh/Parser;->ConditionalExpression()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 57
    .line 58
    invoke-virtual {v2, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 62
    .line 63
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_2

    .line 68
    .line 69
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    return-void

    .line 73
    :catchall_0
    move-exception v2

    .line 74
    const/4 v3, 0x1

    .line 75
    :try_start_1
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 76
    .line 77
    invoke-virtual {v4, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V

    .line 78
    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    instance-of v4, v2, Lbsh/ParseException;

    .line 82
    .line 83
    if-nez v4, :cond_4

    .line 84
    .line 85
    instance-of v4, v2, Ljava/lang/RuntimeException;

    .line 86
    .line 87
    if-eqz v4, :cond_3

    .line 88
    .line 89
    check-cast v2, Ljava/lang/RuntimeException;

    .line 90
    .line 91
    throw v2

    .line 92
    :catchall_1
    move-exception v2

    .line 93
    goto :goto_0

    .line 94
    :cond_3
    check-cast v2, Ljava/lang/Error;

    .line 95
    .line 96
    throw v2

    .line 97
    :cond_4
    check-cast v2, Lbsh/ParseException;

    .line 98
    .line 99
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 100
    :goto_0
    if-eqz v3, :cond_5

    .line 101
    .line 102
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 103
    .line 104
    invoke-virtual {v3, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 108
    .line 109
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_5

    .line 114
    .line 115
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 116
    .line 117
    .line 118
    :cond_5
    throw v2
.end method

.method public final ConditionalOrExpression()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lbsh/Parser;->ConditionalAndExpression()V

    .line 2
    .line 3
    .line 4
    :goto_0
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :cond_0
    const/16 v2, 0x63

    .line 14
    .line 15
    const/16 v3, 0x62

    .line 16
    .line 17
    if-eq v0, v3, :cond_1

    .line 18
    .line 19
    if-eq v0, v2, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 22
    .line 23
    const/16 v1, 0x28

    .line 24
    .line 25
    iget v2, p0, Lbsh/Parser;->jj_gen:I

    .line 26
    .line 27
    aput v2, v0, v1

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 31
    .line 32
    if-ne v0, v1, :cond_2

    .line 33
    .line 34
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    :cond_2
    if-eq v0, v3, :cond_4

    .line 39
    .line 40
    if-ne v0, v2, :cond_3

    .line 41
    .line 42
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 48
    .line 49
    const/16 v2, 0x29

    .line 50
    .line 51
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 52
    .line 53
    aput v3, v0, v2

    .line 54
    .line 55
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 56
    .line 57
    .line 58
    invoke-static {}, Lbsh/j;->a()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_4
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :goto_1
    invoke-virtual {p0}, Lbsh/Parser;->ConditionalAndExpression()V

    .line 67
    .line 68
    .line 69
    new-instance v1, Lbsh/BSHBinaryExpression;

    .line 70
    .line 71
    const/16 v2, 0x11

    .line 72
    .line 73
    invoke-direct {v1, v2}, Lbsh/BSHBinaryExpression;-><init>(I)V

    .line 74
    .line 75
    .line 76
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 77
    .line 78
    invoke-virtual {v2, v1}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 82
    .line 83
    .line 84
    const/4 v2, 0x2

    .line 85
    const/4 v3, 0x1

    .line 86
    :try_start_0
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 87
    .line 88
    invoke-virtual {v4, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 89
    .line 90
    .line 91
    const/4 v3, 0x0

    .line 92
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 93
    .line 94
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_5

    .line 99
    .line 100
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    goto :goto_3

    .line 106
    :cond_5
    :goto_2
    iget v0, v0, Lbsh/Token;->kind:I

    .line 107
    .line 108
    iput v0, v1, Lbsh/BSHBinaryExpression;->kind:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :goto_3
    if-eqz v3, :cond_6

    .line 112
    .line 113
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 114
    .line 115
    invoke-virtual {v3, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 116
    .line 117
    .line 118
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 119
    .line 120
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_6

    .line 125
    .line 126
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 127
    .line 128
    .line 129
    :cond_6
    throw v0
.end method

.method public final ContinueStatement()V
    .locals 6

    .line 1
    new-instance v0, Lbsh/BSHReturnStatement;

    .line 2
    .line 3
    const/16 v1, 0x27

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHReturnStatement;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/16 v2, 0x14

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    :try_start_0
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 21
    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_2_39(I)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    const/16 v4, 0x49

    .line 31
    .line 32
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const/16 v5, 0x52

    .line 37
    .line 38
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 39
    .line 40
    .line 41
    iget-object v4, v4, Lbsh/Token;->image:Ljava/lang/String;

    .line 42
    .line 43
    iput-object v4, v0, Lbsh/BSHReturnStatement;->label:Ljava/lang/String;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v2

    .line 47
    move v4, v3

    .line 48
    goto :goto_2

    .line 49
    :cond_0
    invoke-virtual {p0}, Lbsh/Parser;->StatementTerminator()V

    .line 50
    .line 51
    .line 52
    :goto_0
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 53
    .line 54
    invoke-virtual {v4, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    :try_start_1
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 58
    .line 59
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_1

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :catchall_1
    move-exception v2

    .line 70
    move v4, v1

    .line 71
    goto :goto_2

    .line 72
    :cond_1
    :goto_1
    iput v2, v0, Lbsh/BSHReturnStatement;->kind:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    .line 74
    return-void

    .line 75
    :goto_2
    iget-object v5, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 76
    .line 77
    if-eqz v4, :cond_2

    .line 78
    .line 79
    :try_start_2
    invoke-virtual {v5, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V

    .line 80
    .line 81
    .line 82
    goto :goto_3

    .line 83
    :catchall_2
    move-exception v1

    .line 84
    goto :goto_4

    .line 85
    :cond_2
    invoke-virtual {v5}, Lbsh/JJTParserState;->popNode()Lbsh/Node;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 86
    .line 87
    .line 88
    move v1, v4

    .line 89
    :goto_3
    :try_start_3
    instance-of v4, v2, Lbsh/ParseException;

    .line 90
    .line 91
    if-nez v4, :cond_4

    .line 92
    .line 93
    instance-of v4, v2, Ljava/lang/RuntimeException;

    .line 94
    .line 95
    if-eqz v4, :cond_3

    .line 96
    .line 97
    check-cast v2, Ljava/lang/RuntimeException;

    .line 98
    .line 99
    throw v2

    .line 100
    :catchall_3
    move-exception v2

    .line 101
    move v4, v1

    .line 102
    move-object v1, v2

    .line 103
    goto :goto_4

    .line 104
    :cond_3
    check-cast v2, Ljava/lang/Error;

    .line 105
    .line 106
    throw v2

    .line 107
    :cond_4
    check-cast v2, Lbsh/ParseException;

    .line 108
    .line 109
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 110
    :goto_4
    if-eqz v4, :cond_5

    .line 111
    .line 112
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 113
    .line 114
    invoke-virtual {v2, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 115
    .line 116
    .line 117
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 118
    .line 119
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_5

    .line 124
    .line 125
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 126
    .line 127
    .line 128
    :cond_5
    throw v1
.end method

.method public final DoStatement()V
    .locals 6

    .line 1
    new-instance v0, Lbsh/BSHWhileStatement;

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHWhileStatement;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x16

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x1

    .line 20
    :try_start_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lbsh/Parser;->Statement()V

    .line 24
    .line 25
    .line 26
    const/16 v1, 0x3d

    .line 27
    .line 28
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 29
    .line 30
    .line 31
    const/16 v1, 0x4c

    .line 32
    .line 33
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V

    .line 37
    .line 38
    .line 39
    const/16 v1, 0x4d

    .line 40
    .line 41
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lbsh/Parser;->StatementTerminator()V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 48
    .line 49
    invoke-virtual {v1, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 50
    .line 51
    .line 52
    :try_start_1
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 53
    .line 54
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_0

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception v1

    .line 65
    move v4, v2

    .line 66
    goto :goto_1

    .line 67
    :cond_0
    :goto_0
    iput-boolean v3, v0, Lbsh/BSHWhileStatement;->isDoStatement:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    return-void

    .line 70
    :catchall_1
    move-exception v1

    .line 71
    move v4, v3

    .line 72
    :goto_1
    iget-object v5, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 73
    .line 74
    if-eqz v4, :cond_1

    .line 75
    .line 76
    :try_start_2
    invoke-virtual {v5, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :catchall_2
    move-exception v1

    .line 81
    goto :goto_3

    .line 82
    :cond_1
    invoke-virtual {v5}, Lbsh/JJTParserState;->popNode()Lbsh/Node;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 83
    .line 84
    .line 85
    move v2, v4

    .line 86
    :goto_2
    :try_start_3
    instance-of v4, v1, Lbsh/ParseException;

    .line 87
    .line 88
    if-nez v4, :cond_3

    .line 89
    .line 90
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 91
    .line 92
    if-eqz v4, :cond_2

    .line 93
    .line 94
    check-cast v1, Ljava/lang/RuntimeException;

    .line 95
    .line 96
    throw v1

    .line 97
    :catchall_3
    move-exception v1

    .line 98
    move v4, v2

    .line 99
    goto :goto_3

    .line 100
    :cond_2
    check-cast v1, Ljava/lang/Error;

    .line 101
    .line 102
    throw v1

    .line 103
    :cond_3
    check-cast v1, Lbsh/ParseException;

    .line 104
    .line 105
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 106
    :goto_3
    if-eqz v4, :cond_4

    .line 107
    .line 108
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 109
    .line 110
    invoke-virtual {v2, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 111
    .line 112
    .line 113
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 114
    .line 115
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_4

    .line 120
    .line 121
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 122
    .line 123
    .line 124
    :cond_4
    throw v1
.end method

.method public final EmptyStatement()V
    .locals 1

    .line 1
    const/16 v0, 0x52

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final EnhancedForStatement()V
    .locals 10

    .line 1
    new-instance v0, Lbsh/BSHEnhancedForStatement;

    .line 2
    .line 3
    const/16 v1, 0x24

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHEnhancedForStatement;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x4

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    :try_start_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_2_36(I)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/16 v4, 0x4d

    .line 24
    .line 25
    const/16 v5, 0x96

    .line 26
    .line 27
    const/16 v6, 0x49

    .line 28
    .line 29
    const/16 v7, 0x4c

    .line 30
    .line 31
    const/16 v8, 0x1f

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-direct {p0, v8}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, v7}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 39
    .line 40
    .line 41
    invoke-direct {p0, v6}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lbsh/Parser;->Statement()V

    .line 55
    .line 56
    .line 57
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 58
    .line 59
    invoke-virtual {v4, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 60
    .line 61
    .line 62
    :try_start_1
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 63
    .line 64
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_0

    .line 69
    .line 70
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    move-exception v1

    .line 75
    move v4, v2

    .line 76
    goto :goto_3

    .line 77
    :cond_0
    :goto_0
    iget-object v1, v1, Lbsh/Token;->image:Ljava/lang/String;

    .line 78
    .line 79
    iput-object v1, v0, Lbsh/BSHEnhancedForStatement;->varName:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :catchall_1
    move-exception v1

    .line 83
    move v4, v3

    .line 84
    goto :goto_3

    .line 85
    :cond_1
    :try_start_2
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 86
    .line 87
    const/4 v9, -0x1

    .line 88
    if-ne v1, v9, :cond_2

    .line 89
    .line 90
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    :cond_2
    if-ne v1, v8, :cond_6

    .line 95
    .line 96
    invoke-direct {p0, v8}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 97
    .line 98
    .line 99
    invoke-direct {p0, v7}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 100
    .line 101
    .line 102
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 103
    .line 104
    if-ne v1, v9, :cond_3

    .line 105
    .line 106
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    :cond_3
    const/16 v7, 0x1c

    .line 111
    .line 112
    if-eq v1, v7, :cond_4

    .line 113
    .line 114
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 115
    .line 116
    iget v7, p0, Lbsh/Parser;->jj_gen:I

    .line 117
    .line 118
    const/16 v8, 0x6e

    .line 119
    .line 120
    aput v7, v1, v8

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_4
    invoke-direct {p0, v7}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 124
    .line 125
    .line 126
    iput-boolean v3, v0, Lbsh/BSHEnhancedForStatement;->isFinal:Z

    .line 127
    .line 128
    :goto_1
    invoke-virtual {p0}, Lbsh/Parser;->Type()V

    .line 129
    .line 130
    .line 131
    invoke-direct {p0, v6}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V

    .line 139
    .line 140
    .line 141
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0}, Lbsh/Parser;->Statement()V

    .line 145
    .line 146
    .line 147
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 148
    .line 149
    invoke-virtual {v4, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 150
    .line 151
    .line 152
    :try_start_3
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 153
    .line 154
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    if-eqz v4, :cond_5

    .line 159
    .line 160
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 161
    .line 162
    .line 163
    :cond_5
    iget-object v1, v1, Lbsh/Token;->image:Ljava/lang/String;

    .line 164
    .line 165
    iput-object v1, v0, Lbsh/BSHEnhancedForStatement;->varName:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 166
    .line 167
    :goto_2
    return-void

    .line 168
    :cond_6
    :try_start_4
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 169
    .line 170
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 171
    .line 172
    const/16 v5, 0x6f

    .line 173
    .line 174
    aput v4, v1, v5

    .line 175
    .line 176
    invoke-direct {p0, v9}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 177
    .line 178
    .line 179
    new-instance v1, Lbsh/ParseException;

    .line 180
    .line 181
    invoke-direct {v1}, Lbsh/ParseException;-><init>()V

    .line 182
    .line 183
    .line 184
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 185
    :goto_3
    iget-object v5, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 186
    .line 187
    if-eqz v4, :cond_7

    .line 188
    .line 189
    :try_start_5
    invoke-virtual {v5, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V

    .line 190
    .line 191
    .line 192
    goto :goto_4

    .line 193
    :catchall_2
    move-exception v1

    .line 194
    goto :goto_5

    .line 195
    :cond_7
    invoke-virtual {v5}, Lbsh/JJTParserState;->popNode()Lbsh/Node;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 196
    .line 197
    .line 198
    move v2, v4

    .line 199
    :goto_4
    :try_start_6
    instance-of v4, v1, Lbsh/ParseException;

    .line 200
    .line 201
    if-nez v4, :cond_9

    .line 202
    .line 203
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 204
    .line 205
    if-eqz v4, :cond_8

    .line 206
    .line 207
    check-cast v1, Ljava/lang/RuntimeException;

    .line 208
    .line 209
    throw v1

    .line 210
    :catchall_3
    move-exception v1

    .line 211
    move v4, v2

    .line 212
    goto :goto_5

    .line 213
    :cond_8
    check-cast v1, Ljava/lang/Error;

    .line 214
    .line 215
    throw v1

    .line 216
    :cond_9
    check-cast v1, Lbsh/ParseException;

    .line 217
    .line 218
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 219
    :goto_5
    if-eqz v4, :cond_a

    .line 220
    .line 221
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 222
    .line 223
    invoke-virtual {v2, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 224
    .line 225
    .line 226
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 227
    .line 228
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    if-eqz v2, :cond_a

    .line 233
    .line 234
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 235
    .line 236
    .line 237
    :cond_a
    throw v1
.end method

.method public final EnumBlock()V
    .locals 6

    .line 1
    new-instance v0, Lbsh/BSHBlock;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lbsh/BSHBlock;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x4e

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    :try_start_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 19
    .line 20
    .line 21
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 22
    .line 23
    const/4 v3, -0x1

    .line 24
    if-ne v1, v3, :cond_0

    .line 25
    .line 26
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    goto :goto_4

    .line 33
    :cond_0
    :goto_0
    const/16 v4, 0x49

    .line 34
    .line 35
    if-eq v1, v4, :cond_1

    .line 36
    .line 37
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 38
    .line 39
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 40
    .line 41
    const/16 v5, 0xb

    .line 42
    .line 43
    aput v4, v1, v5

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-virtual {p0}, Lbsh/Parser;->EnumConstant()V

    .line 47
    .line 48
    .line 49
    :goto_1
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 50
    .line 51
    if-ne v1, v3, :cond_2

    .line 52
    .line 53
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    :cond_2
    const/16 v4, 0x53

    .line 58
    .line 59
    if-eq v1, v4, :cond_7

    .line 60
    .line 61
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 62
    .line 63
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 64
    .line 65
    const/16 v5, 0xc

    .line 66
    .line 67
    aput v4, v1, v5

    .line 68
    .line 69
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 70
    .line 71
    if-ne v1, v3, :cond_3

    .line 72
    .line 73
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    :cond_3
    const/16 v3, 0x52

    .line 78
    .line 79
    if-eq v1, v3, :cond_4

    .line 80
    .line 81
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 82
    .line 83
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 84
    .line 85
    const/16 v4, 0xd

    .line 86
    .line 87
    aput v3, v1, v4

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_4
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 91
    .line 92
    .line 93
    :goto_2
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_2_2(I)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_5

    .line 98
    .line 99
    invoke-virtual {p0}, Lbsh/Parser;->BlockStatement()V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_5
    :goto_3
    const/16 v1, 0x4f

    .line 104
    .line 105
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 109
    .line 110
    invoke-virtual {v1, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 111
    .line 112
    .line 113
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 114
    .line 115
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_6

    .line 120
    .line 121
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 122
    .line 123
    .line 124
    :cond_6
    return-void

    .line 125
    :cond_7
    :try_start_1
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Lbsh/Parser;->EnumConstant()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :goto_4
    :try_start_2
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 133
    .line 134
    invoke-virtual {v3, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 135
    .line 136
    .line 137
    const/4 v3, 0x0

    .line 138
    :try_start_3
    instance-of v4, v1, Lbsh/ParseException;

    .line 139
    .line 140
    if-nez v4, :cond_9

    .line 141
    .line 142
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 143
    .line 144
    if-eqz v4, :cond_8

    .line 145
    .line 146
    check-cast v1, Ljava/lang/RuntimeException;

    .line 147
    .line 148
    throw v1

    .line 149
    :catchall_1
    move-exception v1

    .line 150
    goto :goto_5

    .line 151
    :cond_8
    check-cast v1, Ljava/lang/Error;

    .line 152
    .line 153
    throw v1

    .line 154
    :cond_9
    check-cast v1, Lbsh/ParseException;

    .line 155
    .line 156
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 157
    :catchall_2
    move-exception v1

    .line 158
    move v3, v2

    .line 159
    :goto_5
    if-eqz v3, :cond_a

    .line 160
    .line 161
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 162
    .line 163
    invoke-virtual {v3, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 164
    .line 165
    .line 166
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 167
    .line 168
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_a

    .line 173
    .line 174
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 175
    .line 176
    .line 177
    :cond_a
    throw v1
.end method

.method public final EnumConstant()V
    .locals 8

    .line 1
    new-instance v0, Lbsh/BSHEnumConstant;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lbsh/BSHEnumConstant;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x49

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    :try_start_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget v4, p0, Lbsh/Parser;->jj_ntk:I

    .line 24
    .line 25
    const/4 v5, -0x1

    .line 26
    if-ne v4, v5, :cond_0

    .line 27
    .line 28
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    move v4, v3

    .line 35
    goto :goto_4

    .line 36
    :cond_0
    :goto_0
    const/16 v6, 0x4c

    .line 37
    .line 38
    if-eq v4, v6, :cond_1

    .line 39
    .line 40
    iget-object v4, p0, Lbsh/Parser;->jj_la1:[I

    .line 41
    .line 42
    iget v6, p0, Lbsh/Parser;->jj_gen:I

    .line 43
    .line 44
    const/16 v7, 0x9

    .line 45
    .line 46
    aput v6, v4, v7

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {p0}, Lbsh/Parser;->Arguments()V

    .line 50
    .line 51
    .line 52
    :goto_1
    iget v4, p0, Lbsh/Parser;->jj_ntk:I

    .line 53
    .line 54
    if-ne v4, v5, :cond_2

    .line 55
    .line 56
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    :cond_2
    const/16 v5, 0x31

    .line 61
    .line 62
    if-eq v4, v5, :cond_3

    .line 63
    .line 64
    const/16 v5, 0x4e

    .line 65
    .line 66
    if-eq v4, v5, :cond_3

    .line 67
    .line 68
    iget-object v4, p0, Lbsh/Parser;->jj_la1:[I

    .line 69
    .line 70
    iget v5, p0, Lbsh/Parser;->jj_gen:I

    .line 71
    .line 72
    const/16 v6, 0xa

    .line 73
    .line 74
    aput v5, v4, v6

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_3
    invoke-virtual {p0}, Lbsh/Parser;->Block()V

    .line 78
    .line 79
    .line 80
    :goto_2
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 81
    .line 82
    invoke-virtual {v4, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    .line 85
    :try_start_1
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 86
    .line 87
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-eqz v4, :cond_4

    .line 92
    .line 93
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 94
    .line 95
    .line 96
    goto :goto_3

    .line 97
    :catchall_1
    move-exception v1

    .line 98
    move v4, v2

    .line 99
    goto :goto_4

    .line 100
    :cond_4
    :goto_3
    iget-object v1, v1, Lbsh/Token;->image:Ljava/lang/String;

    .line 101
    .line 102
    iput-object v1, v0, Lbsh/BSHEnumConstant;->name:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 103
    .line 104
    return-void

    .line 105
    :goto_4
    iget-object v5, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 106
    .line 107
    if-eqz v4, :cond_5

    .line 108
    .line 109
    :try_start_2
    invoke-virtual {v5, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V

    .line 110
    .line 111
    .line 112
    goto :goto_5

    .line 113
    :catchall_2
    move-exception v1

    .line 114
    goto :goto_6

    .line 115
    :cond_5
    invoke-virtual {v5}, Lbsh/JJTParserState;->popNode()Lbsh/Node;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 116
    .line 117
    .line 118
    move v2, v4

    .line 119
    :goto_5
    :try_start_3
    instance-of v4, v1, Lbsh/ParseException;

    .line 120
    .line 121
    if-nez v4, :cond_7

    .line 122
    .line 123
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 124
    .line 125
    if-eqz v4, :cond_6

    .line 126
    .line 127
    check-cast v1, Ljava/lang/RuntimeException;

    .line 128
    .line 129
    throw v1

    .line 130
    :catchall_3
    move-exception v1

    .line 131
    move v4, v2

    .line 132
    goto :goto_6

    .line 133
    :cond_6
    check-cast v1, Ljava/lang/Error;

    .line 134
    .line 135
    throw v1

    .line 136
    :cond_7
    check-cast v1, Lbsh/ParseException;

    .line 137
    .line 138
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 139
    :goto_6
    if-eqz v4, :cond_8

    .line 140
    .line 141
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 142
    .line 143
    invoke-virtual {v2, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 144
    .line 145
    .line 146
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 147
    .line 148
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_8

    .line 153
    .line 154
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 155
    .line 156
    .line 157
    :cond_8
    throw v1
.end method

.method public final EqualityExpression()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lbsh/Parser;->InstanceOfExpression()V

    .line 2
    .line 3
    .line 4
    :goto_0
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :cond_0
    const/16 v2, 0x61

    .line 14
    .line 15
    const/16 v3, 0x5c

    .line 16
    .line 17
    if-eq v0, v3, :cond_1

    .line 18
    .line 19
    if-eq v0, v2, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 22
    .line 23
    const/16 v1, 0x32

    .line 24
    .line 25
    iget v2, p0, Lbsh/Parser;->jj_gen:I

    .line 26
    .line 27
    aput v2, v0, v1

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 31
    .line 32
    if-ne v0, v1, :cond_2

    .line 33
    .line 34
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    :cond_2
    if-eq v0, v3, :cond_4

    .line 39
    .line 40
    if-ne v0, v2, :cond_3

    .line 41
    .line 42
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 48
    .line 49
    const/16 v2, 0x33

    .line 50
    .line 51
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 52
    .line 53
    aput v3, v0, v2

    .line 54
    .line 55
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 56
    .line 57
    .line 58
    invoke-static {}, Lbsh/j;->a()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_4
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :goto_1
    invoke-virtual {p0}, Lbsh/Parser;->InstanceOfExpression()V

    .line 67
    .line 68
    .line 69
    new-instance v1, Lbsh/BSHBinaryExpression;

    .line 70
    .line 71
    const/16 v2, 0x11

    .line 72
    .line 73
    invoke-direct {v1, v2}, Lbsh/BSHBinaryExpression;-><init>(I)V

    .line 74
    .line 75
    .line 76
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 77
    .line 78
    invoke-virtual {v2, v1}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 82
    .line 83
    .line 84
    const/4 v2, 0x2

    .line 85
    const/4 v3, 0x1

    .line 86
    :try_start_0
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 87
    .line 88
    invoke-virtual {v4, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 89
    .line 90
    .line 91
    const/4 v3, 0x0

    .line 92
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 93
    .line 94
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_5

    .line 99
    .line 100
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    goto :goto_3

    .line 106
    :cond_5
    :goto_2
    iget v0, v0, Lbsh/Token;->kind:I

    .line 107
    .line 108
    iput v0, v1, Lbsh/BSHBinaryExpression;->kind:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :goto_3
    if-eqz v3, :cond_6

    .line 112
    .line 113
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 114
    .line 115
    invoke-virtual {v3, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 116
    .line 117
    .line 118
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 119
    .line 120
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_6

    .line 125
    .line 126
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 127
    .line 128
    .line 129
    :cond_6
    throw v0
.end method

.method public final ExclusiveOrExpression()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lbsh/Parser;->AndExpression()V

    .line 2
    .line 3
    .line 4
    :goto_0
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :cond_0
    const/16 v2, 0x71

    .line 14
    .line 15
    const/16 v3, 0x70

    .line 16
    .line 17
    if-eq v0, v3, :cond_1

    .line 18
    .line 19
    if-eq v0, v2, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 22
    .line 23
    const/16 v1, 0x2e

    .line 24
    .line 25
    iget v2, p0, Lbsh/Parser;->jj_gen:I

    .line 26
    .line 27
    aput v2, v0, v1

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 31
    .line 32
    if-ne v0, v1, :cond_2

    .line 33
    .line 34
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    :cond_2
    if-eq v0, v3, :cond_4

    .line 39
    .line 40
    if-ne v0, v2, :cond_3

    .line 41
    .line 42
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 48
    .line 49
    const/16 v2, 0x2f

    .line 50
    .line 51
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 52
    .line 53
    aput v3, v0, v2

    .line 54
    .line 55
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 56
    .line 57
    .line 58
    invoke-static {}, Lbsh/j;->a()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_4
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :goto_1
    invoke-virtual {p0}, Lbsh/Parser;->AndExpression()V

    .line 67
    .line 68
    .line 69
    new-instance v1, Lbsh/BSHBinaryExpression;

    .line 70
    .line 71
    const/16 v2, 0x11

    .line 72
    .line 73
    invoke-direct {v1, v2}, Lbsh/BSHBinaryExpression;-><init>(I)V

    .line 74
    .line 75
    .line 76
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 77
    .line 78
    invoke-virtual {v2, v1}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 82
    .line 83
    .line 84
    const/4 v2, 0x2

    .line 85
    const/4 v3, 0x1

    .line 86
    :try_start_0
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 87
    .line 88
    invoke-virtual {v4, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 89
    .line 90
    .line 91
    const/4 v3, 0x0

    .line 92
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 93
    .line 94
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_5

    .line 99
    .line 100
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    goto :goto_3

    .line 106
    :cond_5
    :goto_2
    iget v0, v0, Lbsh/Token;->kind:I

    .line 107
    .line 108
    iput v0, v1, Lbsh/BSHBinaryExpression;->kind:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :goto_3
    if-eqz v3, :cond_6

    .line 112
    .line 113
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 114
    .line 115
    invoke-virtual {v3, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 116
    .line 117
    .line 118
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 119
    .line 120
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_6

    .line 125
    .line 126
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 127
    .line 128
    .line 129
    :cond_6
    throw v0
.end method

.method public final Expression()V
    .locals 5

    .line 1
    new-instance v0, Lbsh/BSHAssignment;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHAssignment;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    :try_start_0
    invoke-virtual {p0}, Lbsh/Parser;->ConditionalExpression()V

    .line 18
    .line 19
    .line 20
    iget v2, p0, Lbsh/Parser;->jj_ntk:I

    .line 21
    .line 22
    const/4 v3, -0x1

    .line 23
    if-ne v2, v3, :cond_0

    .line 24
    .line 25
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v2

    .line 31
    goto :goto_2

    .line 32
    :cond_0
    :goto_0
    const/16 v3, 0x55

    .line 33
    .line 34
    if-eq v2, v3, :cond_1

    .line 35
    .line 36
    const/16 v3, 0x92

    .line 37
    .line 38
    if-eq v2, v3, :cond_1

    .line 39
    .line 40
    packed-switch v2, :pswitch_data_0

    .line 41
    .line 42
    .line 43
    iget-object v2, p0, Lbsh/Parser;->jj_la1:[I

    .line 44
    .line 45
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 46
    .line 47
    const/16 v4, 0x23

    .line 48
    .line 49
    aput v3, v2, v4

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    :pswitch_0
    invoke-virtual {p0}, Lbsh/Parser;->AssignmentOperator()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iput-object v2, v0, Lbsh/BSHAssignment;->operator:Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    :goto_1
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 66
    .line 67
    invoke-virtual {v2, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 71
    .line 72
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    return-void

    .line 82
    :goto_2
    :try_start_1
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 83
    .line 84
    invoke-virtual {v3, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 85
    .line 86
    .line 87
    const/4 v3, 0x0

    .line 88
    :try_start_2
    instance-of v4, v2, Lbsh/ParseException;

    .line 89
    .line 90
    if-nez v4, :cond_4

    .line 91
    .line 92
    instance-of v4, v2, Ljava/lang/RuntimeException;

    .line 93
    .line 94
    if-eqz v4, :cond_3

    .line 95
    .line 96
    check-cast v2, Ljava/lang/RuntimeException;

    .line 97
    .line 98
    throw v2

    .line 99
    :catchall_1
    move-exception v2

    .line 100
    goto :goto_3

    .line 101
    :cond_3
    check-cast v2, Ljava/lang/Error;

    .line 102
    .line 103
    throw v2

    .line 104
    :cond_4
    check-cast v2, Lbsh/ParseException;

    .line 105
    .line 106
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 107
    :catchall_2
    move-exception v2

    .line 108
    move v3, v1

    .line 109
    :goto_3
    if-eqz v3, :cond_5

    .line 110
    .line 111
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 112
    .line 113
    invoke-virtual {v3, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 114
    .line 115
    .line 116
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 117
    .line 118
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_5

    .line 123
    .line 124
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 125
    .line 126
    .line 127
    :cond_5
    throw v2

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x7c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ExtensionName()V
    .locals 12

    .line 1
    new-instance v0, Lbsh/BSHAmbiguousName;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHAmbiguousName;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    :try_start_0
    iget v2, p0, Lbsh/Parser;->jj_ntk:I

    .line 18
    .line 19
    const/4 v3, -0x1

    .line 20
    if-ne v2, v3, :cond_0

    .line 21
    .line 22
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v2

    .line 28
    move v3, v1

    .line 29
    goto/16 :goto_5

    .line 30
    .line 31
    :cond_0
    :goto_0
    const/16 v4, 0xc

    .line 32
    .line 33
    const/16 v5, 0x49

    .line 34
    .line 35
    if-eq v2, v4, :cond_9

    .line 36
    .line 37
    const/16 v4, 0xf

    .line 38
    .line 39
    if-eq v2, v4, :cond_8

    .line 40
    .line 41
    const/16 v4, 0x12

    .line 42
    .line 43
    if-eq v2, v4, :cond_7

    .line 44
    .line 45
    const/16 v4, 0x17

    .line 46
    .line 47
    if-eq v2, v4, :cond_6

    .line 48
    .line 49
    const/16 v4, 0x1e

    .line 50
    .line 51
    if-eq v2, v4, :cond_5

    .line 52
    .line 53
    const/16 v4, 0x25

    .line 54
    .line 55
    if-eq v2, v4, :cond_4

    .line 56
    .line 57
    const/16 v4, 0x27

    .line 58
    .line 59
    if-eq v2, v4, :cond_3

    .line 60
    .line 61
    const/16 v4, 0x30

    .line 62
    .line 63
    if-eq v2, v4, :cond_2

    .line 64
    .line 65
    if-ne v2, v5, :cond_1

    .line 66
    .line 67
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    iget-object v2, p0, Lbsh/Parser;->jj_la1:[I

    .line 73
    .line 74
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 75
    .line 76
    const/16 v5, 0x21

    .line 77
    .line 78
    aput v4, v2, v5

    .line 79
    .line 80
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 81
    .line 82
    .line 83
    new-instance v2, Lbsh/ParseException;

    .line 84
    .line 85
    invoke-direct {v2}, Lbsh/ParseException;-><init>()V

    .line 86
    .line 87
    .line 88
    throw v2

    .line 89
    :cond_2
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    goto :goto_1

    .line 94
    :cond_3
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    goto :goto_1

    .line 99
    :cond_4
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    goto :goto_1

    .line 104
    :cond_5
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    goto :goto_1

    .line 109
    :cond_6
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    goto :goto_1

    .line 114
    :cond_7
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    goto :goto_1

    .line 119
    :cond_8
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    goto :goto_1

    .line 124
    :cond_9
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    iget-object v2, v2, Lbsh/Token;->image:Ljava/lang/String;

    .line 131
    .line 132
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    :goto_2
    const/4 v2, 0x2

    .line 136
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_2_10(I)Z

    .line 137
    .line 138
    .line 139
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    const-string v6, "[]"

    .line 141
    .line 142
    const/16 v7, 0x51

    .line 143
    .line 144
    const/16 v8, 0x50

    .line 145
    .line 146
    if-eqz v4, :cond_a

    .line 147
    .line 148
    :try_start_1
    invoke-direct {p0, v8}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 149
    .line 150
    .line 151
    invoke-direct {p0, v7}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_a
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_2_11(I)Z

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    if-eqz v4, :cond_b

    .line 163
    .line 164
    const/16 v4, 0x54

    .line 165
    .line 166
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 167
    .line 168
    .line 169
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    new-instance v9, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    .line 177
    .line 178
    const-string v10, "."

    .line 179
    .line 180
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    iget-object v4, v4, Lbsh/Token;->image:Ljava/lang/String;

    .line 184
    .line 185
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    :goto_3
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_2_12(I)Z

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    if-eqz v4, :cond_a

    .line 200
    .line 201
    invoke-direct {p0, v8}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 202
    .line 203
    .line 204
    invoke-direct {p0, v7}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_b
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 212
    .line 213
    invoke-virtual {v2, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 214
    .line 215
    .line 216
    const/4 v2, 0x0

    .line 217
    :try_start_2
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 218
    .line 219
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-eqz v4, :cond_c

    .line 224
    .line 225
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 226
    .line 227
    .line 228
    goto :goto_4

    .line 229
    :catchall_1
    move-exception v3

    .line 230
    move-object v11, v3

    .line 231
    move v3, v2

    .line 232
    move-object v2, v11

    .line 233
    goto :goto_5

    .line 234
    :cond_c
    :goto_4
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    iput-object v3, v0, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 239
    .line 240
    return-void

    .line 241
    :goto_5
    if-eqz v3, :cond_d

    .line 242
    .line 243
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 244
    .line 245
    invoke-virtual {v3, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 246
    .line 247
    .line 248
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 249
    .line 250
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    if-eqz v1, :cond_d

    .line 255
    .line 256
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 257
    .line 258
    .line 259
    :cond_d
    throw v2
.end method

.method public final ForInit()V
    .locals 4

    .line 1
    const v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_2_37(I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lbsh/Parser;->TypedVariableDeclaration()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    :cond_1
    const/16 v2, 0x29

    .line 24
    .line 25
    if-eq v0, v2, :cond_2

    .line 26
    .line 27
    const/16 v2, 0x2a

    .line 28
    .line 29
    if-eq v0, v2, :cond_2

    .line 30
    .line 31
    const/16 v2, 0x5a

    .line 32
    .line 33
    if-eq v0, v2, :cond_2

    .line 34
    .line 35
    const/16 v2, 0x5b

    .line 36
    .line 37
    if-eq v0, v2, :cond_2

    .line 38
    .line 39
    sparse-switch v0, :sswitch_data_0

    .line 40
    .line 41
    .line 42
    packed-switch v0, :pswitch_data_0

    .line 43
    .line 44
    .line 45
    packed-switch v0, :pswitch_data_1

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 49
    .line 50
    const/16 v2, 0x70

    .line 51
    .line 52
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 53
    .line 54
    aput v3, v0, v2

    .line 55
    .line 56
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 57
    .line 58
    .line 59
    invoke-static {}, Lbsh/j;->a()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    :pswitch_0
    :sswitch_0
    invoke-virtual {p0}, Lbsh/Parser;->StatementExpressionList()V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_0
        0xf -> :sswitch_0
        0x12 -> :sswitch_0
        0x17 -> :sswitch_0
        0x1b -> :sswitch_0
        0x1e -> :sswitch_0
        0x25 -> :sswitch_0
        0x27 -> :sswitch_0
        0x30 -> :sswitch_0
        0x38 -> :sswitch_0
        0x3a -> :sswitch_0
        0x3c -> :sswitch_0
        0x3e -> :sswitch_0
        0x43 -> :sswitch_0
        0x4c -> :sswitch_0
        0x4e -> :sswitch_0
        0x50 -> :sswitch_0
    .end sparse-switch

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    :pswitch_data_0
    .packed-switch 0x46
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x66
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ForStatement()V
    .locals 11

    .line 1
    new-instance v0, Lbsh/BSHForStatement;

    .line 2
    .line 3
    const/16 v1, 0x23

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHForStatement;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x1f

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    :try_start_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 20
    .line 21
    .line 22
    const/16 v1, 0x4c

    .line 23
    .line 24
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 25
    .line 26
    .line 27
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 28
    .line 29
    const/4 v3, -0x1

    .line 30
    if-ne v1, v3, :cond_0

    .line 31
    .line 32
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_0
    :goto_0
    sparse-switch v1, :sswitch_data_0

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 44
    .line 45
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 46
    .line 47
    const/16 v5, 0x6b

    .line 48
    .line 49
    aput v4, v1, v5

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :sswitch_0
    invoke-virtual {p0}, Lbsh/Parser;->ForInit()V

    .line 53
    .line 54
    .line 55
    iput-boolean v2, v0, Lbsh/BSHForStatement;->hasForInit:Z

    .line 56
    .line 57
    :goto_1
    const/16 v1, 0x52

    .line 58
    .line 59
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 60
    .line 61
    .line 62
    iget v4, p0, Lbsh/Parser;->jj_ntk:I

    .line 63
    .line 64
    if-ne v4, v3, :cond_1

    .line 65
    .line 66
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    :cond_1
    const/16 v5, 0x5b

    .line 71
    .line 72
    const/16 v6, 0x5a

    .line 73
    .line 74
    const/16 v7, 0x2a

    .line 75
    .line 76
    const/16 v8, 0x29

    .line 77
    .line 78
    if-eq v4, v8, :cond_2

    .line 79
    .line 80
    if-eq v4, v7, :cond_2

    .line 81
    .line 82
    if-eq v4, v6, :cond_2

    .line 83
    .line 84
    if-eq v4, v5, :cond_2

    .line 85
    .line 86
    sparse-switch v4, :sswitch_data_1

    .line 87
    .line 88
    .line 89
    packed-switch v4, :pswitch_data_0

    .line 90
    .line 91
    .line 92
    packed-switch v4, :pswitch_data_1

    .line 93
    .line 94
    .line 95
    iget-object v4, p0, Lbsh/Parser;->jj_la1:[I

    .line 96
    .line 97
    iget v9, p0, Lbsh/Parser;->jj_gen:I

    .line 98
    .line 99
    const/16 v10, 0x6c

    .line 100
    .line 101
    aput v9, v4, v10

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_2
    :pswitch_0
    :sswitch_1
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V

    .line 105
    .line 106
    .line 107
    iput-boolean v2, v0, Lbsh/BSHForStatement;->hasExpression:Z

    .line 108
    .line 109
    :goto_2
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 110
    .line 111
    .line 112
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 113
    .line 114
    if-ne v1, v3, :cond_3

    .line 115
    .line 116
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    :cond_3
    if-eq v1, v8, :cond_4

    .line 121
    .line 122
    if-eq v1, v7, :cond_4

    .line 123
    .line 124
    if-eq v1, v6, :cond_4

    .line 125
    .line 126
    if-eq v1, v5, :cond_4

    .line 127
    .line 128
    sparse-switch v1, :sswitch_data_2

    .line 129
    .line 130
    .line 131
    packed-switch v1, :pswitch_data_2

    .line 132
    .line 133
    .line 134
    packed-switch v1, :pswitch_data_3

    .line 135
    .line 136
    .line 137
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 138
    .line 139
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 140
    .line 141
    const/16 v4, 0x6d

    .line 142
    .line 143
    aput v3, v1, v4

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_4
    :pswitch_1
    :sswitch_2
    invoke-virtual {p0}, Lbsh/Parser;->ForUpdate()V

    .line 147
    .line 148
    .line 149
    iput-boolean v2, v0, Lbsh/BSHForStatement;->hasForUpdate:Z

    .line 150
    .line 151
    :goto_3
    const/16 v1, 0x4d

    .line 152
    .line 153
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0}, Lbsh/Parser;->Statement()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    .line 158
    .line 159
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 160
    .line 161
    invoke-virtual {v1, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 162
    .line 163
    .line 164
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 165
    .line 166
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_5

    .line 171
    .line 172
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 173
    .line 174
    .line 175
    :cond_5
    return-void

    .line 176
    :goto_4
    :try_start_1
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 177
    .line 178
    invoke-virtual {v3, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 179
    .line 180
    .line 181
    const/4 v3, 0x0

    .line 182
    :try_start_2
    instance-of v4, v1, Lbsh/ParseException;

    .line 183
    .line 184
    if-nez v4, :cond_7

    .line 185
    .line 186
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 187
    .line 188
    if-eqz v4, :cond_6

    .line 189
    .line 190
    check-cast v1, Ljava/lang/RuntimeException;

    .line 191
    .line 192
    throw v1

    .line 193
    :catchall_1
    move-exception v1

    .line 194
    goto :goto_5

    .line 195
    :cond_6
    check-cast v1, Ljava/lang/Error;

    .line 196
    .line 197
    throw v1

    .line 198
    :cond_7
    check-cast v1, Lbsh/ParseException;

    .line 199
    .line 200
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 201
    :catchall_2
    move-exception v1

    .line 202
    move v3, v2

    .line 203
    :goto_5
    if-eqz v3, :cond_8

    .line 204
    .line 205
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 206
    .line 207
    invoke-virtual {v3, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 208
    .line 209
    .line 210
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 211
    .line 212
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-eqz v2, :cond_8

    .line 217
    .line 218
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 219
    .line 220
    .line 221
    :cond_8
    throw v1

    .line 222
    nop

    .line 223
    :sswitch_data_0
    .sparse-switch
        0xb -> :sswitch_0
        0xc -> :sswitch_0
        0xf -> :sswitch_0
        0x12 -> :sswitch_0
        0x15 -> :sswitch_0
        0x17 -> :sswitch_0
        0x1b -> :sswitch_0
        0x1c -> :sswitch_0
        0x1e -> :sswitch_0
        0x25 -> :sswitch_0
        0x27 -> :sswitch_0
        0x28 -> :sswitch_0
        0x29 -> :sswitch_0
        0x2a -> :sswitch_0
        0x2c -> :sswitch_0
        0x2d -> :sswitch_0
        0x2e -> :sswitch_0
        0x30 -> :sswitch_0
        0x31 -> :sswitch_0
        0x32 -> :sswitch_0
        0x34 -> :sswitch_0
        0x35 -> :sswitch_0
        0x38 -> :sswitch_0
        0x3a -> :sswitch_0
        0x3b -> :sswitch_0
        0x3c -> :sswitch_0
        0x3e -> :sswitch_0
        0x43 -> :sswitch_0
        0x46 -> :sswitch_0
        0x47 -> :sswitch_0
        0x48 -> :sswitch_0
        0x49 -> :sswitch_0
        0x4c -> :sswitch_0
        0x4e -> :sswitch_0
        0x50 -> :sswitch_0
        0x5a -> :sswitch_0
        0x5b -> :sswitch_0
        0x66 -> :sswitch_0
        0x67 -> :sswitch_0
        0x68 -> :sswitch_0
        0x69 -> :sswitch_0
    .end sparse-switch

    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    :sswitch_data_1
    .sparse-switch
        0xc -> :sswitch_1
        0xf -> :sswitch_1
        0x12 -> :sswitch_1
        0x17 -> :sswitch_1
        0x1b -> :sswitch_1
        0x1e -> :sswitch_1
        0x25 -> :sswitch_1
        0x27 -> :sswitch_1
        0x30 -> :sswitch_1
        0x38 -> :sswitch_1
        0x3a -> :sswitch_1
        0x3c -> :sswitch_1
        0x3e -> :sswitch_1
        0x43 -> :sswitch_1
        0x4c -> :sswitch_1
        0x4e -> :sswitch_1
        0x50 -> :sswitch_1
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x46
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x66
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        0xc -> :sswitch_2
        0xf -> :sswitch_2
        0x12 -> :sswitch_2
        0x17 -> :sswitch_2
        0x1b -> :sswitch_2
        0x1e -> :sswitch_2
        0x25 -> :sswitch_2
        0x27 -> :sswitch_2
        0x30 -> :sswitch_2
        0x38 -> :sswitch_2
        0x3a -> :sswitch_2
        0x3c -> :sswitch_2
        0x3e -> :sswitch_2
        0x43 -> :sswitch_2
        0x4c -> :sswitch_2
        0x4e -> :sswitch_2
        0x50 -> :sswitch_2
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x46
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x66
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public final ForUpdate()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/Parser;->StatementExpressionList()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final FormalParameter()V
    .locals 8

    .line 1
    new-instance v0, Lbsh/BSHFormalParameter;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHFormalParameter;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x1

    .line 18
    :try_start_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_2_7(I)Z

    .line 19
    .line 20
    .line 21
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    iget v3, p0, Lbsh/Parser;->jj_ntk:I

    .line 23
    .line 24
    const/16 v4, 0x49

    .line 25
    .line 26
    const/4 v5, -0x1

    .line 27
    if-eqz v1, :cond_4

    .line 28
    .line 29
    if-ne v3, v5, :cond_0

    .line 30
    .line 31
    :try_start_1
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    goto/16 :goto_4

    .line 38
    .line 39
    :cond_0
    :goto_0
    const/16 v1, 0x1c

    .line 40
    .line 41
    if-eq v3, v1, :cond_1

    .line 42
    .line 43
    iget-object v3, p0, Lbsh/Parser;->jj_la1:[I

    .line 44
    .line 45
    iget v6, p0, Lbsh/Parser;->jj_gen:I

    .line 46
    .line 47
    const/16 v7, 0x1b

    .line 48
    .line 49
    aput v6, v3, v7

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 53
    .line 54
    .line 55
    iput-boolean v2, v0, Lbsh/BSHFormalParameter;->isFinal:Z

    .line 56
    .line 57
    :goto_1
    invoke-virtual {p0}, Lbsh/Parser;->Type()V

    .line 58
    .line 59
    .line 60
    iget v3, p0, Lbsh/Parser;->jj_ntk:I

    .line 61
    .line 62
    if-ne v3, v5, :cond_2

    .line 63
    .line 64
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    :cond_2
    const/16 v5, 0x98

    .line 69
    .line 70
    if-eq v3, v5, :cond_3

    .line 71
    .line 72
    iget-object v3, p0, Lbsh/Parser;->jj_la1:[I

    .line 73
    .line 74
    iget v5, p0, Lbsh/Parser;->jj_gen:I

    .line 75
    .line 76
    aput v5, v3, v1

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 80
    .line 81
    .line 82
    iput-boolean v2, v0, Lbsh/BSHFormalParameter;->isVarArgs:Z

    .line 83
    .line 84
    :goto_2
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iget-object v1, v1, Lbsh/Token;->image:Ljava/lang/String;

    .line 89
    .line 90
    iput-object v1, v0, Lbsh/BSHFormalParameter;->name:Ljava/lang/String;

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_4
    if-ne v3, v5, :cond_5

    .line 94
    .line 95
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    :cond_5
    if-ne v3, v4, :cond_8

    .line 100
    .line 101
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    iget-object v1, v1, Lbsh/Token;->image:Ljava/lang/String;

    .line 106
    .line 107
    iput-object v1, v0, Lbsh/BSHFormalParameter;->name:Ljava/lang/String;

    .line 108
    .line 109
    :goto_3
    invoke-virtual {p0}, Lbsh/Parser;->isFormalParameterDimensions()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_6

    .line 114
    .line 115
    const/16 v1, 0x50

    .line 116
    .line 117
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 118
    .line 119
    .line 120
    const/16 v1, 0x51

    .line 121
    .line 122
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 123
    .line 124
    .line 125
    iget v1, v0, Lbsh/BSHFormalParameter;->dimensions:I

    .line 126
    .line 127
    add-int/2addr v1, v2

    .line 128
    iput v1, v0, Lbsh/BSHFormalParameter;->dimensions:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_6
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 132
    .line 133
    invoke-virtual {v1, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 134
    .line 135
    .line 136
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 137
    .line 138
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_7

    .line 143
    .line 144
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 145
    .line 146
    .line 147
    :cond_7
    return-void

    .line 148
    :cond_8
    :try_start_2
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 149
    .line 150
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 151
    .line 152
    const/16 v4, 0x1d

    .line 153
    .line 154
    aput v3, v1, v4

    .line 155
    .line 156
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 157
    .line 158
    .line 159
    new-instance v1, Lbsh/ParseException;

    .line 160
    .line 161
    invoke-direct {v1}, Lbsh/ParseException;-><init>()V

    .line 162
    .line 163
    .line 164
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 165
    :goto_4
    :try_start_3
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 166
    .line 167
    invoke-virtual {v3, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 168
    .line 169
    .line 170
    const/4 v3, 0x0

    .line 171
    :try_start_4
    instance-of v4, v1, Lbsh/ParseException;

    .line 172
    .line 173
    if-nez v4, :cond_a

    .line 174
    .line 175
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 176
    .line 177
    if-eqz v4, :cond_9

    .line 178
    .line 179
    check-cast v1, Ljava/lang/RuntimeException;

    .line 180
    .line 181
    throw v1

    .line 182
    :catchall_1
    move-exception v1

    .line 183
    goto :goto_5

    .line 184
    :cond_9
    check-cast v1, Ljava/lang/Error;

    .line 185
    .line 186
    throw v1

    .line 187
    :cond_a
    check-cast v1, Lbsh/ParseException;

    .line 188
    .line 189
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 190
    :catchall_2
    move-exception v1

    .line 191
    move v3, v2

    .line 192
    :goto_5
    if-eqz v3, :cond_b

    .line 193
    .line 194
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 195
    .line 196
    invoke-virtual {v3, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 197
    .line 198
    .line 199
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 200
    .line 201
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    if-eqz v2, :cond_b

    .line 206
    .line 207
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 208
    .line 209
    .line 210
    :cond_b
    throw v1
.end method

.method public final FormalParameters()V
    .locals 5

    .line 1
    new-instance v0, Lbsh/BSHFormalParameters;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHFormalParameters;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x4c

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    :try_start_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 20
    .line 21
    .line 22
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 23
    .line 24
    const/4 v3, -0x1

    .line 25
    if-ne v1, v3, :cond_0

    .line 26
    .line 27
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v1

    .line 33
    goto :goto_3

    .line 34
    :cond_0
    :goto_0
    const/16 v4, 0xc

    .line 35
    .line 36
    if-eq v1, v4, :cond_1

    .line 37
    .line 38
    const/16 v4, 0xf

    .line 39
    .line 40
    if-eq v1, v4, :cond_1

    .line 41
    .line 42
    const/16 v4, 0x12

    .line 43
    .line 44
    if-eq v1, v4, :cond_1

    .line 45
    .line 46
    const/16 v4, 0x17

    .line 47
    .line 48
    if-eq v1, v4, :cond_1

    .line 49
    .line 50
    const/16 v4, 0x1c

    .line 51
    .line 52
    if-eq v1, v4, :cond_1

    .line 53
    .line 54
    const/16 v4, 0x1e

    .line 55
    .line 56
    if-eq v1, v4, :cond_1

    .line 57
    .line 58
    const/16 v4, 0x25

    .line 59
    .line 60
    if-eq v1, v4, :cond_1

    .line 61
    .line 62
    const/16 v4, 0x27

    .line 63
    .line 64
    if-eq v1, v4, :cond_1

    .line 65
    .line 66
    const/16 v4, 0x30

    .line 67
    .line 68
    if-eq v1, v4, :cond_1

    .line 69
    .line 70
    const/16 v4, 0x49

    .line 71
    .line 72
    if-eq v1, v4, :cond_1

    .line 73
    .line 74
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 75
    .line 76
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 77
    .line 78
    const/16 v4, 0x1a

    .line 79
    .line 80
    aput v3, v1, v4

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_1
    invoke-virtual {p0}, Lbsh/Parser;->FormalParameter()V

    .line 84
    .line 85
    .line 86
    :goto_1
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 87
    .line 88
    if-ne v1, v3, :cond_2

    .line 89
    .line 90
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    :cond_2
    const/16 v4, 0x53

    .line 95
    .line 96
    if-eq v1, v4, :cond_4

    .line 97
    .line 98
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 99
    .line 100
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 101
    .line 102
    const/16 v4, 0x19

    .line 103
    .line 104
    aput v3, v1, v4

    .line 105
    .line 106
    :goto_2
    const/16 v1, 0x4d

    .line 107
    .line 108
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    .line 111
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 112
    .line 113
    invoke-virtual {v1, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 114
    .line 115
    .line 116
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 117
    .line 118
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_3

    .line 123
    .line 124
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 125
    .line 126
    .line 127
    :cond_3
    return-void

    .line 128
    :cond_4
    :try_start_1
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Lbsh/Parser;->FormalParameter()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :goto_3
    :try_start_2
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 136
    .line 137
    invoke-virtual {v3, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 138
    .line 139
    .line 140
    const/4 v3, 0x0

    .line 141
    :try_start_3
    instance-of v4, v1, Lbsh/ParseException;

    .line 142
    .line 143
    if-nez v4, :cond_6

    .line 144
    .line 145
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 146
    .line 147
    if-eqz v4, :cond_5

    .line 148
    .line 149
    check-cast v1, Ljava/lang/RuntimeException;

    .line 150
    .line 151
    throw v1

    .line 152
    :catchall_1
    move-exception v1

    .line 153
    goto :goto_4

    .line 154
    :cond_5
    check-cast v1, Ljava/lang/Error;

    .line 155
    .line 156
    throw v1

    .line 157
    :cond_6
    check-cast v1, Lbsh/ParseException;

    .line 158
    .line 159
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 160
    :catchall_2
    move-exception v1

    .line 161
    move v3, v2

    .line 162
    :goto_4
    if-eqz v3, :cond_7

    .line 163
    .line 164
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 165
    .line 166
    invoke-virtual {v3, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 167
    .line 168
    .line 169
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 170
    .line 171
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-eqz v2, :cond_7

    .line 176
    .line 177
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 178
    .line 179
    .line 180
    :cond_7
    throw v1
.end method

.method public final IfStatement()V
    .locals 6

    .line 1
    new-instance v0, Lbsh/BSHIfStatement;

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHIfStatement;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v2, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    :try_start_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 18
    .line 19
    .line 20
    const/16 v1, 0x4c

    .line 21
    .line 22
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V

    .line 26
    .line 27
    .line 28
    const/16 v1, 0x4d

    .line 29
    .line 30
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 31
    .line 32
    .line 33
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 34
    .line 35
    const/4 v3, -0x1

    .line 36
    if-ne v1, v3, :cond_0

    .line 37
    .line 38
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v1

    .line 44
    goto :goto_3

    .line 45
    :cond_0
    :goto_0
    const/16 v4, 0x52

    .line 46
    .line 47
    if-eq v1, v4, :cond_2

    .line 48
    .line 49
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 50
    .line 51
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 52
    .line 53
    const/16 v5, 0x69

    .line 54
    .line 55
    aput v4, v1, v5

    .line 56
    .line 57
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_2_35(I)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    invoke-virtual {p0}, Lbsh/Parser;->Statement()V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 68
    .line 69
    .line 70
    new-instance v1, Lbsh/ParseException;

    .line 71
    .line 72
    invoke-direct {v1}, Lbsh/ParseException;-><init>()V

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :cond_2
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 77
    .line 78
    .line 79
    iput-boolean v2, v0, Lbsh/BSHIfStatement;->isClosed:Z

    .line 80
    .line 81
    :goto_1
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 82
    .line 83
    if-ne v1, v3, :cond_3

    .line 84
    .line 85
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    :cond_3
    const/16 v3, 0x18

    .line 90
    .line 91
    if-eq v1, v3, :cond_4

    .line 92
    .line 93
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 94
    .line 95
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 96
    .line 97
    const/16 v4, 0x6a

    .line 98
    .line 99
    aput v3, v1, v4

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_4
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Lbsh/Parser;->Statement()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    .line 107
    .line 108
    :goto_2
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 109
    .line 110
    invoke-virtual {v1, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 111
    .line 112
    .line 113
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 114
    .line 115
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_5

    .line 120
    .line 121
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 122
    .line 123
    .line 124
    :cond_5
    return-void

    .line 125
    :goto_3
    :try_start_1
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 126
    .line 127
    invoke-virtual {v3, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 128
    .line 129
    .line 130
    const/4 v3, 0x0

    .line 131
    :try_start_2
    instance-of v4, v1, Lbsh/ParseException;

    .line 132
    .line 133
    if-nez v4, :cond_7

    .line 134
    .line 135
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 136
    .line 137
    if-eqz v4, :cond_6

    .line 138
    .line 139
    check-cast v1, Ljava/lang/RuntimeException;

    .line 140
    .line 141
    throw v1

    .line 142
    :catchall_1
    move-exception v1

    .line 143
    goto :goto_4

    .line 144
    :cond_6
    check-cast v1, Ljava/lang/Error;

    .line 145
    .line 146
    throw v1

    .line 147
    :cond_7
    check-cast v1, Lbsh/ParseException;

    .line 148
    .line 149
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 150
    :catchall_2
    move-exception v1

    .line 151
    move v3, v2

    .line 152
    :goto_4
    if-eqz v3, :cond_8

    .line 153
    .line 154
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 155
    .line 156
    invoke-virtual {v3, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 157
    .line 158
    .line 159
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 160
    .line 161
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-eqz v2, :cond_8

    .line 166
    .line 167
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 168
    .line 169
    .line 170
    :cond_8
    throw v1
.end method

.method public final ImportDeclaration()V
    .locals 8

    .line 1
    new-instance v0, Lbsh/BSHImportDeclaration;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, Lbsh/BSHImportDeclaration;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    :try_start_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_2_4(I)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/16 v4, 0x6a

    .line 23
    .line 24
    const/16 v5, 0x23

    .line 25
    .line 26
    const/4 v6, -0x1

    .line 27
    if-eqz v1, :cond_4

    .line 28
    .line 29
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 30
    .line 31
    .line 32
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 33
    .line 34
    if-ne v1, v6, :cond_0

    .line 35
    .line 36
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v1

    .line 42
    move v4, v3

    .line 43
    goto/16 :goto_5

    .line 44
    .line 45
    :cond_0
    :goto_0
    const/16 v5, 0x31

    .line 46
    .line 47
    if-eq v1, v5, :cond_1

    .line 48
    .line 49
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 50
    .line 51
    iget v5, p0, Lbsh/Parser;->jj_gen:I

    .line 52
    .line 53
    const/16 v7, 0x11

    .line 54
    .line 55
    aput v5, v1, v7

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 59
    .line 60
    .line 61
    iput-boolean v3, v0, Lbsh/BSHImportDeclaration;->staticImport:Z

    .line 62
    .line 63
    :goto_1
    invoke-virtual {p0}, Lbsh/Parser;->AmbiguousName()V

    .line 64
    .line 65
    .line 66
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 67
    .line 68
    if-ne v1, v6, :cond_2

    .line 69
    .line 70
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    :cond_2
    const/16 v5, 0x54

    .line 75
    .line 76
    if-eq v1, v5, :cond_3

    .line 77
    .line 78
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 79
    .line 80
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 81
    .line 82
    const/16 v5, 0x12

    .line 83
    .line 84
    aput v4, v1, v5

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 88
    .line 89
    .line 90
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 91
    .line 92
    .line 93
    iput-boolean v3, v0, Lbsh/BSHImportDeclaration;->importPackage:Z

    .line 94
    .line 95
    :goto_2
    invoke-virtual {p0}, Lbsh/Parser;->StatementTerminator()V

    .line 96
    .line 97
    .line 98
    move v2, v3

    .line 99
    goto :goto_4

    .line 100
    :cond_4
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 101
    .line 102
    if-ne v1, v6, :cond_5

    .line 103
    .line 104
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    :cond_5
    if-ne v1, v5, :cond_8

    .line 109
    .line 110
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 111
    .line 112
    .line 113
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Lbsh/Parser;->StatementTerminator()V

    .line 117
    .line 118
    .line 119
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 120
    .line 121
    invoke-virtual {v1, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    .line 123
    .line 124
    :try_start_1
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 125
    .line 126
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_6

    .line 131
    .line 132
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :catchall_1
    move-exception v1

    .line 137
    move v4, v2

    .line 138
    goto :goto_5

    .line 139
    :cond_6
    :goto_3
    iput-boolean v3, v0, Lbsh/BSHImportDeclaration;->superImport:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 140
    .line 141
    :goto_4
    if-eqz v2, :cond_7

    .line 142
    .line 143
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 144
    .line 145
    invoke-virtual {v1, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 146
    .line 147
    .line 148
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 149
    .line 150
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_7

    .line 155
    .line 156
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 157
    .line 158
    .line 159
    :cond_7
    return-void

    .line 160
    :cond_8
    :try_start_2
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 161
    .line 162
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 163
    .line 164
    const/16 v5, 0x13

    .line 165
    .line 166
    aput v4, v1, v5

    .line 167
    .line 168
    invoke-direct {p0, v6}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 169
    .line 170
    .line 171
    new-instance v1, Lbsh/ParseException;

    .line 172
    .line 173
    invoke-direct {v1}, Lbsh/ParseException;-><init>()V

    .line 174
    .line 175
    .line 176
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 177
    :goto_5
    iget-object v5, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 178
    .line 179
    if-eqz v4, :cond_9

    .line 180
    .line 181
    :try_start_3
    invoke-virtual {v5, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V

    .line 182
    .line 183
    .line 184
    goto :goto_6

    .line 185
    :catchall_2
    move-exception v1

    .line 186
    goto :goto_7

    .line 187
    :cond_9
    invoke-virtual {v5}, Lbsh/JJTParserState;->popNode()Lbsh/Node;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 188
    .line 189
    .line 190
    move v2, v4

    .line 191
    :goto_6
    :try_start_4
    instance-of v4, v1, Lbsh/ParseException;

    .line 192
    .line 193
    if-nez v4, :cond_b

    .line 194
    .line 195
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 196
    .line 197
    if-eqz v4, :cond_a

    .line 198
    .line 199
    check-cast v1, Ljava/lang/RuntimeException;

    .line 200
    .line 201
    throw v1

    .line 202
    :catchall_3
    move-exception v1

    .line 203
    move v4, v2

    .line 204
    goto :goto_7

    .line 205
    :cond_a
    check-cast v1, Ljava/lang/Error;

    .line 206
    .line 207
    throw v1

    .line 208
    :cond_b
    check-cast v1, Lbsh/ParseException;

    .line 209
    .line 210
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 211
    :goto_7
    if-eqz v4, :cond_c

    .line 212
    .line 213
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 214
    .line 215
    invoke-virtual {v2, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 216
    .line 217
    .line 218
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 219
    .line 220
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    if-eqz v2, :cond_c

    .line 225
    .line 226
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 227
    .line 228
    .line 229
    :cond_c
    throw v1
.end method

.method public final InclusiveOrExpression()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lbsh/Parser;->ExclusiveOrExpression()V

    .line 2
    .line 3
    .line 4
    :goto_0
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :cond_0
    const/16 v2, 0x6f

    .line 14
    .line 15
    const/16 v3, 0x6e

    .line 16
    .line 17
    if-eq v0, v3, :cond_1

    .line 18
    .line 19
    if-eq v0, v2, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 22
    .line 23
    const/16 v1, 0x2c

    .line 24
    .line 25
    iget v2, p0, Lbsh/Parser;->jj_gen:I

    .line 26
    .line 27
    aput v2, v0, v1

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 31
    .line 32
    if-ne v0, v1, :cond_2

    .line 33
    .line 34
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    :cond_2
    if-eq v0, v3, :cond_4

    .line 39
    .line 40
    if-ne v0, v2, :cond_3

    .line 41
    .line 42
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 48
    .line 49
    const/16 v2, 0x2d

    .line 50
    .line 51
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 52
    .line 53
    aput v3, v0, v2

    .line 54
    .line 55
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 56
    .line 57
    .line 58
    invoke-static {}, Lbsh/j;->a()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_4
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :goto_1
    invoke-virtual {p0}, Lbsh/Parser;->ExclusiveOrExpression()V

    .line 67
    .line 68
    .line 69
    new-instance v1, Lbsh/BSHBinaryExpression;

    .line 70
    .line 71
    const/16 v2, 0x11

    .line 72
    .line 73
    invoke-direct {v1, v2}, Lbsh/BSHBinaryExpression;-><init>(I)V

    .line 74
    .line 75
    .line 76
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 77
    .line 78
    invoke-virtual {v2, v1}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 82
    .line 83
    .line 84
    const/4 v2, 0x2

    .line 85
    const/4 v3, 0x1

    .line 86
    :try_start_0
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 87
    .line 88
    invoke-virtual {v4, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 89
    .line 90
    .line 91
    const/4 v3, 0x0

    .line 92
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 93
    .line 94
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_5

    .line 99
    .line 100
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    goto :goto_3

    .line 106
    :cond_5
    :goto_2
    iget v0, v0, Lbsh/Token;->kind:I

    .line 107
    .line 108
    iput v0, v1, Lbsh/BSHBinaryExpression;->kind:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :goto_3
    if-eqz v3, :cond_6

    .line 112
    .line 113
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 114
    .line 115
    invoke-virtual {v3, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 116
    .line 117
    .line 118
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 119
    .line 120
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_6

    .line 125
    .line 126
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 127
    .line 128
    .line 129
    :cond_6
    throw v0
.end method

.method public final InstanceOfExpression()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lbsh/Parser;->RelationalExpression()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :cond_0
    const/16 v1, 0x24

    .line 14
    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 18
    .line 19
    const/16 v1, 0x34

    .line 20
    .line 21
    iget v2, p0, Lbsh/Parser;->jj_gen:I

    .line 22
    .line 23
    aput v2, v0, v1

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p0}, Lbsh/Parser;->Type()V

    .line 31
    .line 32
    .line 33
    new-instance v1, Lbsh/BSHBinaryExpression;

    .line 34
    .line 35
    const/16 v2, 0x11

    .line 36
    .line 37
    invoke-direct {v1, v2}, Lbsh/BSHBinaryExpression;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 41
    .line 42
    invoke-virtual {v2, v1}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 46
    .line 47
    .line 48
    const/4 v2, 0x2

    .line 49
    const/4 v3, 0x1

    .line 50
    :try_start_0
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 51
    .line 52
    invoke-virtual {v4, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 53
    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 57
    .line 58
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_2

    .line 63
    .line 64
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    :goto_0
    iget v0, v0, Lbsh/Token;->kind:I

    .line 71
    .line 72
    iput v0, v1, Lbsh/BSHBinaryExpression;->kind:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    return-void

    .line 75
    :goto_1
    if-eqz v3, :cond_3

    .line 76
    .line 77
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 78
    .line 79
    invoke-virtual {v3, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 80
    .line 81
    .line 82
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 83
    .line 84
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_3

    .line 89
    .line 90
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    throw v0
.end method

.method public final LabeledStatement()V
    .locals 6

    .line 1
    new-instance v0, Lbsh/BSHLabeledStatement;

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHLabeledStatement;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x49

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x1

    .line 20
    :try_start_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/16 v4, 0x96

    .line 25
    .line 26
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lbsh/Parser;->Statement()V

    .line 30
    .line 31
    .line 32
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 33
    .line 34
    invoke-virtual {v4, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 35
    .line 36
    .line 37
    :try_start_1
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 38
    .line 39
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_0

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v1

    .line 50
    move v4, v2

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    :goto_0
    iget-object v1, v1, Lbsh/Token;->image:Ljava/lang/String;

    .line 53
    .line 54
    iput-object v1, v0, Lbsh/BSHLabeledStatement;->label:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    .line 56
    return-void

    .line 57
    :catchall_1
    move-exception v1

    .line 58
    move v4, v3

    .line 59
    :goto_1
    iget-object v5, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 60
    .line 61
    if-eqz v4, :cond_1

    .line 62
    .line 63
    :try_start_2
    invoke-virtual {v5, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :catchall_2
    move-exception v1

    .line 68
    goto :goto_3

    .line 69
    :cond_1
    invoke-virtual {v5}, Lbsh/JJTParserState;->popNode()Lbsh/Node;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 70
    .line 71
    .line 72
    move v2, v4

    .line 73
    :goto_2
    :try_start_3
    instance-of v4, v1, Lbsh/ParseException;

    .line 74
    .line 75
    if-nez v4, :cond_3

    .line 76
    .line 77
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 78
    .line 79
    if-eqz v4, :cond_2

    .line 80
    .line 81
    check-cast v1, Ljava/lang/RuntimeException;

    .line 82
    .line 83
    throw v1

    .line 84
    :catchall_3
    move-exception v1

    .line 85
    move v4, v2

    .line 86
    goto :goto_3

    .line 87
    :cond_2
    check-cast v1, Ljava/lang/Error;

    .line 88
    .line 89
    throw v1

    .line 90
    :cond_3
    check-cast v1, Lbsh/ParseException;

    .line 91
    .line 92
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 93
    :goto_3
    if-eqz v4, :cond_4

    .line 94
    .line 95
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 96
    .line 97
    invoke-virtual {v2, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 98
    .line 99
    .line 100
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 101
    .line 102
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_4

    .line 107
    .line 108
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 109
    .line 110
    .line 111
    :cond_4
    throw v1
.end method

.method public final LambdaExpression()V
    .locals 8

    .line 1
    new-instance v0, Lbsh/BSHLambdaExpression;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHLambdaExpression;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    :try_start_0
    iget v3, p0, Lbsh/Parser;->jj_ntk:I

    .line 19
    .line 20
    const/4 v4, -0x1

    .line 21
    if-ne v3, v4, :cond_0

    .line 22
    .line 23
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v3

    .line 29
    move v4, v2

    .line 30
    goto/16 :goto_4

    .line 31
    .line 32
    :cond_0
    :goto_0
    const/16 v5, 0x49

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    if-eq v3, v5, :cond_2

    .line 36
    .line 37
    const/16 v5, 0x4c

    .line 38
    .line 39
    if-ne v3, v5, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Lbsh/Parser;->FormalParameters()V

    .line 42
    .line 43
    .line 44
    move-object v3, v6

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iget-object v3, p0, Lbsh/Parser;->jj_la1:[I

    .line 47
    .line 48
    iget v5, p0, Lbsh/Parser;->jj_gen:I

    .line 49
    .line 50
    const/16 v6, 0x45

    .line 51
    .line 52
    aput v5, v3, v6

    .line 53
    .line 54
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 55
    .line 56
    .line 57
    new-instance v3, Lbsh/ParseException;

    .line 58
    .line 59
    invoke-direct {v3}, Lbsh/ParseException;-><init>()V

    .line 60
    .line 61
    .line 62
    throw v3

    .line 63
    :cond_2
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    :goto_1
    const/16 v5, 0x90

    .line 68
    .line 69
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 70
    .line 71
    .line 72
    iget v5, p0, Lbsh/Parser;->jj_ntk:I

    .line 73
    .line 74
    if-ne v5, v4, :cond_3

    .line 75
    .line 76
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    :cond_3
    const/16 v7, 0x29

    .line 81
    .line 82
    if-eq v5, v7, :cond_5

    .line 83
    .line 84
    const/16 v7, 0x2a

    .line 85
    .line 86
    if-eq v5, v7, :cond_5

    .line 87
    .line 88
    const/16 v7, 0x30

    .line 89
    .line 90
    if-eq v5, v7, :cond_5

    .line 91
    .line 92
    const/16 v7, 0x31

    .line 93
    .line 94
    if-eq v5, v7, :cond_4

    .line 95
    .line 96
    const/16 v7, 0x5a

    .line 97
    .line 98
    if-eq v5, v7, :cond_5

    .line 99
    .line 100
    const/16 v7, 0x5b

    .line 101
    .line 102
    if-eq v5, v7, :cond_5

    .line 103
    .line 104
    sparse-switch v5, :sswitch_data_0

    .line 105
    .line 106
    .line 107
    packed-switch v5, :pswitch_data_0

    .line 108
    .line 109
    .line 110
    packed-switch v5, :pswitch_data_1

    .line 111
    .line 112
    .line 113
    iget-object v3, p0, Lbsh/Parser;->jj_la1:[I

    .line 114
    .line 115
    iget v5, p0, Lbsh/Parser;->jj_gen:I

    .line 116
    .line 117
    const/16 v6, 0x46

    .line 118
    .line 119
    aput v5, v3, v6

    .line 120
    .line 121
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 122
    .line 123
    .line 124
    new-instance v3, Lbsh/ParseException;

    .line 125
    .line 126
    invoke-direct {v3}, Lbsh/ParseException;-><init>()V

    .line 127
    .line 128
    .line 129
    throw v3

    .line 130
    :cond_4
    :sswitch_0
    invoke-virtual {p0}, Lbsh/Parser;->Block()V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_5
    :pswitch_0
    :sswitch_1
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V

    .line 135
    .line 136
    .line 137
    :goto_2
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 138
    .line 139
    invoke-virtual {v4, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    .line 141
    .line 142
    :try_start_1
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 143
    .line 144
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    if-eqz v4, :cond_6

    .line 149
    .line 150
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :catchall_1
    move-exception v3

    .line 155
    move v4, v1

    .line 156
    goto :goto_4

    .line 157
    :cond_6
    :goto_3
    if-eqz v3, :cond_7

    .line 158
    .line 159
    iget-object v6, v3, Lbsh/Token;->image:Ljava/lang/String;

    .line 160
    .line 161
    :cond_7
    iput-object v6, v0, Lbsh/BSHLambdaExpression;->singleParamName:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 162
    .line 163
    return-void

    .line 164
    :goto_4
    iget-object v5, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 165
    .line 166
    if-eqz v4, :cond_8

    .line 167
    .line 168
    :try_start_2
    invoke-virtual {v5, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V

    .line 169
    .line 170
    .line 171
    goto :goto_5

    .line 172
    :catchall_2
    move-exception v1

    .line 173
    goto :goto_6

    .line 174
    :cond_8
    invoke-virtual {v5}, Lbsh/JJTParserState;->popNode()Lbsh/Node;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 175
    .line 176
    .line 177
    move v1, v4

    .line 178
    :goto_5
    :try_start_3
    instance-of v4, v3, Lbsh/ParseException;

    .line 179
    .line 180
    if-nez v4, :cond_a

    .line 181
    .line 182
    instance-of v4, v3, Ljava/lang/RuntimeException;

    .line 183
    .line 184
    if-eqz v4, :cond_9

    .line 185
    .line 186
    check-cast v3, Ljava/lang/RuntimeException;

    .line 187
    .line 188
    throw v3

    .line 189
    :catchall_3
    move-exception v3

    .line 190
    move v4, v1

    .line 191
    move-object v1, v3

    .line 192
    goto :goto_6

    .line 193
    :cond_9
    check-cast v3, Ljava/lang/Error;

    .line 194
    .line 195
    throw v3

    .line 196
    :cond_a
    check-cast v3, Lbsh/ParseException;

    .line 197
    .line 198
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 199
    :goto_6
    if-eqz v4, :cond_b

    .line 200
    .line 201
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 202
    .line 203
    invoke-virtual {v3, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 204
    .line 205
    .line 206
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 207
    .line 208
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-eqz v2, :cond_b

    .line 213
    .line 214
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 215
    .line 216
    .line 217
    :cond_b
    throw v1

    .line 218
    nop

    .line 219
    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_1
        0xf -> :sswitch_1
        0x12 -> :sswitch_1
        0x17 -> :sswitch_1
        0x1b -> :sswitch_1
        0x1e -> :sswitch_1
        0x25 -> :sswitch_1
        0x27 -> :sswitch_1
        0x38 -> :sswitch_1
        0x3a -> :sswitch_1
        0x3c -> :sswitch_1
        0x3e -> :sswitch_1
        0x43 -> :sswitch_1
        0x4c -> :sswitch_1
        0x4e -> :sswitch_0
        0x50 -> :sswitch_1
    .end sparse-switch

    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    :pswitch_data_0
    .packed-switch 0x46
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x66
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final Line()Z
    .locals 5

    .line 1
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    :cond_0
    const/4 v2, 0x1

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 15
    .line 16
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 17
    .line 18
    aput v4, v0, v3

    .line 19
    .line 20
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_2_1(I)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Lbsh/Parser;->BlockStatement()V

    .line 27
    .line 28
    .line 29
    return v3

    .line 30
    :cond_1
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lbsh/j;->a()V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    return v0

    .line 38
    :cond_2
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 39
    .line 40
    .line 41
    const-string v0, "End of File!"

    .line 42
    .line 43
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return v2
.end method

.method public final Literal()V
    .locals 9

    .line 1
    const-string v0, "Error parsing character: "

    .line 2
    .line 3
    const-string v1, "Error parsing string: "

    .line 4
    .line 5
    const-string v2, "Error parsing long string: "

    .line 6
    .line 7
    new-instance v3, Lbsh/BSHLiteral;

    .line 8
    .line 9
    const/16 v4, 0x1a

    .line 10
    .line 11
    invoke-direct {v3, v4}, Lbsh/BSHLiteral;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 15
    .line 16
    invoke-virtual {v4, v3}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v3}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 20
    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x1

    .line 24
    :try_start_0
    iget v6, p0, Lbsh/Parser;->jj_ntk:I

    .line 25
    .line 26
    const/4 v7, -0x1

    .line 27
    if-ne v6, v7, :cond_0

    .line 28
    .line 29
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    move v1, v5

    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :cond_0
    :goto_0
    const/16 v8, 0x1b

    .line 39
    .line 40
    if-eq v6, v8, :cond_e

    .line 41
    .line 42
    const/16 v8, 0x2a

    .line 43
    .line 44
    if-eq v6, v8, :cond_c

    .line 45
    .line 46
    const/16 v8, 0x38

    .line 47
    .line 48
    if-eq v6, v8, :cond_e

    .line 49
    .line 50
    const/16 v8, 0x3a

    .line 51
    .line 52
    if-eq v6, v8, :cond_a

    .line 53
    .line 54
    const/16 v8, 0x3e

    .line 55
    .line 56
    if-eq v6, v8, :cond_7

    .line 57
    .line 58
    const/16 v8, 0x43

    .line 59
    .line 60
    if-eq v6, v8, :cond_4

    .line 61
    .line 62
    packed-switch v6, :pswitch_data_0

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 66
    .line 67
    iget v1, p0, Lbsh/Parser;->jj_gen:I

    .line 68
    .line 69
    const/16 v2, 0x58

    .line 70
    .line 71
    aput v1, v0, v2

    .line 72
    .line 73
    invoke-direct {p0, v7}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 74
    .line 75
    .line 76
    new-instance v0, Lbsh/ParseException;

    .line 77
    .line 78
    invoke-direct {v0}, Lbsh/ParseException;-><init>()V

    .line 79
    .line 80
    .line 81
    throw v0

    .line 82
    :pswitch_0
    const/16 v0, 0x48

    .line 83
    .line 84
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 89
    .line 90
    invoke-virtual {v1, v3, v5}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    .line 93
    :try_start_1
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 94
    .line 95
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_1

    .line 100
    .line 101
    invoke-virtual {p0, v3}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :catchall_1
    move-exception v0

    .line 106
    move v1, v4

    .line 107
    goto/16 :goto_5

    .line 108
    .line 109
    :cond_1
    :goto_1
    :try_start_2
    iget-object v1, v0, Lbsh/Token;->image:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    const/4 v7, 0x3

    .line 116
    sub-int/2addr v6, v7

    .line 117
    invoke-virtual {v1, v7, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    iput-object v1, v3, Lbsh/BSHLiteral;->value:Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 122
    .line 123
    return-void

    .line 124
    :catch_0
    move-exception v1

    .line 125
    :try_start_3
    new-instance v6, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    iget-object v0, v0, Lbsh/Token;->image:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {p0, v0, v1}, Lbsh/Parser;->createParseException(Ljava/lang/String;Ljava/lang/Exception;)Lbsh/ParseException;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 144
    :pswitch_1
    const/16 v0, 0x47

    .line 145
    .line 146
    :try_start_4
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 151
    .line 152
    invoke-virtual {v2, v3, v5}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 153
    .line 154
    .line 155
    :try_start_5
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 156
    .line 157
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-eqz v2, :cond_2

    .line 162
    .line 163
    invoke-virtual {p0, v3}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 164
    .line 165
    .line 166
    :cond_2
    :try_start_6
    iget-object v2, v0, Lbsh/Token;->image:Ljava/lang/String;

    .line 167
    .line 168
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    sub-int/2addr v6, v5

    .line 173
    invoke-virtual {v2, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-virtual {v3, v2}, Lbsh/BSHLiteral;->stringSetup(Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :catch_1
    move-exception v2

    .line 182
    :try_start_7
    new-instance v6, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    iget-object v0, v0, Lbsh/Token;->image:Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {p0, v0, v2}, Lbsh/Parser;->createParseException(Ljava/lang/String;Ljava/lang/Exception;)Lbsh/ParseException;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 201
    :pswitch_2
    const/16 v1, 0x46

    .line 202
    .line 203
    :try_start_8
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 208
    .line 209
    invoke-virtual {v2, v3, v5}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 210
    .line 211
    .line 212
    :try_start_9
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 213
    .line 214
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    if-eqz v2, :cond_3

    .line 219
    .line 220
    invoke-virtual {p0, v3}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 221
    .line 222
    .line 223
    :cond_3
    :try_start_a
    iget-object v2, v1, Lbsh/Token;->image:Ljava/lang/String;

    .line 224
    .line 225
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 226
    .line 227
    .line 228
    move-result v6

    .line 229
    sub-int/2addr v6, v5

    .line 230
    invoke-virtual {v2, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-virtual {v3, v2}, Lbsh/BSHLiteral;->charSetup(Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    :catch_2
    move-exception v2

    .line 239
    :try_start_b
    new-instance v6, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    iget-object v0, v1, Lbsh/Token;->image:Ljava/lang/String;

    .line 245
    .line 246
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-virtual {p0, v0, v2}, Lbsh/Parser;->createParseException(Ljava/lang/String;Ljava/lang/Exception;)Lbsh/ParseException;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 258
    :cond_4
    :try_start_c
    invoke-direct {p0, v8}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 263
    .line 264
    invoke-virtual {v1, v3, v5}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 265
    .line 266
    .line 267
    :try_start_d
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 268
    .line 269
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    if-eqz v1, :cond_5

    .line 274
    .line 275
    invoke-virtual {p0, v3}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 276
    .line 277
    .line 278
    :cond_5
    iget-object v0, v0, Lbsh/Token;->image:Ljava/lang/String;

    .line 279
    .line 280
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    sub-int/2addr v1, v5

    .line 285
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 286
    .line 287
    .line 288
    move-result v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 289
    :try_start_e
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    invoke-static {v6}, Lbsh/Types$Suffix;->isFloatingPoint(Ljava/lang/Character;)Z

    .line 294
    .line 295
    .line 296
    move-result v6

    .line 297
    if-eqz v6, :cond_6

    .line 298
    .line 299
    new-instance v6, Lbsh/Primitive;

    .line 300
    .line 301
    new-instance v7, Ljava/math/BigDecimal;

    .line 302
    .line 303
    invoke-virtual {v0, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-direct {v7, v0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    invoke-direct {v6, v7}, Lbsh/Primitive;-><init>(Ljava/math/BigDecimal;)V

    .line 311
    .line 312
    .line 313
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-static {v0}, Lbsh/Types$Suffix;->getFloatingPointType(Ljava/lang/Character;)Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-virtual {v6, v0, v4}, Lbsh/Primitive;->castToType(Ljava/lang/Class;I)Lbsh/Primitive;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    iput-object v0, v3, Lbsh/BSHLiteral;->value:Ljava/lang/Object;

    .line 326
    .line 327
    return-void

    .line 328
    :catch_3
    move-exception v0

    .line 329
    goto :goto_2

    .line 330
    :cond_6
    new-instance v1, Ljava/math/BigDecimal;

    .line 331
    .line 332
    invoke-direct {v1, v0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    invoke-static {v1}, Lbsh/Primitive;->shrinkWrap(Ljava/lang/Object;)Lbsh/Primitive;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    iput-object v0, v3, Lbsh/BSHLiteral;->value:Ljava/lang/Object;
    :try_end_e
    .catch Ljava/lang/NumberFormatException; {:try_start_e .. :try_end_e} :catch_3
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 340
    .line 341
    return-void

    .line 342
    :goto_2
    :try_start_f
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    invoke-virtual {p0, v1, v0}, Lbsh/Parser;->createParseException(Ljava/lang/String;Ljava/lang/Exception;)Lbsh/ParseException;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    .line 351
    :cond_7
    :try_start_10
    invoke-direct {p0, v8}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 356
    .line 357
    invoke-virtual {v1, v3, v5}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 358
    .line 359
    .line 360
    :try_start_11
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 361
    .line 362
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 363
    .line 364
    .line 365
    move-result v1

    .line 366
    if-eqz v1, :cond_8

    .line 367
    .line 368
    invoke-virtual {p0, v3}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 369
    .line 370
    .line 371
    :cond_8
    iget-object v0, v0, Lbsh/Token;->image:Ljava/lang/String;

    .line 372
    .line 373
    const-string v1, "_"

    .line 374
    .line 375
    const-string v2, ""

    .line 376
    .line 377
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    sub-int/2addr v1, v5

    .line 386
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 387
    .line 388
    .line 389
    move-result v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    .line 390
    :try_start_12
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 391
    .line 392
    .line 393
    move-result-object v6

    .line 394
    invoke-static {v6}, Lbsh/Types$Suffix;->isIntegral(Ljava/lang/Character;)Z

    .line 395
    .line 396
    .line 397
    move-result v6

    .line 398
    if-eqz v6, :cond_9

    .line 399
    .line 400
    invoke-virtual {v0, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-virtual {p0, v0}, Lbsh/Parser;->parseIntegral(Ljava/lang/String;)Lbsh/Primitive;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    invoke-static {v1}, Lbsh/Types$Suffix;->getIntegralType(Ljava/lang/Character;)Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    move-result-object v1

    .line 416
    invoke-virtual {v0, v1, v4}, Lbsh/Primitive;->castToType(Ljava/lang/Class;I)Lbsh/Primitive;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    iput-object v0, v3, Lbsh/BSHLiteral;->value:Ljava/lang/Object;

    .line 421
    .line 422
    return-void

    .line 423
    :catch_4
    move-exception v0

    .line 424
    goto :goto_3

    .line 425
    :cond_9
    invoke-virtual {p0, v0}, Lbsh/Parser;->parseIntegral(Ljava/lang/String;)Lbsh/Primitive;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    invoke-virtual {v0}, Lbsh/Primitive;->getValue()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    invoke-static {v0}, Lbsh/Primitive;->shrinkWrap(Ljava/lang/Object;)Lbsh/Primitive;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    iput-object v0, v3, Lbsh/BSHLiteral;->value:Ljava/lang/Object;
    :try_end_12
    .catch Ljava/lang/NumberFormatException; {:try_start_12 .. :try_end_12} :catch_4
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    .line 438
    .line 439
    return-void

    .line 440
    :goto_3
    :try_start_13
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    invoke-virtual {p0, v1, v0}, Lbsh/Parser;->createParseException(Ljava/lang/String;Ljava/lang/Exception;)Lbsh/ParseException;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    throw v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_1

    .line 449
    :cond_a
    :try_start_14
    invoke-virtual {p0}, Lbsh/Parser;->VoidLiteral()V

    .line 450
    .line 451
    .line 452
    iget-object v0, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 453
    .line 454
    invoke-virtual {v0, v3, v5}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    .line 455
    .line 456
    .line 457
    :try_start_15
    iget-object v0, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 458
    .line 459
    invoke-virtual {v0}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    if-eqz v0, :cond_b

    .line 464
    .line 465
    invoke-virtual {p0, v3}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 466
    .line 467
    .line 468
    :cond_b
    sget-object v0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 469
    .line 470
    iput-object v0, v3, Lbsh/BSHLiteral;->value:Ljava/lang/Object;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_1

    .line 471
    .line 472
    return-void

    .line 473
    :cond_c
    :try_start_16
    invoke-virtual {p0}, Lbsh/Parser;->NullLiteral()V

    .line 474
    .line 475
    .line 476
    iget-object v0, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 477
    .line 478
    invoke-virtual {v0, v3, v5}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    .line 479
    .line 480
    .line 481
    :try_start_17
    iget-object v0, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 482
    .line 483
    invoke-virtual {v0}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 484
    .line 485
    .line 486
    move-result v0

    .line 487
    if-eqz v0, :cond_d

    .line 488
    .line 489
    invoke-virtual {p0, v3}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 490
    .line 491
    .line 492
    :cond_d
    sget-object v0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 493
    .line 494
    iput-object v0, v3, Lbsh/BSHLiteral;->value:Ljava/lang/Object;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_1

    .line 495
    .line 496
    return-void

    .line 497
    :cond_e
    :try_start_18
    invoke-virtual {p0}, Lbsh/Parser;->BooleanLiteral()Z

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 502
    .line 503
    invoke-virtual {v1, v3, v5}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_0

    .line 504
    .line 505
    .line 506
    :try_start_19
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 507
    .line 508
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 509
    .line 510
    .line 511
    move-result v1

    .line 512
    if-eqz v1, :cond_f

    .line 513
    .line 514
    invoke-virtual {p0, v3}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 515
    .line 516
    .line 517
    :cond_f
    if-eqz v0, :cond_10

    .line 518
    .line 519
    sget-object v0, Lbsh/Primitive;->TRUE:Lbsh/Primitive;

    .line 520
    .line 521
    goto :goto_4

    .line 522
    :cond_10
    sget-object v0, Lbsh/Primitive;->FALSE:Lbsh/Primitive;

    .line 523
    .line 524
    :goto_4
    iput-object v0, v3, Lbsh/BSHLiteral;->value:Ljava/lang/Object;
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_1

    .line 525
    .line 526
    return-void

    .line 527
    :goto_5
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 528
    .line 529
    if-eqz v1, :cond_11

    .line 530
    .line 531
    :try_start_1a
    invoke-virtual {v2, v3}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V

    .line 532
    .line 533
    .line 534
    goto :goto_6

    .line 535
    :catchall_2
    move-exception v0

    .line 536
    goto :goto_7

    .line 537
    :cond_11
    invoke-virtual {v2}, Lbsh/JJTParserState;->popNode()Lbsh/Node;
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_2

    .line 538
    .line 539
    .line 540
    move v4, v1

    .line 541
    :goto_6
    :try_start_1b
    instance-of v1, v0, Lbsh/ParseException;

    .line 542
    .line 543
    if-nez v1, :cond_13

    .line 544
    .line 545
    instance-of v1, v0, Ljava/lang/RuntimeException;

    .line 546
    .line 547
    if-eqz v1, :cond_12

    .line 548
    .line 549
    check-cast v0, Ljava/lang/RuntimeException;

    .line 550
    .line 551
    throw v0

    .line 552
    :catchall_3
    move-exception v0

    .line 553
    move v1, v4

    .line 554
    goto :goto_7

    .line 555
    :cond_12
    check-cast v0, Ljava/lang/Error;

    .line 556
    .line 557
    throw v0

    .line 558
    :cond_13
    check-cast v0, Lbsh/ParseException;

    .line 559
    .line 560
    throw v0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_3

    .line 561
    :goto_7
    if-eqz v1, :cond_14

    .line 562
    .line 563
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 564
    .line 565
    invoke-virtual {v1, v3, v5}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 566
    .line 567
    .line 568
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 569
    .line 570
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 571
    .line 572
    .line 573
    move-result v1

    .line 574
    if-eqz v1, :cond_14

    .line 575
    .line 576
    invoke-virtual {p0, v3}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 577
    .line 578
    .line 579
    :cond_14
    throw v0

    .line 580
    nop

    .line 581
    :pswitch_data_0
    .packed-switch 0x46
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final MethodDeclTerminator()V
    .locals 4

    .line 1
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    :cond_0
    const/16 v2, 0x52

    .line 11
    .line 12
    if-eq v0, v2, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 15
    .line 16
    const/16 v2, 0x65

    .line 17
    .line 18
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 19
    .line 20
    aput v3, v0, v2

    .line 21
    .line 22
    invoke-virtual {p0}, Lbsh/Parser;->isImplicitMethodTerminator()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lbsh/j;->a()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final MethodDeclaration()V
    .locals 7

    .line 1
    new-instance v0, Lbsh/BSHMethodDeclaration;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lbsh/BSHMethodDeclaration;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    :try_start_0
    invoke-virtual {p0, v1, v2}, Lbsh/Parser;->Modifiers(IZ)Lbsh/Modifiers;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    iput-object v1, v0, Lbsh/BSHMethodDeclaration;->modifiers:Lbsh/Modifiers;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :cond_0
    :goto_0
    const v1, 0x7fffffff

    .line 31
    .line 32
    .line 33
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_2_3(I)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/16 v4, 0xf

    .line 38
    .line 39
    const/4 v5, -0x1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    invoke-virtual {p0}, Lbsh/Parser;->ReturnType()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lbsh/Parser;->ExtensionName()V

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 50
    .line 51
    if-ne v1, v5, :cond_2

    .line 52
    .line 53
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    :cond_2
    const/16 v6, 0xc

    .line 58
    .line 59
    if-eq v1, v6, :cond_4

    .line 60
    .line 61
    if-eq v1, v4, :cond_4

    .line 62
    .line 63
    const/16 v6, 0x12

    .line 64
    .line 65
    if-eq v1, v6, :cond_4

    .line 66
    .line 67
    const/16 v6, 0x17

    .line 68
    .line 69
    if-eq v1, v6, :cond_4

    .line 70
    .line 71
    const/16 v6, 0x1e

    .line 72
    .line 73
    if-eq v1, v6, :cond_4

    .line 74
    .line 75
    const/16 v6, 0x25

    .line 76
    .line 77
    if-eq v1, v6, :cond_4

    .line 78
    .line 79
    const/16 v6, 0x27

    .line 80
    .line 81
    if-eq v1, v6, :cond_4

    .line 82
    .line 83
    const/16 v6, 0x30

    .line 84
    .line 85
    if-eq v1, v6, :cond_4

    .line 86
    .line 87
    const/16 v6, 0x49

    .line 88
    .line 89
    if-ne v1, v6, :cond_3

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 93
    .line 94
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 95
    .line 96
    const/16 v6, 0xe

    .line 97
    .line 98
    aput v4, v1, v6

    .line 99
    .line 100
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 101
    .line 102
    .line 103
    new-instance v1, Lbsh/ParseException;

    .line 104
    .line 105
    invoke-direct {v1}, Lbsh/ParseException;-><init>()V

    .line 106
    .line 107
    .line 108
    throw v1

    .line 109
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lbsh/Parser;->ExtensionName()V

    .line 110
    .line 111
    .line 112
    :goto_2
    invoke-virtual {p0}, Lbsh/Parser;->FormalParameters()V

    .line 113
    .line 114
    .line 115
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 116
    .line 117
    if-ne v1, v5, :cond_5

    .line 118
    .line 119
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    :cond_5
    const/16 v6, 0x37

    .line 124
    .line 125
    if-eq v1, v6, :cond_6

    .line 126
    .line 127
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 128
    .line 129
    iget v6, p0, Lbsh/Parser;->jj_gen:I

    .line 130
    .line 131
    aput v6, v1, v4

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_6
    invoke-direct {p0, v6}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Lbsh/Parser;->NameList()I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    iput v1, v0, Lbsh/BSHMethodDeclaration;->numThrows:I

    .line 142
    .line 143
    :goto_3
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 144
    .line 145
    if-ne v1, v5, :cond_7

    .line 146
    .line 147
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    :cond_7
    const/16 v4, 0x31

    .line 152
    .line 153
    if-eq v1, v4, :cond_8

    .line 154
    .line 155
    const/16 v4, 0x4e

    .line 156
    .line 157
    if-eq v1, v4, :cond_8

    .line 158
    .line 159
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 160
    .line 161
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 162
    .line 163
    const/16 v5, 0x10

    .line 164
    .line 165
    aput v4, v1, v5

    .line 166
    .line 167
    invoke-virtual {p0}, Lbsh/Parser;->MethodDeclTerminator()V

    .line 168
    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_8
    invoke-virtual {p0}, Lbsh/Parser;->Block()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 172
    .line 173
    .line 174
    :goto_4
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 175
    .line 176
    invoke-virtual {v1, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 177
    .line 178
    .line 179
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 180
    .line 181
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-eqz v1, :cond_9

    .line 186
    .line 187
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 188
    .line 189
    .line 190
    :cond_9
    return-void

    .line 191
    :goto_5
    :try_start_1
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 192
    .line 193
    invoke-virtual {v4, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 194
    .line 195
    .line 196
    :try_start_2
    instance-of v4, v1, Lbsh/ParseException;

    .line 197
    .line 198
    if-nez v4, :cond_b

    .line 199
    .line 200
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 201
    .line 202
    if-eqz v4, :cond_a

    .line 203
    .line 204
    check-cast v1, Ljava/lang/RuntimeException;

    .line 205
    .line 206
    throw v1

    .line 207
    :catchall_1
    move-exception v1

    .line 208
    goto :goto_6

    .line 209
    :cond_a
    check-cast v1, Ljava/lang/Error;

    .line 210
    .line 211
    throw v1

    .line 212
    :cond_b
    check-cast v1, Lbsh/ParseException;

    .line 213
    .line 214
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 215
    :catchall_2
    move-exception v1

    .line 216
    move v2, v3

    .line 217
    :goto_6
    if-eqz v2, :cond_c

    .line 218
    .line 219
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 220
    .line 221
    invoke-virtual {v2, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 222
    .line 223
    .line 224
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 225
    .line 226
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    if-eqz v2, :cond_c

    .line 231
    .line 232
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 233
    .line 234
    .line 235
    :cond_c
    throw v1
.end method

.method public final MethodInvocation()V
    .locals 5

    .line 1
    new-instance v0, Lbsh/BSHMethodInvocation;

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHMethodInvocation;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    :try_start_0
    invoke-virtual {p0}, Lbsh/Parser;->AmbiguousName()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lbsh/Parser;->Arguments()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 24
    .line 25
    invoke-virtual {v2, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 29
    .line 30
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void

    .line 40
    :catchall_0
    move-exception v2

    .line 41
    :try_start_1
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 42
    .line 43
    invoke-virtual {v3, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 44
    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    :try_start_2
    instance-of v4, v2, Lbsh/ParseException;

    .line 48
    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    instance-of v4, v2, Ljava/lang/RuntimeException;

    .line 52
    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    check-cast v2, Ljava/lang/RuntimeException;

    .line 56
    .line 57
    throw v2

    .line 58
    :catchall_1
    move-exception v2

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    check-cast v2, Ljava/lang/Error;

    .line 61
    .line 62
    throw v2

    .line 63
    :cond_2
    check-cast v2, Lbsh/ParseException;

    .line 64
    .line 65
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 66
    :catchall_2
    move-exception v2

    .line 67
    move v3, v1

    .line 68
    :goto_0
    if-eqz v3, :cond_3

    .line 69
    .line 70
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 71
    .line 72
    invoke-virtual {v3, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 76
    .line 77
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_3

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 84
    .line 85
    .line 86
    :cond_3
    throw v2
.end method

.method public final Modifiers(IZ)Lbsh/Modifiers;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    :cond_0
    :goto_0
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 3
    .line 4
    const/4 v2, -0x1

    .line 5
    if-ne v1, v2, :cond_1

    .line 6
    .line 7
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    :cond_1
    const/16 v3, 0x35

    .line 12
    .line 13
    const/16 v4, 0x34

    .line 14
    .line 15
    const/16 v5, 0x32

    .line 16
    .line 17
    const/16 v6, 0x31

    .line 18
    .line 19
    const/16 v7, 0x3b

    .line 20
    .line 21
    const/16 v8, 0x28

    .line 22
    .line 23
    const/16 v9, 0x1c

    .line 24
    .line 25
    const/16 v10, 0x15

    .line 26
    .line 27
    const/16 v11, 0xb

    .line 28
    .line 29
    if-eq v1, v11, :cond_2

    .line 30
    .line 31
    if-eq v1, v10, :cond_2

    .line 32
    .line 33
    if-eq v1, v9, :cond_2

    .line 34
    .line 35
    if-eq v1, v8, :cond_2

    .line 36
    .line 37
    if-eq v1, v7, :cond_2

    .line 38
    .line 39
    if-eq v1, v6, :cond_2

    .line 40
    .line 41
    if-eq v1, v5, :cond_2

    .line 42
    .line 43
    if-eq v1, v4, :cond_2

    .line 44
    .line 45
    if-eq v1, v3, :cond_2

    .line 46
    .line 47
    packed-switch v1, :pswitch_data_0

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lbsh/Parser;->jj_la1:[I

    .line 51
    .line 52
    const/4 p2, 0x1

    .line 53
    iget v1, p0, Lbsh/Parser;->jj_gen:I

    .line 54
    .line 55
    aput v1, p1, p2

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_2
    :pswitch_0
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 59
    .line 60
    if-ne v1, v2, :cond_3

    .line 61
    .line 62
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    :cond_3
    if-eq v1, v11, :cond_c

    .line 67
    .line 68
    if-eq v1, v10, :cond_b

    .line 69
    .line 70
    if-eq v1, v9, :cond_a

    .line 71
    .line 72
    if-eq v1, v8, :cond_9

    .line 73
    .line 74
    if-eq v1, v7, :cond_8

    .line 75
    .line 76
    if-eq v1, v6, :cond_7

    .line 77
    .line 78
    if-eq v1, v5, :cond_6

    .line 79
    .line 80
    if-eq v1, v4, :cond_5

    .line 81
    .line 82
    if-eq v1, v3, :cond_4

    .line 83
    .line 84
    packed-switch v1, :pswitch_data_1

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Lbsh/Parser;->jj_la1:[I

    .line 88
    .line 89
    const/4 p2, 0x2

    .line 90
    iget v0, p0, Lbsh/Parser;->jj_gen:I

    .line 91
    .line 92
    aput v0, p1, p2

    .line 93
    .line 94
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 95
    .line 96
    .line 97
    invoke-static {}, Lbsh/j;->a()V

    .line 98
    .line 99
    .line 100
    const/4 p1, 0x0

    .line 101
    return-object p1

    .line 102
    :pswitch_1
    const/16 v1, 0x2e

    .line 103
    .line 104
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :pswitch_2
    const/16 v1, 0x2d

    .line 109
    .line 110
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :pswitch_3
    const/16 v1, 0x2c

    .line 115
    .line 116
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_5
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_6
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_7
    invoke-direct {p0, v6}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_8
    invoke-direct {p0, v7}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_9
    invoke-direct {p0, v8}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_a
    invoke-direct {p0, v9}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_b
    invoke-direct {p0, v10}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_c
    invoke-direct {p0, v11}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 153
    .line 154
    .line 155
    :goto_1
    if-nez p2, :cond_0

    .line 156
    .line 157
    if-nez v0, :cond_d

    .line 158
    .line 159
    :try_start_0
    new-instance v0, Lbsh/Modifiers;

    .line 160
    .line 161
    invoke-direct {v0, p1}, Lbsh/Modifiers;-><init>(I)V

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :catch_0
    move-exception p1

    .line 166
    goto :goto_3

    .line 167
    :cond_d
    :goto_2
    const/4 v1, 0x0

    .line 168
    invoke-virtual {p0, v1}, Lbsh/Parser;->getToken(I)Lbsh/Token;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    iget-object v1, v1, Lbsh/Token;->image:Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {v0, v1}, Lbsh/Modifiers;->addModifier(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 175
    .line 176
    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    invoke-virtual {p0, p2, p1}, Lbsh/Parser;->createParseException(Ljava/lang/String;Ljava/lang/Exception;)Lbsh/ParseException;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    throw p1

    .line 188
    nop

    .line 189
    :pswitch_data_0
    .packed-switch 0x2c
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    :pswitch_data_1
    .packed-switch 0x2c
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final MultiCatch()V
    .locals 8

    .line 1
    new-instance v0, Lbsh/BSHMultiCatch;

    .line 2
    .line 3
    const/16 v1, 0x2a

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHMultiCatch;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    :try_start_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_2_40(I)Z

    .line 20
    .line 21
    .line 22
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    iget v4, p0, Lbsh/Parser;->jj_ntk:I

    .line 24
    .line 25
    const/16 v5, 0x49

    .line 26
    .line 27
    const/4 v6, -0x1

    .line 28
    if-eqz v1, :cond_5

    .line 29
    .line 30
    if-ne v4, v6, :cond_0

    .line 31
    .line 32
    :try_start_1
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    move v4, v3

    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_0
    :goto_0
    const/16 v1, 0x1c

    .line 42
    .line 43
    if-eq v4, v1, :cond_1

    .line 44
    .line 45
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 46
    .line 47
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 48
    .line 49
    const/16 v7, 0x76

    .line 50
    .line 51
    aput v4, v1, v7

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 55
    .line 56
    .line 57
    iput-boolean v3, v0, Lbsh/BSHMultiCatch;->isFinal:Z

    .line 58
    .line 59
    :goto_1
    invoke-virtual {p0}, Lbsh/Parser;->Type()V

    .line 60
    .line 61
    .line 62
    :goto_2
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 63
    .line 64
    if-ne v1, v6, :cond_2

    .line 65
    .line 66
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    :cond_2
    const/16 v4, 0x6e

    .line 71
    .line 72
    if-eq v1, v4, :cond_4

    .line 73
    .line 74
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 75
    .line 76
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 77
    .line 78
    const/16 v6, 0x77

    .line 79
    .line 80
    aput v4, v1, v6

    .line 81
    .line 82
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 87
    .line 88
    invoke-virtual {v4, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    .line 90
    .line 91
    :try_start_2
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 92
    .line 93
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-eqz v4, :cond_3

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :catchall_1
    move-exception v1

    .line 104
    move v4, v2

    .line 105
    goto :goto_4

    .line 106
    :cond_3
    :goto_3
    iget-object v1, v1, Lbsh/Token;->image:Ljava/lang/String;

    .line 107
    .line 108
    iput-object v1, v0, Lbsh/BSHMultiCatch;->name:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 109
    .line 110
    return-void

    .line 111
    :cond_4
    :try_start_3
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Lbsh/Parser;->Type()V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_5
    if-ne v4, v6, :cond_6

    .line 119
    .line 120
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    :cond_6
    if-ne v4, v5, :cond_8

    .line 125
    .line 126
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 131
    .line 132
    invoke-virtual {v4, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 133
    .line 134
    .line 135
    :try_start_4
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 136
    .line 137
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    if-eqz v4, :cond_7

    .line 142
    .line 143
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 144
    .line 145
    .line 146
    :cond_7
    iget-object v1, v1, Lbsh/Token;->image:Ljava/lang/String;

    .line 147
    .line 148
    iput-object v1, v0, Lbsh/BSHMultiCatch;->name:Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 149
    .line 150
    return-void

    .line 151
    :cond_8
    :try_start_5
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 152
    .line 153
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 154
    .line 155
    const/16 v5, 0x78

    .line 156
    .line 157
    aput v4, v1, v5

    .line 158
    .line 159
    invoke-direct {p0, v6}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 160
    .line 161
    .line 162
    new-instance v1, Lbsh/ParseException;

    .line 163
    .line 164
    invoke-direct {v1}, Lbsh/ParseException;-><init>()V

    .line 165
    .line 166
    .line 167
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 168
    :goto_4
    iget-object v5, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 169
    .line 170
    if-eqz v4, :cond_9

    .line 171
    .line 172
    :try_start_6
    invoke-virtual {v5, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V

    .line 173
    .line 174
    .line 175
    goto :goto_5

    .line 176
    :catchall_2
    move-exception v1

    .line 177
    goto :goto_6

    .line 178
    :cond_9
    invoke-virtual {v5}, Lbsh/JJTParserState;->popNode()Lbsh/Node;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 179
    .line 180
    .line 181
    move v2, v4

    .line 182
    :goto_5
    :try_start_7
    instance-of v4, v1, Lbsh/ParseException;

    .line 183
    .line 184
    if-nez v4, :cond_b

    .line 185
    .line 186
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 187
    .line 188
    if-eqz v4, :cond_a

    .line 189
    .line 190
    check-cast v1, Ljava/lang/RuntimeException;

    .line 191
    .line 192
    throw v1

    .line 193
    :catchall_3
    move-exception v1

    .line 194
    move v4, v2

    .line 195
    goto :goto_6

    .line 196
    :cond_a
    check-cast v1, Ljava/lang/Error;

    .line 197
    .line 198
    throw v1

    .line 199
    :cond_b
    check-cast v1, Lbsh/ParseException;

    .line 200
    .line 201
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 202
    :goto_6
    if-eqz v4, :cond_c

    .line 203
    .line 204
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 205
    .line 206
    invoke-virtual {v2, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 207
    .line 208
    .line 209
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 210
    .line 211
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    if-eqz v2, :cond_c

    .line 216
    .line 217
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 218
    .line 219
    .line 220
    :cond_c
    throw v1
.end method

.method public final MultiplicativeExpression()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lbsh/Parser;->PowerExpression()V

    .line 2
    .line 3
    .line 4
    :goto_0
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :cond_0
    const/16 v2, 0x73

    .line 14
    .line 15
    const/16 v3, 0x72

    .line 16
    .line 17
    const/16 v4, 0x6b

    .line 18
    .line 19
    const/16 v5, 0x6a

    .line 20
    .line 21
    if-eq v0, v5, :cond_1

    .line 22
    .line 23
    if-eq v0, v4, :cond_1

    .line 24
    .line 25
    if-eq v0, v3, :cond_1

    .line 26
    .line 27
    if-eq v0, v2, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 30
    .line 31
    const/16 v1, 0x3b

    .line 32
    .line 33
    iget v2, p0, Lbsh/Parser;->jj_gen:I

    .line 34
    .line 35
    aput v2, v0, v1

    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 39
    .line 40
    if-ne v0, v1, :cond_2

    .line 41
    .line 42
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    :cond_2
    if-eq v0, v5, :cond_6

    .line 47
    .line 48
    if-eq v0, v4, :cond_5

    .line 49
    .line 50
    if-eq v0, v3, :cond_4

    .line 51
    .line 52
    if-ne v0, v2, :cond_3

    .line 53
    .line 54
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    goto :goto_1

    .line 59
    :cond_3
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 60
    .line 61
    const/16 v2, 0x3c

    .line 62
    .line 63
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 64
    .line 65
    aput v3, v0, v2

    .line 66
    .line 67
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 68
    .line 69
    .line 70
    invoke-static {}, Lbsh/j;->a()V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_4
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    goto :goto_1

    .line 79
    :cond_5
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    goto :goto_1

    .line 84
    :cond_6
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    :goto_1
    invoke-virtual {p0}, Lbsh/Parser;->PowerExpression()V

    .line 89
    .line 90
    .line 91
    new-instance v1, Lbsh/BSHBinaryExpression;

    .line 92
    .line 93
    const/16 v2, 0x11

    .line 94
    .line 95
    invoke-direct {v1, v2}, Lbsh/BSHBinaryExpression;-><init>(I)V

    .line 96
    .line 97
    .line 98
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 99
    .line 100
    invoke-virtual {v2, v1}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 104
    .line 105
    .line 106
    const/4 v2, 0x2

    .line 107
    const/4 v3, 0x1

    .line 108
    :try_start_0
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 109
    .line 110
    invoke-virtual {v4, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 111
    .line 112
    .line 113
    const/4 v3, 0x0

    .line 114
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 115
    .line 116
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-eqz v4, :cond_7

    .line 121
    .line 122
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :catchall_0
    move-exception v0

    .line 127
    goto :goto_3

    .line 128
    :cond_7
    :goto_2
    iget v0, v0, Lbsh/Token;->kind:I

    .line 129
    .line 130
    iput v0, v1, Lbsh/BSHBinaryExpression;->kind:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    .line 132
    goto/16 :goto_0

    .line 133
    .line 134
    :goto_3
    if-eqz v3, :cond_8

    .line 135
    .line 136
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 137
    .line 138
    invoke-virtual {v3, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 139
    .line 140
    .line 141
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 142
    .line 143
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-eqz v2, :cond_8

    .line 148
    .line 149
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 150
    .line 151
    .line 152
    :cond_8
    throw v0
.end method

.method public final NameList()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lbsh/Parser;->AmbiguousName()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    :goto_0
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    :cond_0
    const/16 v2, 0x53

    .line 15
    .line 16
    if-eq v1, v2, :cond_1

    .line 17
    .line 18
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 19
    .line 20
    const/16 v2, 0x22

    .line 21
    .line 22
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 23
    .line 24
    aput v3, v1, v2

    .line 25
    .line 26
    return v0

    .line 27
    :cond_1
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lbsh/Parser;->AmbiguousName()V

    .line 31
    .line 32
    .line 33
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    goto :goto_0
.end method

.method public final NullCoalesceElvisSpaceShipExpression()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lbsh/Parser;->ConditionalOrExpression()V

    .line 2
    .line 3
    .line 4
    :goto_0
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :cond_0
    const/16 v2, 0x94

    .line 14
    .line 15
    const/16 v3, 0x93

    .line 16
    .line 17
    const/16 v4, 0x91

    .line 18
    .line 19
    if-eq v0, v4, :cond_1

    .line 20
    .line 21
    if-eq v0, v3, :cond_1

    .line 22
    .line 23
    if-eq v0, v2, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 26
    .line 27
    const/16 v1, 0x26

    .line 28
    .line 29
    iget v2, p0, Lbsh/Parser;->jj_gen:I

    .line 30
    .line 31
    aput v2, v0, v1

    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 35
    .line 36
    if-ne v0, v1, :cond_2

    .line 37
    .line 38
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    :cond_2
    if-eq v0, v4, :cond_5

    .line 43
    .line 44
    if-eq v0, v3, :cond_4

    .line 45
    .line 46
    if-ne v0, v2, :cond_3

    .line 47
    .line 48
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    goto :goto_1

    .line 53
    :cond_3
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 54
    .line 55
    const/16 v2, 0x27

    .line 56
    .line 57
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 58
    .line 59
    aput v3, v0, v2

    .line 60
    .line 61
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lbsh/j;->a()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_4
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    goto :goto_1

    .line 73
    :cond_5
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :goto_1
    invoke-virtual {p0}, Lbsh/Parser;->ConditionalOrExpression()V

    .line 78
    .line 79
    .line 80
    new-instance v1, Lbsh/BSHBinaryExpression;

    .line 81
    .line 82
    const/16 v2, 0x11

    .line 83
    .line 84
    invoke-direct {v1, v2}, Lbsh/BSHBinaryExpression;-><init>(I)V

    .line 85
    .line 86
    .line 87
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 88
    .line 89
    invoke-virtual {v2, v1}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 93
    .line 94
    .line 95
    const/4 v2, 0x2

    .line 96
    const/4 v3, 0x1

    .line 97
    :try_start_0
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 98
    .line 99
    invoke-virtual {v4, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 100
    .line 101
    .line 102
    const/4 v3, 0x0

    .line 103
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 104
    .line 105
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_6

    .line 110
    .line 111
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :catchall_0
    move-exception v0

    .line 116
    goto :goto_3

    .line 117
    :cond_6
    :goto_2
    iget v0, v0, Lbsh/Token;->kind:I

    .line 118
    .line 119
    iput v0, v1, Lbsh/BSHBinaryExpression;->kind:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :goto_3
    if-eqz v3, :cond_7

    .line 123
    .line 124
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 125
    .line 126
    invoke-virtual {v3, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 127
    .line 128
    .line 129
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 130
    .line 131
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_7

    .line 136
    .line 137
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 138
    .line 139
    .line 140
    :cond_7
    throw v0
.end method

.method public final NullLiteral()V
    .locals 1

    .line 1
    const/16 v0, 0x2a

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final PackageDeclaration()V
    .locals 5

    .line 1
    new-instance v0, Lbsh/BSHPackageDeclaration;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Lbsh/BSHPackageDeclaration;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x2b

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    :try_start_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lbsh/Parser;->AmbiguousName()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 25
    .line 26
    invoke-virtual {v1, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 30
    .line 31
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void

    .line 41
    :catchall_0
    move-exception v1

    .line 42
    :try_start_1
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 43
    .line 44
    invoke-virtual {v3, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 45
    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    :try_start_2
    instance-of v4, v1, Lbsh/ParseException;

    .line 49
    .line 50
    if-nez v4, :cond_2

    .line 51
    .line 52
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 53
    .line 54
    if-eqz v4, :cond_1

    .line 55
    .line 56
    check-cast v1, Ljava/lang/RuntimeException;

    .line 57
    .line 58
    throw v1

    .line 59
    :catchall_1
    move-exception v1

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    check-cast v1, Ljava/lang/Error;

    .line 62
    .line 63
    throw v1

    .line 64
    :cond_2
    check-cast v1, Lbsh/ParseException;

    .line 65
    .line 66
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 67
    :catchall_2
    move-exception v1

    .line 68
    move v3, v2

    .line 69
    :goto_0
    if-eqz v3, :cond_3

    .line 70
    .line 71
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 72
    .line 73
    invoke-virtual {v3, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 74
    .line 75
    .line 76
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 77
    .line 78
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_3

    .line 83
    .line 84
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 85
    .line 86
    .line 87
    :cond_3
    throw v1
.end method

.method public final PowerExpression()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lbsh/Parser;->UnaryExpression()V

    .line 2
    .line 3
    .line 4
    :goto_0
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :cond_0
    const/16 v2, 0x75

    .line 14
    .line 15
    const/16 v3, 0x74

    .line 16
    .line 17
    if-eq v0, v3, :cond_1

    .line 18
    .line 19
    if-eq v0, v2, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 22
    .line 23
    const/16 v1, 0x3d

    .line 24
    .line 25
    iget v2, p0, Lbsh/Parser;->jj_gen:I

    .line 26
    .line 27
    aput v2, v0, v1

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 31
    .line 32
    if-ne v0, v1, :cond_2

    .line 33
    .line 34
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    :cond_2
    if-eq v0, v3, :cond_4

    .line 39
    .line 40
    if-ne v0, v2, :cond_3

    .line 41
    .line 42
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 48
    .line 49
    const/16 v2, 0x3e

    .line 50
    .line 51
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 52
    .line 53
    aput v3, v0, v2

    .line 54
    .line 55
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 56
    .line 57
    .line 58
    invoke-static {}, Lbsh/j;->a()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_4
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :goto_1
    invoke-virtual {p0}, Lbsh/Parser;->UnaryExpression()V

    .line 67
    .line 68
    .line 69
    new-instance v1, Lbsh/BSHBinaryExpression;

    .line 70
    .line 71
    const/16 v2, 0x11

    .line 72
    .line 73
    invoke-direct {v1, v2}, Lbsh/BSHBinaryExpression;-><init>(I)V

    .line 74
    .line 75
    .line 76
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 77
    .line 78
    invoke-virtual {v2, v1}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 82
    .line 83
    .line 84
    const/4 v2, 0x2

    .line 85
    const/4 v3, 0x1

    .line 86
    :try_start_0
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 87
    .line 88
    invoke-virtual {v4, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 89
    .line 90
    .line 91
    const/4 v3, 0x0

    .line 92
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 93
    .line 94
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_5

    .line 99
    .line 100
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    goto :goto_3

    .line 106
    :cond_5
    :goto_2
    iget v0, v0, Lbsh/Token;->kind:I

    .line 107
    .line 108
    iput v0, v1, Lbsh/BSHBinaryExpression;->kind:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :goto_3
    if-eqz v3, :cond_6

    .line 112
    .line 113
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 114
    .line 115
    invoke-virtual {v3, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 116
    .line 117
    .line 118
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 119
    .line 120
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_6

    .line 125
    .line 126
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 127
    .line 128
    .line 129
    :cond_6
    throw v0
.end method

.method public final PrimaryExpression()V
    .locals 5

    .line 1
    new-instance v0, Lbsh/BSHPrimaryExpression;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHPrimaryExpression;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    :try_start_0
    invoke-virtual {p0}, Lbsh/Parser;->PrimaryPrefix()V

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_2_15(I)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Lbsh/Parser;->PrimarySuffix()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v2

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 33
    .line 34
    invoke-virtual {v2, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 38
    .line 39
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void

    .line 49
    :goto_1
    :try_start_1
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 50
    .line 51
    invoke-virtual {v3, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 52
    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    :try_start_2
    instance-of v4, v2, Lbsh/ParseException;

    .line 56
    .line 57
    if-nez v4, :cond_3

    .line 58
    .line 59
    instance-of v4, v2, Ljava/lang/RuntimeException;

    .line 60
    .line 61
    if-eqz v4, :cond_2

    .line 62
    .line 63
    check-cast v2, Ljava/lang/RuntimeException;

    .line 64
    .line 65
    throw v2

    .line 66
    :catchall_1
    move-exception v2

    .line 67
    goto :goto_2

    .line 68
    :cond_2
    check-cast v2, Ljava/lang/Error;

    .line 69
    .line 70
    throw v2

    .line 71
    :cond_3
    check-cast v2, Lbsh/ParseException;

    .line 72
    .line 73
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 74
    :catchall_2
    move-exception v2

    .line 75
    move v3, v1

    .line 76
    :goto_2
    if-eqz v3, :cond_4

    .line 77
    .line 78
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 79
    .line 80
    invoke-virtual {v3, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 84
    .line 85
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_4

    .line 90
    .line 91
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 92
    .line 93
    .line 94
    :cond_4
    throw v2
.end method

.method public final PrimaryPrefix()V
    .locals 4

    .line 1
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    :cond_0
    const/16 v2, 0x1b

    .line 11
    .line 12
    if-eq v0, v2, :cond_8

    .line 13
    .line 14
    const/16 v2, 0x38

    .line 15
    .line 16
    if-eq v0, v2, :cond_8

    .line 17
    .line 18
    const/16 v2, 0x3a

    .line 19
    .line 20
    if-eq v0, v2, :cond_8

    .line 21
    .line 22
    const/16 v2, 0x3c

    .line 23
    .line 24
    if-eq v0, v2, :cond_7

    .line 25
    .line 26
    const/16 v2, 0x3e

    .line 27
    .line 28
    if-eq v0, v2, :cond_8

    .line 29
    .line 30
    const/16 v2, 0x43

    .line 31
    .line 32
    if-eq v0, v2, :cond_8

    .line 33
    .line 34
    const/16 v2, 0x4c

    .line 35
    .line 36
    if-eq v0, v2, :cond_6

    .line 37
    .line 38
    const/16 v2, 0x4e

    .line 39
    .line 40
    if-eq v0, v2, :cond_5

    .line 41
    .line 42
    const/16 v2, 0x50

    .line 43
    .line 44
    if-eq v0, v2, :cond_5

    .line 45
    .line 46
    const/16 v2, 0x29

    .line 47
    .line 48
    if-eq v0, v2, :cond_5

    .line 49
    .line 50
    const/16 v2, 0x2a

    .line 51
    .line 52
    if-eq v0, v2, :cond_8

    .line 53
    .line 54
    packed-switch v0, :pswitch_data_0

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 58
    .line 59
    const/16 v2, 0x4a

    .line 60
    .line 61
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 62
    .line 63
    aput v3, v0, v2

    .line 64
    .line 65
    const v0, 0x7fffffff

    .line 66
    .line 67
    .line 68
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_2_16(I)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_1

    .line 73
    .line 74
    invoke-virtual {p0}, Lbsh/Parser;->MethodInvocation()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_1
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_2_17(I)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    invoke-virtual {p0}, Lbsh/Parser;->Type()V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_2
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 89
    .line 90
    if-ne v0, v1, :cond_3

    .line 91
    .line 92
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    :cond_3
    const/16 v2, 0x49

    .line 97
    .line 98
    if-ne v0, v2, :cond_4

    .line 99
    .line 100
    invoke-virtual {p0}, Lbsh/Parser;->AmbiguousName()V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_4
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 105
    .line 106
    const/16 v2, 0x4b

    .line 107
    .line 108
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 109
    .line 110
    aput v3, v0, v2

    .line 111
    .line 112
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 113
    .line 114
    .line 115
    invoke-static {}, Lbsh/j;->a()V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_5
    invoke-virtual {p0}, Lbsh/Parser;->AllocationExpression()V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_6
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V

    .line 127
    .line 128
    .line 129
    const/16 v0, 0x4d

    .line 130
    .line 131
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_7
    invoke-virtual {p0}, Lbsh/Parser;->WhenExpression()V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_8
    :pswitch_0
    invoke-virtual {p0}, Lbsh/Parser;->Literal()V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :pswitch_data_0
    .packed-switch 0x46
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final PrimarySuffix()V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    new-instance v2, Lbsh/BSHPrimarySuffix;

    .line 4
    .line 5
    const/16 v0, 0x19

    .line 6
    .line 7
    invoke-direct {v2, v0}, Lbsh/BSHPrimarySuffix;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    const/4 v4, 0x1

    .line 20
    :try_start_0
    invoke-direct {v1, v0}, Lbsh/Parser;->jj_2_18(I)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    const/16 v6, 0x54

    .line 25
    .line 26
    if-eqz v5, :cond_1

    .line 27
    .line 28
    invoke-direct {v1, v6}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 29
    .line 30
    .line 31
    const/16 v0, 0xe

    .line 32
    .line 33
    invoke-direct {v1, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 34
    .line 35
    .line 36
    iget-object v0, v1, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 37
    .line 38
    invoke-virtual {v0, v2, v4}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 39
    .line 40
    .line 41
    :try_start_1
    iget-object v0, v1, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 42
    .line 43
    invoke-virtual {v0}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    const/4 v3, 0x0

    .line 55
    goto/16 :goto_9

    .line 56
    .line 57
    :cond_0
    :goto_0
    const/4 v0, 0x6

    .line 58
    iput v0, v2, Lbsh/BSHPrimarySuffix;->operation:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    .line 60
    goto/16 :goto_8

    .line 61
    .line 62
    :catchall_1
    move-exception v0

    .line 63
    move v3, v4

    .line 64
    goto/16 :goto_9

    .line 65
    .line 66
    :cond_1
    :try_start_2
    iget v5, v1, Lbsh/Parser;->jj_ntk:I

    .line 67
    .line 68
    const/4 v7, -0x1

    .line 69
    if-ne v5, v7, :cond_2

    .line 70
    .line 71
    invoke-direct {v1}, Lbsh/Parser;->jj_ntk_f()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    :cond_2
    const/16 v8, 0x4f

    .line 76
    .line 77
    const/16 v9, 0x4e

    .line 78
    .line 79
    const/16 v10, 0x4c

    .line 80
    .line 81
    const/16 v11, 0x51

    .line 82
    .line 83
    const/16 v12, 0x50

    .line 84
    .line 85
    const/16 v13, 0x97

    .line 86
    .line 87
    const/16 v14, 0x29

    .line 88
    .line 89
    if-eq v5, v12, :cond_16

    .line 90
    .line 91
    iget-object v5, v1, Lbsh/Parser;->jj_la1:[I

    .line 92
    .line 93
    iget v12, v1, Lbsh/Parser;->jj_gen:I

    .line 94
    .line 95
    const/16 v15, 0x56

    .line 96
    .line 97
    aput v12, v5, v15

    .line 98
    .line 99
    invoke-virtual {v1, v4}, Lbsh/Parser;->getToken(I)Lbsh/Token;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    iget v5, v5, Lbsh/Token;->kind:I

    .line 104
    .line 105
    const/4 v12, 0x3

    .line 106
    const/16 v15, 0x49

    .line 107
    .line 108
    if-ne v5, v13, :cond_8

    .line 109
    .line 110
    invoke-virtual {v1, v0}, Lbsh/Parser;->getToken(I)Lbsh/Token;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    iget v5, v5, Lbsh/Token;->kind:I

    .line 115
    .line 116
    if-eq v5, v15, :cond_3

    .line 117
    .line 118
    invoke-virtual {v1, v0}, Lbsh/Parser;->getToken(I)Lbsh/Token;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    iget v5, v5, Lbsh/Token;->kind:I

    .line 123
    .line 124
    if-ne v5, v14, :cond_8

    .line 125
    .line 126
    :cond_3
    invoke-virtual {v1, v12}, Lbsh/Parser;->getToken(I)Lbsh/Token;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    iget v5, v5, Lbsh/Token;->kind:I

    .line 131
    .line 132
    if-eq v5, v11, :cond_8

    .line 133
    .line 134
    invoke-direct {v1, v13}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 135
    .line 136
    .line 137
    iget v0, v1, Lbsh/Parser;->jj_ntk:I

    .line 138
    .line 139
    if-ne v0, v7, :cond_4

    .line 140
    .line 141
    invoke-direct {v1}, Lbsh/Parser;->jj_ntk_f()I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    :cond_4
    if-eq v0, v14, :cond_6

    .line 146
    .line 147
    if-ne v0, v15, :cond_5

    .line 148
    .line 149
    invoke-direct {v1, v15}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    goto :goto_1

    .line 154
    :cond_5
    iget-object v0, v1, Lbsh/Parser;->jj_la1:[I

    .line 155
    .line 156
    iget v5, v1, Lbsh/Parser;->jj_gen:I

    .line 157
    .line 158
    const/16 v6, 0x53

    .line 159
    .line 160
    aput v5, v0, v6

    .line 161
    .line 162
    invoke-direct {v1, v7}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 163
    .line 164
    .line 165
    new-instance v0, Lbsh/ParseException;

    .line 166
    .line 167
    invoke-direct {v0}, Lbsh/ParseException;-><init>()V

    .line 168
    .line 169
    .line 170
    throw v0

    .line 171
    :cond_6
    invoke-direct {v1, v14}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    :goto_1
    iget-object v5, v1, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 176
    .line 177
    invoke-virtual {v5, v2, v4}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 178
    .line 179
    .line 180
    :try_start_3
    iget-object v5, v1, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 181
    .line 182
    invoke-virtual {v5}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    if-eqz v5, :cond_7

    .line 187
    .line 188
    invoke-virtual {v1, v2}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 189
    .line 190
    .line 191
    :cond_7
    const/4 v5, 0x5

    .line 192
    iput v5, v2, Lbsh/BSHPrimarySuffix;->operation:I

    .line 193
    .line 194
    iget-object v0, v0, Lbsh/Token;->image:Ljava/lang/String;

    .line 195
    .line 196
    iput-object v0, v2, Lbsh/BSHPrimarySuffix;->field:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 197
    .line 198
    goto/16 :goto_8

    .line 199
    .line 200
    :cond_8
    :try_start_4
    invoke-direct {v1, v0}, Lbsh/Parser;->jj_2_19(I)Z

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    if-eqz v5, :cond_c

    .line 205
    .line 206
    const/16 v5, 0x99

    .line 207
    .line 208
    invoke-direct {v1, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 209
    .line 210
    .line 211
    invoke-direct {v1, v15}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    iget v8, v1, Lbsh/Parser;->jj_ntk:I

    .line 216
    .line 217
    if-ne v8, v7, :cond_9

    .line 218
    .line 219
    invoke-direct {v1}, Lbsh/Parser;->jj_ntk_f()I

    .line 220
    .line 221
    .line 222
    move-result v8

    .line 223
    :cond_9
    if-eq v8, v10, :cond_a

    .line 224
    .line 225
    iget-object v7, v1, Lbsh/Parser;->jj_la1:[I

    .line 226
    .line 227
    iget v8, v1, Lbsh/Parser;->jj_gen:I

    .line 228
    .line 229
    aput v8, v7, v6

    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_a
    invoke-virtual {v1}, Lbsh/Parser;->Arguments()V

    .line 233
    .line 234
    .line 235
    :goto_2
    iget-object v6, v1, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 236
    .line 237
    invoke-virtual {v6, v2, v4}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 238
    .line 239
    .line 240
    :try_start_5
    iget-object v6, v1, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 241
    .line 242
    invoke-virtual {v6}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 243
    .line 244
    .line 245
    move-result v6

    .line 246
    if-eqz v6, :cond_b

    .line 247
    .line 248
    invoke-virtual {v1, v2}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 249
    .line 250
    .line 251
    :cond_b
    iput v0, v2, Lbsh/BSHPrimarySuffix;->operation:I

    .line 252
    .line 253
    iget-object v0, v5, Lbsh/Token;->image:Ljava/lang/String;

    .line 254
    .line 255
    iput-object v0, v2, Lbsh/BSHPrimarySuffix;->field:Ljava/lang/String;

    .line 256
    .line 257
    iput-boolean v4, v2, Lbsh/BSHPrimarySuffix;->safeNavigate:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 258
    .line 259
    goto/16 :goto_8

    .line 260
    .line 261
    :cond_c
    :try_start_6
    invoke-direct {v1, v0}, Lbsh/Parser;->jj_2_20(I)Z

    .line 262
    .line 263
    .line 264
    move-result v5

    .line 265
    if-eqz v5, :cond_10

    .line 266
    .line 267
    invoke-direct {v1, v6}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 268
    .line 269
    .line 270
    invoke-direct {v1, v15}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 271
    .line 272
    .line 273
    move-result-object v5

    .line 274
    iget v6, v1, Lbsh/Parser;->jj_ntk:I

    .line 275
    .line 276
    if-ne v6, v7, :cond_d

    .line 277
    .line 278
    invoke-direct {v1}, Lbsh/Parser;->jj_ntk_f()I

    .line 279
    .line 280
    .line 281
    move-result v6

    .line 282
    :cond_d
    if-eq v6, v10, :cond_e

    .line 283
    .line 284
    iget-object v6, v1, Lbsh/Parser;->jj_la1:[I

    .line 285
    .line 286
    iget v7, v1, Lbsh/Parser;->jj_gen:I

    .line 287
    .line 288
    const/16 v8, 0x55

    .line 289
    .line 290
    aput v7, v6, v8

    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_e
    invoke-virtual {v1}, Lbsh/Parser;->Arguments()V

    .line 294
    .line 295
    .line 296
    :goto_3
    iget-object v6, v1, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 297
    .line 298
    invoke-virtual {v6, v2, v4}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 299
    .line 300
    .line 301
    :try_start_7
    iget-object v6, v1, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 302
    .line 303
    invoke-virtual {v6}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 304
    .line 305
    .line 306
    move-result v6

    .line 307
    if-eqz v6, :cond_f

    .line 308
    .line 309
    invoke-virtual {v1, v2}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 310
    .line 311
    .line 312
    :cond_f
    iput v0, v2, Lbsh/BSHPrimarySuffix;->operation:I

    .line 313
    .line 314
    iget-object v0, v5, Lbsh/Token;->image:Ljava/lang/String;

    .line 315
    .line 316
    iput-object v0, v2, Lbsh/BSHPrimarySuffix;->field:Ljava/lang/String;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 317
    .line 318
    goto/16 :goto_8

    .line 319
    .line 320
    :cond_10
    :try_start_8
    iget v5, v1, Lbsh/Parser;->jj_ntk:I

    .line 321
    .line 322
    if-ne v5, v7, :cond_11

    .line 323
    .line 324
    invoke-direct {v1}, Lbsh/Parser;->jj_ntk_f()I

    .line 325
    .line 326
    .line 327
    move-result v5

    .line 328
    :cond_11
    if-eq v5, v9, :cond_14

    .line 329
    .line 330
    iget-object v5, v1, Lbsh/Parser;->jj_la1:[I

    .line 331
    .line 332
    iget v8, v1, Lbsh/Parser;->jj_gen:I

    .line 333
    .line 334
    const/16 v9, 0x57

    .line 335
    .line 336
    aput v8, v5, v9

    .line 337
    .line 338
    invoke-direct {v1, v0}, Lbsh/Parser;->jj_2_21(I)Z

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    if-eqz v0, :cond_13

    .line 343
    .line 344
    invoke-direct {v1, v6}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v1}, Lbsh/Parser;->AllocationExpression()V

    .line 348
    .line 349
    .line 350
    iget-object v0, v1, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 351
    .line 352
    invoke-virtual {v0, v2, v4}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 353
    .line 354
    .line 355
    :try_start_9
    iget-object v0, v1, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 356
    .line 357
    invoke-virtual {v0}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    if-eqz v0, :cond_12

    .line 362
    .line 363
    invoke-virtual {v1, v2}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 364
    .line 365
    .line 366
    :cond_12
    const/4 v0, 0x4

    .line 367
    iput v0, v2, Lbsh/BSHPrimarySuffix;->operation:I
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 368
    .line 369
    goto/16 :goto_8

    .line 370
    .line 371
    :cond_13
    :try_start_a
    invoke-direct {v1, v7}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 372
    .line 373
    .line 374
    new-instance v0, Lbsh/ParseException;

    .line 375
    .line 376
    invoke-direct {v0}, Lbsh/ParseException;-><init>()V

    .line 377
    .line 378
    .line 379
    throw v0

    .line 380
    :cond_14
    invoke-direct {v1, v9}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v1}, Lbsh/Parser;->Expression()V

    .line 384
    .line 385
    .line 386
    invoke-direct {v1, v8}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 387
    .line 388
    .line 389
    iget-object v0, v1, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 390
    .line 391
    invoke-virtual {v0, v2, v4}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 392
    .line 393
    .line 394
    :try_start_b
    iget-object v0, v1, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 395
    .line 396
    invoke-virtual {v0}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    if-eqz v0, :cond_15

    .line 401
    .line 402
    invoke-virtual {v1, v2}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 403
    .line 404
    .line 405
    :cond_15
    iput v12, v2, Lbsh/BSHPrimarySuffix;->operation:I
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 406
    .line 407
    goto/16 :goto_8

    .line 408
    .line 409
    :cond_16
    :try_start_c
    invoke-direct {v1, v12}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 410
    .line 411
    .line 412
    iget v0, v1, Lbsh/Parser;->jj_ntk:I

    .line 413
    .line 414
    if-ne v0, v7, :cond_17

    .line 415
    .line 416
    invoke-direct {v1}, Lbsh/Parser;->jj_ntk_f()I

    .line 417
    .line 418
    .line 419
    move-result v0

    .line 420
    :cond_17
    const/16 v5, 0x5b

    .line 421
    .line 422
    const/16 v6, 0x5a

    .line 423
    .line 424
    const/16 v15, 0x2a

    .line 425
    .line 426
    if-eq v0, v14, :cond_18

    .line 427
    .line 428
    if-eq v0, v15, :cond_18

    .line 429
    .line 430
    if-eq v0, v6, :cond_18

    .line 431
    .line 432
    if-eq v0, v5, :cond_18

    .line 433
    .line 434
    sparse-switch v0, :sswitch_data_0

    .line 435
    .line 436
    .line 437
    packed-switch v0, :pswitch_data_0

    .line 438
    .line 439
    .line 440
    packed-switch v0, :pswitch_data_1

    .line 441
    .line 442
    .line 443
    iget-object v0, v1, Lbsh/Parser;->jj_la1:[I

    .line 444
    .line 445
    iget v3, v1, Lbsh/Parser;->jj_gen:I

    .line 446
    .line 447
    aput v3, v0, v10

    .line 448
    .line 449
    goto :goto_4

    .line 450
    :cond_18
    :pswitch_0
    :sswitch_0
    invoke-virtual {v1}, Lbsh/Parser;->Expression()V

    .line 451
    .line 452
    .line 453
    iput-boolean v4, v2, Lbsh/BSHPrimarySuffix;->hasLeftIndex:Z

    .line 454
    .line 455
    :goto_4
    iget v0, v1, Lbsh/Parser;->jj_ntk:I

    .line 456
    .line 457
    if-ne v0, v7, :cond_19

    .line 458
    .line 459
    invoke-direct {v1}, Lbsh/Parser;->jj_ntk_f()I

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    :cond_19
    const/16 v3, 0x96

    .line 464
    .line 465
    if-eq v0, v3, :cond_1a

    .line 466
    .line 467
    if-eq v0, v13, :cond_1a

    .line 468
    .line 469
    iget-object v0, v1, Lbsh/Parser;->jj_la1:[I

    .line 470
    .line 471
    iget v3, v1, Lbsh/Parser;->jj_gen:I

    .line 472
    .line 473
    const/16 v5, 0x52

    .line 474
    .line 475
    aput v3, v0, v5

    .line 476
    .line 477
    goto/16 :goto_7

    .line 478
    .line 479
    :cond_1a
    iget v0, v1, Lbsh/Parser;->jj_ntk:I

    .line 480
    .line 481
    if-ne v0, v7, :cond_1b

    .line 482
    .line 483
    invoke-direct {v1}, Lbsh/Parser;->jj_ntk_f()I

    .line 484
    .line 485
    .line 486
    move-result v0

    .line 487
    :cond_1b
    if-eq v0, v3, :cond_1f

    .line 488
    .line 489
    if-ne v0, v13, :cond_1e

    .line 490
    .line 491
    invoke-direct {v1, v13}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 492
    .line 493
    .line 494
    iget v0, v1, Lbsh/Parser;->jj_ntk:I

    .line 495
    .line 496
    if-ne v0, v7, :cond_1c

    .line 497
    .line 498
    invoke-direct {v1}, Lbsh/Parser;->jj_ntk_f()I

    .line 499
    .line 500
    .line 501
    move-result v0

    .line 502
    :cond_1c
    if-eq v0, v14, :cond_1d

    .line 503
    .line 504
    if-eq v0, v15, :cond_1d

    .line 505
    .line 506
    if-eq v0, v6, :cond_1d

    .line 507
    .line 508
    if-eq v0, v5, :cond_1d

    .line 509
    .line 510
    sparse-switch v0, :sswitch_data_1

    .line 511
    .line 512
    .line 513
    packed-switch v0, :pswitch_data_2

    .line 514
    .line 515
    .line 516
    packed-switch v0, :pswitch_data_3

    .line 517
    .line 518
    .line 519
    iget-object v0, v1, Lbsh/Parser;->jj_la1:[I

    .line 520
    .line 521
    iget v3, v1, Lbsh/Parser;->jj_gen:I

    .line 522
    .line 523
    const/16 v5, 0x4d

    .line 524
    .line 525
    aput v3, v0, v5

    .line 526
    .line 527
    goto :goto_5

    .line 528
    :cond_1d
    :pswitch_1
    :sswitch_1
    invoke-virtual {v1}, Lbsh/Parser;->Expression()V

    .line 529
    .line 530
    .line 531
    :goto_5
    iput-boolean v4, v2, Lbsh/BSHPrimarySuffix;->slice:Z

    .line 532
    .line 533
    iput-boolean v4, v2, Lbsh/BSHPrimarySuffix;->step:Z

    .line 534
    .line 535
    goto/16 :goto_7

    .line 536
    .line 537
    :cond_1e
    iget-object v0, v1, Lbsh/Parser;->jj_la1:[I

    .line 538
    .line 539
    iget v3, v1, Lbsh/Parser;->jj_gen:I

    .line 540
    .line 541
    aput v3, v0, v11

    .line 542
    .line 543
    invoke-direct {v1, v7}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 544
    .line 545
    .line 546
    new-instance v0, Lbsh/ParseException;

    .line 547
    .line 548
    invoke-direct {v0}, Lbsh/ParseException;-><init>()V

    .line 549
    .line 550
    .line 551
    throw v0

    .line 552
    :cond_1f
    invoke-direct {v1, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 553
    .line 554
    .line 555
    iput-boolean v4, v2, Lbsh/BSHPrimarySuffix;->slice:Z

    .line 556
    .line 557
    iget v0, v1, Lbsh/Parser;->jj_ntk:I

    .line 558
    .line 559
    if-ne v0, v7, :cond_20

    .line 560
    .line 561
    invoke-direct {v1}, Lbsh/Parser;->jj_ntk_f()I

    .line 562
    .line 563
    .line 564
    move-result v0

    .line 565
    :cond_20
    if-eq v0, v14, :cond_21

    .line 566
    .line 567
    if-eq v0, v15, :cond_21

    .line 568
    .line 569
    if-eq v0, v6, :cond_21

    .line 570
    .line 571
    if-eq v0, v5, :cond_21

    .line 572
    .line 573
    sparse-switch v0, :sswitch_data_2

    .line 574
    .line 575
    .line 576
    packed-switch v0, :pswitch_data_4

    .line 577
    .line 578
    .line 579
    packed-switch v0, :pswitch_data_5

    .line 580
    .line 581
    .line 582
    iget-object v0, v1, Lbsh/Parser;->jj_la1:[I

    .line 583
    .line 584
    iget v10, v1, Lbsh/Parser;->jj_gen:I

    .line 585
    .line 586
    aput v10, v0, v9

    .line 587
    .line 588
    goto :goto_6

    .line 589
    :cond_21
    :pswitch_2
    :sswitch_2
    invoke-virtual {v1}, Lbsh/Parser;->Expression()V

    .line 590
    .line 591
    .line 592
    iput-boolean v4, v2, Lbsh/BSHPrimarySuffix;->hasRightIndex:Z

    .line 593
    .line 594
    :goto_6
    iget v0, v1, Lbsh/Parser;->jj_ntk:I

    .line 595
    .line 596
    if-ne v0, v7, :cond_22

    .line 597
    .line 598
    invoke-direct {v1}, Lbsh/Parser;->jj_ntk_f()I

    .line 599
    .line 600
    .line 601
    move-result v0

    .line 602
    :cond_22
    if-eq v0, v3, :cond_23

    .line 603
    .line 604
    iget-object v0, v1, Lbsh/Parser;->jj_la1:[I

    .line 605
    .line 606
    iget v3, v1, Lbsh/Parser;->jj_gen:I

    .line 607
    .line 608
    aput v3, v0, v12

    .line 609
    .line 610
    goto :goto_7

    .line 611
    :cond_23
    invoke-direct {v1, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 612
    .line 613
    .line 614
    iput-boolean v4, v2, Lbsh/BSHPrimarySuffix;->step:Z

    .line 615
    .line 616
    iget v0, v1, Lbsh/Parser;->jj_ntk:I

    .line 617
    .line 618
    if-ne v0, v7, :cond_24

    .line 619
    .line 620
    invoke-direct {v1}, Lbsh/Parser;->jj_ntk_f()I

    .line 621
    .line 622
    .line 623
    move-result v0

    .line 624
    :cond_24
    if-eq v0, v14, :cond_25

    .line 625
    .line 626
    if-eq v0, v15, :cond_25

    .line 627
    .line 628
    if-eq v0, v6, :cond_25

    .line 629
    .line 630
    if-eq v0, v5, :cond_25

    .line 631
    .line 632
    sparse-switch v0, :sswitch_data_3

    .line 633
    .line 634
    .line 635
    packed-switch v0, :pswitch_data_6

    .line 636
    .line 637
    .line 638
    packed-switch v0, :pswitch_data_7

    .line 639
    .line 640
    .line 641
    iget-object v0, v1, Lbsh/Parser;->jj_la1:[I

    .line 642
    .line 643
    iget v3, v1, Lbsh/Parser;->jj_gen:I

    .line 644
    .line 645
    aput v3, v0, v8

    .line 646
    .line 647
    goto :goto_7

    .line 648
    :cond_25
    :pswitch_3
    :sswitch_3
    invoke-virtual {v1}, Lbsh/Parser;->Expression()V

    .line 649
    .line 650
    .line 651
    :goto_7
    invoke-direct {v1, v11}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 652
    .line 653
    .line 654
    iget-object v0, v1, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 655
    .line 656
    invoke-virtual {v0, v2, v4}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 657
    .line 658
    .line 659
    :try_start_d
    iget-object v0, v1, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 660
    .line 661
    invoke-virtual {v0}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 662
    .line 663
    .line 664
    move-result v0

    .line 665
    if-eqz v0, :cond_26

    .line 666
    .line 667
    invoke-virtual {v1, v2}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 668
    .line 669
    .line 670
    :cond_26
    iput v4, v2, Lbsh/BSHPrimarySuffix;->operation:I
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 671
    .line 672
    :goto_8
    return-void

    .line 673
    :goto_9
    iget-object v5, v1, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 674
    .line 675
    if-eqz v3, :cond_27

    .line 676
    .line 677
    :try_start_e
    invoke-virtual {v5, v2}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V

    .line 678
    .line 679
    .line 680
    const/4 v3, 0x0

    .line 681
    goto :goto_a

    .line 682
    :catchall_2
    move-exception v0

    .line 683
    goto :goto_b

    .line 684
    :cond_27
    invoke-virtual {v5}, Lbsh/JJTParserState;->popNode()Lbsh/Node;

    .line 685
    .line 686
    .line 687
    :goto_a
    instance-of v5, v0, Lbsh/ParseException;

    .line 688
    .line 689
    if-nez v5, :cond_29

    .line 690
    .line 691
    instance-of v5, v0, Ljava/lang/RuntimeException;

    .line 692
    .line 693
    if-eqz v5, :cond_28

    .line 694
    .line 695
    check-cast v0, Ljava/lang/RuntimeException;

    .line 696
    .line 697
    throw v0

    .line 698
    :cond_28
    check-cast v0, Ljava/lang/Error;

    .line 699
    .line 700
    throw v0

    .line 701
    :cond_29
    check-cast v0, Lbsh/ParseException;

    .line 702
    .line 703
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 704
    :goto_b
    if-eqz v3, :cond_2a

    .line 705
    .line 706
    iget-object v3, v1, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 707
    .line 708
    invoke-virtual {v3, v2, v4}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 709
    .line 710
    .line 711
    iget-object v3, v1, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 712
    .line 713
    invoke-virtual {v3}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 714
    .line 715
    .line 716
    move-result v3

    .line 717
    if-eqz v3, :cond_2a

    .line 718
    .line 719
    invoke-virtual {v1, v2}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 720
    .line 721
    .line 722
    :cond_2a
    throw v0

    .line 723
    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_0
        0xf -> :sswitch_0
        0x12 -> :sswitch_0
        0x17 -> :sswitch_0
        0x1b -> :sswitch_0
        0x1e -> :sswitch_0
        0x25 -> :sswitch_0
        0x27 -> :sswitch_0
        0x30 -> :sswitch_0
        0x38 -> :sswitch_0
        0x3a -> :sswitch_0
        0x3c -> :sswitch_0
        0x3e -> :sswitch_0
        0x43 -> :sswitch_0
        0x4c -> :sswitch_0
        0x4e -> :sswitch_0
        0x50 -> :sswitch_0
    .end sparse-switch

    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    :pswitch_data_0
    .packed-switch 0x46
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    :pswitch_data_1
    .packed-switch 0x66
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    :sswitch_data_1
    .sparse-switch
        0xc -> :sswitch_1
        0xf -> :sswitch_1
        0x12 -> :sswitch_1
        0x17 -> :sswitch_1
        0x1b -> :sswitch_1
        0x1e -> :sswitch_1
        0x25 -> :sswitch_1
        0x27 -> :sswitch_1
        0x30 -> :sswitch_1
        0x38 -> :sswitch_1
        0x3a -> :sswitch_1
        0x3c -> :sswitch_1
        0x3e -> :sswitch_1
        0x43 -> :sswitch_1
        0x4c -> :sswitch_1
        0x4e -> :sswitch_1
        0x50 -> :sswitch_1
    .end sparse-switch

    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    :pswitch_data_2
    .packed-switch 0x46
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x66
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        0xc -> :sswitch_2
        0xf -> :sswitch_2
        0x12 -> :sswitch_2
        0x17 -> :sswitch_2
        0x1b -> :sswitch_2
        0x1e -> :sswitch_2
        0x25 -> :sswitch_2
        0x27 -> :sswitch_2
        0x30 -> :sswitch_2
        0x38 -> :sswitch_2
        0x3a -> :sswitch_2
        0x3c -> :sswitch_2
        0x3e -> :sswitch_2
        0x43 -> :sswitch_2
        0x4c -> :sswitch_2
        0x4e -> :sswitch_2
        0x50 -> :sswitch_2
    .end sparse-switch

    :pswitch_data_4
    .packed-switch 0x46
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x66
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch

    :sswitch_data_3
    .sparse-switch
        0xc -> :sswitch_3
        0xf -> :sswitch_3
        0x12 -> :sswitch_3
        0x17 -> :sswitch_3
        0x1b -> :sswitch_3
        0x1e -> :sswitch_3
        0x25 -> :sswitch_3
        0x27 -> :sswitch_3
        0x30 -> :sswitch_3
        0x38 -> :sswitch_3
        0x3a -> :sswitch_3
        0x3c -> :sswitch_3
        0x3e -> :sswitch_3
        0x43 -> :sswitch_3
        0x4c -> :sswitch_3
        0x4e -> :sswitch_3
        0x50 -> :sswitch_3
    .end sparse-switch

    :pswitch_data_6
    .packed-switch 0x46
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x66
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method

.method public final PrimitiveType()V
    .locals 6

    .line 1
    new-instance v0, Lbsh/BSHPrimitiveType;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHPrimitiveType;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    :try_start_0
    iget v2, p0, Lbsh/Parser;->jj_ntk:I

    .line 18
    .line 19
    const/4 v3, -0x1

    .line 20
    if-ne v2, v3, :cond_0

    .line 21
    .line 22
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v2

    .line 28
    move v5, v1

    .line 29
    goto/16 :goto_3

    .line 30
    .line 31
    :cond_0
    :goto_0
    const/16 v4, 0xc

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    if-eq v2, v4, :cond_f

    .line 35
    .line 36
    const/16 v4, 0xf

    .line 37
    .line 38
    if-eq v2, v4, :cond_d

    .line 39
    .line 40
    const/16 v4, 0x12

    .line 41
    .line 42
    if-eq v2, v4, :cond_b

    .line 43
    .line 44
    const/16 v4, 0x17

    .line 45
    .line 46
    if-eq v2, v4, :cond_9

    .line 47
    .line 48
    const/16 v4, 0x1e

    .line 49
    .line 50
    if-eq v2, v4, :cond_7

    .line 51
    .line 52
    const/16 v4, 0x25

    .line 53
    .line 54
    if-eq v2, v4, :cond_5

    .line 55
    .line 56
    const/16 v4, 0x27

    .line 57
    .line 58
    if-eq v2, v4, :cond_3

    .line 59
    .line 60
    const/16 v4, 0x30

    .line 61
    .line 62
    if-ne v2, v4, :cond_2

    .line 63
    .line 64
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 65
    .line 66
    .line 67
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 68
    .line 69
    invoke-virtual {v2, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    :try_start_1
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 73
    .line 74
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_1

    .line 79
    .line 80
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :catchall_1
    move-exception v2

    .line 85
    goto/16 :goto_3

    .line 86
    .line 87
    :cond_1
    :goto_1
    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 88
    .line 89
    iput-object v2, v0, Lbsh/BSHPrimitiveType;->type:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 90
    .line 91
    goto/16 :goto_2

    .line 92
    .line 93
    :cond_2
    :try_start_2
    iget-object v2, p0, Lbsh/Parser;->jj_la1:[I

    .line 94
    .line 95
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 96
    .line 97
    const/16 v5, 0x20

    .line 98
    .line 99
    aput v4, v2, v5

    .line 100
    .line 101
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 102
    .line 103
    .line 104
    new-instance v2, Lbsh/ParseException;

    .line 105
    .line 106
    invoke-direct {v2}, Lbsh/ParseException;-><init>()V

    .line 107
    .line 108
    .line 109
    throw v2

    .line 110
    :cond_3
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 111
    .line 112
    .line 113
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 114
    .line 115
    invoke-virtual {v2, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 116
    .line 117
    .line 118
    :try_start_3
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 119
    .line 120
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_4

    .line 125
    .line 126
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 127
    .line 128
    .line 129
    :cond_4
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 130
    .line 131
    iput-object v2, v0, Lbsh/BSHPrimitiveType;->type:Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 132
    .line 133
    goto/16 :goto_2

    .line 134
    .line 135
    :cond_5
    :try_start_4
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 136
    .line 137
    .line 138
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 139
    .line 140
    invoke-virtual {v2, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 141
    .line 142
    .line 143
    :try_start_5
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 144
    .line 145
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-eqz v2, :cond_6

    .line 150
    .line 151
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 152
    .line 153
    .line 154
    :cond_6
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 155
    .line 156
    iput-object v2, v0, Lbsh/BSHPrimitiveType;->type:Ljava/lang/Class;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 157
    .line 158
    goto/16 :goto_2

    .line 159
    .line 160
    :cond_7
    :try_start_6
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 161
    .line 162
    .line 163
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 164
    .line 165
    invoke-virtual {v2, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 166
    .line 167
    .line 168
    :try_start_7
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 169
    .line 170
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    if-eqz v2, :cond_8

    .line 175
    .line 176
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 177
    .line 178
    .line 179
    :cond_8
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 180
    .line 181
    iput-object v2, v0, Lbsh/BSHPrimitiveType;->type:Ljava/lang/Class;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_9
    :try_start_8
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 185
    .line 186
    .line 187
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 188
    .line 189
    invoke-virtual {v2, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 190
    .line 191
    .line 192
    :try_start_9
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 193
    .line 194
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-eqz v2, :cond_a

    .line 199
    .line 200
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 201
    .line 202
    .line 203
    :cond_a
    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 204
    .line 205
    iput-object v2, v0, Lbsh/BSHPrimitiveType;->type:Ljava/lang/Class;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_b
    :try_start_a
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 209
    .line 210
    .line 211
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 212
    .line 213
    invoke-virtual {v2, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 214
    .line 215
    .line 216
    :try_start_b
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 217
    .line 218
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-eqz v2, :cond_c

    .line 223
    .line 224
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 225
    .line 226
    .line 227
    :cond_c
    sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 228
    .line 229
    iput-object v2, v0, Lbsh/BSHPrimitiveType;->type:Ljava/lang/Class;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_d
    :try_start_c
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 233
    .line 234
    .line 235
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 236
    .line 237
    invoke-virtual {v2, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 238
    .line 239
    .line 240
    :try_start_d
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 241
    .line 242
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    if-eqz v2, :cond_e

    .line 247
    .line 248
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 249
    .line 250
    .line 251
    :cond_e
    sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 252
    .line 253
    iput-object v2, v0, Lbsh/BSHPrimitiveType;->type:Ljava/lang/Class;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_f
    :try_start_e
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 257
    .line 258
    .line 259
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 260
    .line 261
    invoke-virtual {v2, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 262
    .line 263
    .line 264
    :try_start_f
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 265
    .line 266
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    if-eqz v2, :cond_10

    .line 271
    .line 272
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 273
    .line 274
    .line 275
    :cond_10
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 276
    .line 277
    iput-object v2, v0, Lbsh/BSHPrimitiveType;->type:Ljava/lang/Class;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    .line 278
    .line 279
    :goto_2
    return-void

    .line 280
    :goto_3
    if-eqz v5, :cond_11

    .line 281
    .line 282
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 283
    .line 284
    invoke-virtual {v3, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 285
    .line 286
    .line 287
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 288
    .line 289
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    if-eqz v1, :cond_11

    .line 294
    .line 295
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 296
    .line 297
    .line 298
    :cond_11
    throw v2
.end method

.method public ReInit(Lbsh/ParserTokenManager;)V
    .locals 3

    .line 85
    iput-object p1, p0, Lbsh/Parser;->token_source:Lbsh/ParserTokenManager;

    .line 86
    new-instance p1, Lbsh/Token;

    invoke-direct {p1}, Lbsh/Token;-><init>()V

    iput-object p1, p0, Lbsh/Parser;->token:Lbsh/Token;

    const/4 p1, -0x1

    .line 87
    iput p1, p0, Lbsh/Parser;->jj_ntk:I

    const/4 v0, 0x0

    .line 88
    iput v0, p0, Lbsh/Parser;->jj_gen:I

    move v1, v0

    :goto_0
    const/16 v2, 0x7b

    if-ge v1, v2, :cond_0

    .line 89
    iget-object v2, p0, Lbsh/Parser;->jj_la1:[I

    aput p1, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 90
    :cond_0
    :goto_1
    iget-object p1, p0, Lbsh/Parser;->jj_2_rtns:[Lbsh/Parser$JJCalls;

    array-length v1, p1

    if-ge v0, v1, :cond_1

    new-instance v1, Lbsh/Parser$JJCalls;

    invoke-direct {v1}, Lbsh/Parser$JJCalls;-><init>()V

    aput-object v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public ReInit(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    .locals 2

    .line 78
    iget-object v0, p0, Lbsh/Parser;->jj_input_stream:Lbsh/JavaCharStream;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1, v1}, Lbsh/JavaCharStream;->reInit(Ljava/io/InputStream;Ljava/nio/charset/Charset;II)V

    .line 79
    iget-object p1, p0, Lbsh/Parser;->token_source:Lbsh/ParserTokenManager;

    iget-object p2, p0, Lbsh/Parser;->jj_input_stream:Lbsh/JavaCharStream;

    invoke-virtual {p1, p2}, Lbsh/ParserTokenManager;->ReInit(Lbsh/JavaCharStream;)V

    .line 80
    new-instance p1, Lbsh/Token;

    invoke-direct {p1}, Lbsh/Token;-><init>()V

    iput-object p1, p0, Lbsh/Parser;->token:Lbsh/Token;

    const/4 p1, -0x1

    .line 81
    iput p1, p0, Lbsh/Parser;->jj_ntk:I

    const/4 p2, 0x0

    .line 82
    iput p2, p0, Lbsh/Parser;->jj_gen:I

    move v0, p2

    :goto_0
    const/16 v1, 0x7b

    if-ge v0, v1, :cond_0

    .line 83
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    aput p1, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 84
    :cond_0
    :goto_1
    iget-object p1, p0, Lbsh/Parser;->jj_2_rtns:[Lbsh/Parser$JJCalls;

    array-length v0, p1

    if-ge p2, v0, :cond_1

    new-instance v0, Lbsh/Parser$JJCalls;

    invoke-direct {v0}, Lbsh/Parser$JJCalls;-><init>()V

    aput-object v0, p1, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public ReInit(Ljava/io/Reader;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_input_stream:Lbsh/JavaCharStream;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lbsh/JavaCharStream;

    .line 7
    .line 8
    invoke-direct {v0, p1, v1, v1}, Lbsh/JavaCharStream;-><init>(Ljava/io/Reader;II)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lbsh/Parser;->jj_input_stream:Lbsh/JavaCharStream;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0, p1, v1, v1}, Lbsh/JavaCharStream;->reInit(Ljava/io/Reader;II)V

    .line 15
    .line 16
    .line 17
    :goto_0
    iget-object p1, p0, Lbsh/Parser;->token_source:Lbsh/ParserTokenManager;

    .line 18
    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    new-instance p1, Lbsh/ParserTokenManager;

    .line 22
    .line 23
    iget-object v0, p0, Lbsh/Parser;->jj_input_stream:Lbsh/JavaCharStream;

    .line 24
    .line 25
    invoke-direct {p1, v0}, Lbsh/ParserTokenManager;-><init>(Lbsh/JavaCharStream;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lbsh/Parser;->token_source:Lbsh/ParserTokenManager;

    .line 29
    .line 30
    :cond_1
    iget-object p1, p0, Lbsh/Parser;->token_source:Lbsh/ParserTokenManager;

    .line 31
    .line 32
    iget-object v0, p0, Lbsh/Parser;->jj_input_stream:Lbsh/JavaCharStream;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lbsh/ParserTokenManager;->ReInit(Lbsh/JavaCharStream;)V

    .line 35
    .line 36
    .line 37
    new-instance p1, Lbsh/Token;

    .line 38
    .line 39
    invoke-direct {p1}, Lbsh/Token;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 43
    .line 44
    const/4 p1, -0x1

    .line 45
    iput p1, p0, Lbsh/Parser;->jj_ntk:I

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    iput v0, p0, Lbsh/Parser;->jj_gen:I

    .line 49
    .line 50
    move v1, v0

    .line 51
    :goto_1
    const/16 v2, 0x7b

    .line 52
    .line 53
    if-ge v1, v2, :cond_2

    .line 54
    .line 55
    iget-object v2, p0, Lbsh/Parser;->jj_la1:[I

    .line 56
    .line 57
    aput p1, v2, v1

    .line 58
    .line 59
    add-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    :goto_2
    iget-object p1, p0, Lbsh/Parser;->jj_2_rtns:[Lbsh/Parser$JJCalls;

    .line 63
    .line 64
    array-length v1, p1

    .line 65
    if-ge v0, v1, :cond_3

    .line 66
    .line 67
    new-instance v1, Lbsh/Parser$JJCalls;

    .line 68
    .line 69
    invoke-direct {v1}, Lbsh/Parser$JJCalls;-><init>()V

    .line 70
    .line 71
    .line 72
    aput-object v1, p1, v0

    .line 73
    .line 74
    add-int/lit8 v0, v0, 0x1

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_3
    return-void
.end method

.method public final RelationalExpression()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lbsh/Parser;->ShiftExpression()V

    .line 2
    .line 3
    .line 4
    :goto_0
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :cond_0
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    :pswitch_0
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 17
    .line 18
    const/16 v1, 0x35

    .line 19
    .line 20
    iget v2, p0, Lbsh/Parser;->jj_gen:I

    .line 21
    .line 22
    aput v2, v0, v1

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_1
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 26
    .line 27
    if-ne v0, v1, :cond_1

    .line 28
    .line 29
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    :cond_1
    packed-switch v0, :pswitch_data_1

    .line 34
    .line 35
    .line 36
    :pswitch_2
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 37
    .line 38
    const/16 v2, 0x36

    .line 39
    .line 40
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 41
    .line 42
    aput v3, v0, v2

    .line 43
    .line 44
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lbsh/j;->a()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_3
    const/16 v0, 0x60

    .line 52
    .line 53
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    goto :goto_1

    .line 58
    :pswitch_4
    const/16 v0, 0x5f

    .line 59
    .line 60
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    goto :goto_1

    .line 65
    :pswitch_5
    const/16 v0, 0x5e

    .line 66
    .line 67
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    goto :goto_1

    .line 72
    :pswitch_6
    const/16 v0, 0x5d

    .line 73
    .line 74
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    goto :goto_1

    .line 79
    :pswitch_7
    const/16 v0, 0x59

    .line 80
    .line 81
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    goto :goto_1

    .line 86
    :pswitch_8
    const/16 v0, 0x58

    .line 87
    .line 88
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    goto :goto_1

    .line 93
    :pswitch_9
    const/16 v0, 0x57

    .line 94
    .line 95
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    goto :goto_1

    .line 100
    :pswitch_a
    const/16 v0, 0x56

    .line 101
    .line 102
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    :goto_1
    invoke-virtual {p0}, Lbsh/Parser;->ShiftExpression()V

    .line 107
    .line 108
    .line 109
    new-instance v1, Lbsh/BSHBinaryExpression;

    .line 110
    .line 111
    const/16 v2, 0x11

    .line 112
    .line 113
    invoke-direct {v1, v2}, Lbsh/BSHBinaryExpression;-><init>(I)V

    .line 114
    .line 115
    .line 116
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 117
    .line 118
    invoke-virtual {v2, v1}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 122
    .line 123
    .line 124
    const/4 v2, 0x2

    .line 125
    const/4 v3, 0x1

    .line 126
    :try_start_0
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 127
    .line 128
    invoke-virtual {v4, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 129
    .line 130
    .line 131
    const/4 v3, 0x0

    .line 132
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 133
    .line 134
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-eqz v4, :cond_2

    .line 139
    .line 140
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :catchall_0
    move-exception v0

    .line 145
    goto :goto_3

    .line 146
    :cond_2
    :goto_2
    iget v0, v0, Lbsh/Token;->kind:I

    .line 147
    .line 148
    iput v0, v1, Lbsh/BSHBinaryExpression;->kind:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :goto_3
    if-eqz v3, :cond_3

    .line 153
    .line 154
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 155
    .line 156
    invoke-virtual {v3, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 157
    .line 158
    .line 159
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 160
    .line 161
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-eqz v2, :cond_3

    .line 166
    .line 167
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 168
    .line 169
    .line 170
    :cond_3
    throw v0

    .line 171
    :pswitch_data_0
    .packed-switch 0x56
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    :pswitch_data_1
    .packed-switch 0x56
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method public final ReturnStatement()V
    .locals 6

    .line 1
    new-instance v0, Lbsh/BSHReturnStatement;

    .line 2
    .line 3
    const/16 v1, 0x27

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHReturnStatement;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/16 v2, 0x2f

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    :try_start_0
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lbsh/Parser;->isSameLineReturnExpression()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v2

    .line 34
    move v4, v3

    .line 35
    goto :goto_2

    .line 36
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lbsh/Parser;->StatementTerminator()V

    .line 37
    .line 38
    .line 39
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 40
    .line 41
    invoke-virtual {v4, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    :try_start_1
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 45
    .line 46
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :catchall_1
    move-exception v2

    .line 57
    move v4, v1

    .line 58
    goto :goto_2

    .line 59
    :cond_1
    :goto_1
    iput v2, v0, Lbsh/BSHReturnStatement;->kind:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 60
    .line 61
    return-void

    .line 62
    :goto_2
    iget-object v5, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 63
    .line 64
    if-eqz v4, :cond_2

    .line 65
    .line 66
    :try_start_2
    invoke-virtual {v5, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :catchall_2
    move-exception v1

    .line 71
    goto :goto_4

    .line 72
    :cond_2
    invoke-virtual {v5}, Lbsh/JJTParserState;->popNode()Lbsh/Node;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 73
    .line 74
    .line 75
    move v1, v4

    .line 76
    :goto_3
    :try_start_3
    instance-of v4, v2, Lbsh/ParseException;

    .line 77
    .line 78
    if-nez v4, :cond_4

    .line 79
    .line 80
    instance-of v4, v2, Ljava/lang/RuntimeException;

    .line 81
    .line 82
    if-eqz v4, :cond_3

    .line 83
    .line 84
    check-cast v2, Ljava/lang/RuntimeException;

    .line 85
    .line 86
    throw v2

    .line 87
    :catchall_3
    move-exception v2

    .line 88
    move v4, v1

    .line 89
    move-object v1, v2

    .line 90
    goto :goto_4

    .line 91
    :cond_3
    check-cast v2, Ljava/lang/Error;

    .line 92
    .line 93
    throw v2

    .line 94
    :cond_4
    check-cast v2, Lbsh/ParseException;

    .line 95
    .line 96
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 97
    :goto_4
    if-eqz v4, :cond_5

    .line 98
    .line 99
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 100
    .line 101
    invoke-virtual {v2, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 102
    .line 103
    .line 104
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 105
    .line 106
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_5

    .line 111
    .line 112
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 113
    .line 114
    .line 115
    :cond_5
    throw v1
.end method

.method public final ReturnType()V
    .locals 7

    .line 1
    new-instance v0, Lbsh/BSHReturnType;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHReturnType;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v2, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    :try_start_0
    iget v4, p0, Lbsh/Parser;->jj_ntk:I

    .line 19
    .line 20
    const/4 v5, -0x1

    .line 21
    if-ne v4, v5, :cond_0

    .line 22
    .line 23
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    move v4, v3

    .line 30
    goto :goto_3

    .line 31
    :cond_0
    :goto_0
    if-eq v4, v1, :cond_4

    .line 32
    .line 33
    const/16 v1, 0xf

    .line 34
    .line 35
    if-eq v4, v1, :cond_4

    .line 36
    .line 37
    const/16 v1, 0x12

    .line 38
    .line 39
    if-eq v4, v1, :cond_4

    .line 40
    .line 41
    const/16 v1, 0x17

    .line 42
    .line 43
    if-eq v4, v1, :cond_4

    .line 44
    .line 45
    const/16 v1, 0x1e

    .line 46
    .line 47
    if-eq v4, v1, :cond_4

    .line 48
    .line 49
    const/16 v1, 0x25

    .line 50
    .line 51
    if-eq v4, v1, :cond_4

    .line 52
    .line 53
    const/16 v1, 0x27

    .line 54
    .line 55
    if-eq v4, v1, :cond_4

    .line 56
    .line 57
    const/16 v1, 0x30

    .line 58
    .line 59
    if-eq v4, v1, :cond_4

    .line 60
    .line 61
    const/16 v1, 0x3a

    .line 62
    .line 63
    if-eq v4, v1, :cond_2

    .line 64
    .line 65
    const/16 v1, 0x49

    .line 66
    .line 67
    if-ne v4, v1, :cond_1

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_1
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 71
    .line 72
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 73
    .line 74
    const/16 v6, 0x1f

    .line 75
    .line 76
    aput v4, v1, v6

    .line 77
    .line 78
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 79
    .line 80
    .line 81
    new-instance v1, Lbsh/ParseException;

    .line 82
    .line 83
    invoke-direct {v1}, Lbsh/ParseException;-><init>()V

    .line 84
    .line 85
    .line 86
    throw v1

    .line 87
    :cond_2
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 88
    .line 89
    .line 90
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 91
    .line 92
    invoke-virtual {v1, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    .line 95
    :try_start_1
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 96
    .line 97
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_3

    .line 102
    .line 103
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :catchall_1
    move-exception v1

    .line 108
    move v4, v2

    .line 109
    goto :goto_3

    .line 110
    :cond_3
    :goto_1
    iput-boolean v3, v0, Lbsh/BSHReturnType;->isVoid:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 111
    .line 112
    return-void

    .line 113
    :cond_4
    :goto_2
    :try_start_2
    invoke-virtual {p0}, Lbsh/Parser;->Type()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 114
    .line 115
    .line 116
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 117
    .line 118
    invoke-virtual {v1, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 119
    .line 120
    .line 121
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 122
    .line 123
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_5

    .line 128
    .line 129
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 130
    .line 131
    .line 132
    :cond_5
    return-void

    .line 133
    :goto_3
    iget-object v5, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 134
    .line 135
    if-eqz v4, :cond_6

    .line 136
    .line 137
    :try_start_3
    invoke-virtual {v5, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V

    .line 138
    .line 139
    .line 140
    goto :goto_4

    .line 141
    :catchall_2
    move-exception v1

    .line 142
    goto :goto_5

    .line 143
    :cond_6
    invoke-virtual {v5}, Lbsh/JJTParserState;->popNode()Lbsh/Node;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 144
    .line 145
    .line 146
    move v2, v4

    .line 147
    :goto_4
    :try_start_4
    instance-of v4, v1, Lbsh/ParseException;

    .line 148
    .line 149
    if-nez v4, :cond_8

    .line 150
    .line 151
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 152
    .line 153
    if-eqz v4, :cond_7

    .line 154
    .line 155
    check-cast v1, Ljava/lang/RuntimeException;

    .line 156
    .line 157
    throw v1

    .line 158
    :catchall_3
    move-exception v1

    .line 159
    move v4, v2

    .line 160
    goto :goto_5

    .line 161
    :cond_7
    check-cast v1, Ljava/lang/Error;

    .line 162
    .line 163
    throw v1

    .line 164
    :cond_8
    check-cast v1, Lbsh/ParseException;

    .line 165
    .line 166
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 167
    :goto_5
    if-eqz v4, :cond_9

    .line 168
    .line 169
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 170
    .line 171
    invoke-virtual {v2, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 172
    .line 173
    .line 174
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 175
    .line 176
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-eqz v2, :cond_9

    .line 181
    .line 182
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 183
    .line 184
    .line 185
    :cond_9
    throw v1
.end method

.method public final ShiftExpression()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lbsh/Parser;->AdditiveExpression()V

    .line 2
    .line 3
    .line 4
    :goto_0
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :cond_0
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 17
    .line 18
    const/16 v1, 0x37

    .line 19
    .line 20
    iget v2, p0, Lbsh/Parser;->jj_gen:I

    .line 21
    .line 22
    aput v2, v0, v1

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 26
    .line 27
    if-ne v0, v1, :cond_1

    .line 28
    .line 29
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    :cond_1
    packed-switch v0, :pswitch_data_1

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 37
    .line 38
    const/16 v2, 0x38

    .line 39
    .line 40
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 41
    .line 42
    aput v3, v0, v2

    .line 43
    .line 44
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lbsh/j;->a()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_1
    const/16 v0, 0x7b

    .line 52
    .line 53
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    goto :goto_1

    .line 58
    :pswitch_2
    const/16 v0, 0x7a

    .line 59
    .line 60
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    goto :goto_1

    .line 65
    :pswitch_3
    const/16 v0, 0x79

    .line 66
    .line 67
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    goto :goto_1

    .line 72
    :pswitch_4
    const/16 v0, 0x78

    .line 73
    .line 74
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    goto :goto_1

    .line 79
    :pswitch_5
    const/16 v0, 0x77

    .line 80
    .line 81
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    goto :goto_1

    .line 86
    :pswitch_6
    const/16 v0, 0x76

    .line 87
    .line 88
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    :goto_1
    invoke-virtual {p0}, Lbsh/Parser;->AdditiveExpression()V

    .line 93
    .line 94
    .line 95
    new-instance v1, Lbsh/BSHBinaryExpression;

    .line 96
    .line 97
    const/16 v2, 0x11

    .line 98
    .line 99
    invoke-direct {v1, v2}, Lbsh/BSHBinaryExpression;-><init>(I)V

    .line 100
    .line 101
    .line 102
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 103
    .line 104
    invoke-virtual {v2, v1}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 108
    .line 109
    .line 110
    const/4 v2, 0x2

    .line 111
    const/4 v3, 0x1

    .line 112
    :try_start_0
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 113
    .line 114
    invoke-virtual {v4, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 115
    .line 116
    .line 117
    const/4 v3, 0x0

    .line 118
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 119
    .line 120
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-eqz v4, :cond_2

    .line 125
    .line 126
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :catchall_0
    move-exception v0

    .line 131
    goto :goto_3

    .line 132
    :cond_2
    :goto_2
    iget v0, v0, Lbsh/Token;->kind:I

    .line 133
    .line 134
    iput v0, v1, Lbsh/BSHBinaryExpression;->kind:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    .line 136
    goto/16 :goto_0

    .line 137
    .line 138
    :goto_3
    if-eqz v3, :cond_3

    .line 139
    .line 140
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 141
    .line 142
    invoke-virtual {v3, v1, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 143
    .line 144
    .line 145
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 146
    .line 147
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-eqz v2, :cond_3

    .line 152
    .line 153
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 154
    .line 155
    .line 156
    :cond_3
    throw v0

    .line 157
    :pswitch_data_0
    .packed-switch 0x76
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    :pswitch_data_1
    .packed-switch 0x76
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final Statement()V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_2_26(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lbsh/Parser;->LabeledStatement()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v0, 0x3

    .line 13
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_2_27(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Lbsh/Parser;->Block()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 24
    .line 25
    const/4 v1, -0x1

    .line 26
    if-ne v0, v1, :cond_2

    .line 27
    .line 28
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    :cond_2
    sparse-switch v0, :sswitch_data_0

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 36
    .line 37
    const/16 v2, 0x61

    .line 38
    .line 39
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 40
    .line 41
    aput v3, v0, v2

    .line 42
    .line 43
    invoke-virtual {p0}, Lbsh/Parser;->isRegularForStatement()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0}, Lbsh/Parser;->ForStatement()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_3
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 54
    .line 55
    if-ne v0, v1, :cond_4

    .line 56
    .line 57
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    :cond_4
    const/16 v2, 0xd

    .line 62
    .line 63
    if-eq v0, v2, :cond_b

    .line 64
    .line 65
    const/16 v2, 0x14

    .line 66
    .line 67
    if-eq v0, v2, :cond_a

    .line 68
    .line 69
    const/16 v2, 0x1f

    .line 70
    .line 71
    if-eq v0, v2, :cond_9

    .line 72
    .line 73
    const/16 v2, 0x2f

    .line 74
    .line 75
    if-eq v0, v2, :cond_8

    .line 76
    .line 77
    const/16 v2, 0x34

    .line 78
    .line 79
    if-eq v0, v2, :cond_7

    .line 80
    .line 81
    const/16 v2, 0x36

    .line 82
    .line 83
    if-eq v0, v2, :cond_6

    .line 84
    .line 85
    const/16 v2, 0x39

    .line 86
    .line 87
    if-ne v0, v2, :cond_5

    .line 88
    .line 89
    invoke-virtual {p0}, Lbsh/Parser;->TryStatement()V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_5
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 94
    .line 95
    const/16 v2, 0x62

    .line 96
    .line 97
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 98
    .line 99
    aput v3, v0, v2

    .line 100
    .line 101
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 102
    .line 103
    .line 104
    invoke-static {}, Lbsh/j;->a()V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_6
    invoke-virtual {p0}, Lbsh/Parser;->ThrowStatement()V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_7
    invoke-virtual {p0}, Lbsh/Parser;->SynchronizedStatement()V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_8
    invoke-virtual {p0}, Lbsh/Parser;->ReturnStatement()V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_9
    invoke-virtual {p0}, Lbsh/Parser;->EnhancedForStatement()V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_a
    invoke-virtual {p0}, Lbsh/Parser;->ContinueStatement()V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_b
    invoke-virtual {p0}, Lbsh/Parser;->BreakStatement()V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :sswitch_0
    invoke-virtual {p0}, Lbsh/Parser;->EmptyStatement()V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :sswitch_1
    invoke-virtual {p0}, Lbsh/Parser;->WhileStatement()V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :sswitch_2
    invoke-virtual {p0}, Lbsh/Parser;->SwitchStatement()V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :sswitch_3
    invoke-virtual {p0}, Lbsh/Parser;->IfStatement()V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :sswitch_4
    invoke-virtual {p0}, Lbsh/Parser;->DoStatement()V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :sswitch_5
    invoke-virtual {p0}, Lbsh/Parser;->StatementExpression()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Lbsh/Parser;->StatementTerminator()V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_5
        0xf -> :sswitch_5
        0x12 -> :sswitch_5
        0x16 -> :sswitch_4
        0x17 -> :sswitch_5
        0x1b -> :sswitch_5
        0x1e -> :sswitch_5
        0x21 -> :sswitch_3
        0x25 -> :sswitch_5
        0x27 -> :sswitch_5
        0x29 -> :sswitch_5
        0x2a -> :sswitch_5
        0x30 -> :sswitch_5
        0x33 -> :sswitch_2
        0x38 -> :sswitch_5
        0x3a -> :sswitch_5
        0x3c -> :sswitch_5
        0x3d -> :sswitch_1
        0x3e -> :sswitch_5
        0x43 -> :sswitch_5
        0x46 -> :sswitch_5
        0x47 -> :sswitch_5
        0x48 -> :sswitch_5
        0x49 -> :sswitch_5
        0x4c -> :sswitch_5
        0x4e -> :sswitch_5
        0x50 -> :sswitch_5
        0x52 -> :sswitch_0
        0x5a -> :sswitch_5
        0x5b -> :sswitch_5
        0x66 -> :sswitch_5
        0x67 -> :sswitch_5
        0x68 -> :sswitch_5
        0x69 -> :sswitch_5
    .end sparse-switch
.end method

.method public final StatementExpression()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final StatementExpressionList()V
    .locals 5

    .line 1
    new-instance v0, Lbsh/BSHStatementExpressionList;

    .line 2
    .line 3
    const/16 v1, 0x26

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHStatementExpressionList;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    :try_start_0
    invoke-virtual {p0}, Lbsh/Parser;->StatementExpression()V

    .line 18
    .line 19
    .line 20
    :goto_0
    iget v2, p0, Lbsh/Parser;->jj_ntk:I

    .line 21
    .line 22
    const/4 v3, -0x1

    .line 23
    if-ne v2, v3, :cond_0

    .line 24
    .line 25
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception v2

    .line 31
    goto :goto_2

    .line 32
    :cond_0
    :goto_1
    const/16 v3, 0x53

    .line 33
    .line 34
    if-eq v2, v3, :cond_2

    .line 35
    .line 36
    iget-object v2, p0, Lbsh/Parser;->jj_la1:[I

    .line 37
    .line 38
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 39
    .line 40
    const/16 v4, 0x72

    .line 41
    .line 42
    aput v3, v2, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 45
    .line 46
    invoke-virtual {v2, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 50
    .line 51
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_1

    .line 56
    .line 57
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    return-void

    .line 61
    :cond_2
    :try_start_1
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lbsh/Parser;->StatementExpression()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :goto_2
    :try_start_2
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 69
    .line 70
    invoke-virtual {v3, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 71
    .line 72
    .line 73
    const/4 v3, 0x0

    .line 74
    :try_start_3
    instance-of v4, v2, Lbsh/ParseException;

    .line 75
    .line 76
    if-nez v4, :cond_4

    .line 77
    .line 78
    instance-of v4, v2, Ljava/lang/RuntimeException;

    .line 79
    .line 80
    if-eqz v4, :cond_3

    .line 81
    .line 82
    check-cast v2, Ljava/lang/RuntimeException;

    .line 83
    .line 84
    throw v2

    .line 85
    :catchall_1
    move-exception v2

    .line 86
    goto :goto_3

    .line 87
    :cond_3
    check-cast v2, Ljava/lang/Error;

    .line 88
    .line 89
    throw v2

    .line 90
    :cond_4
    check-cast v2, Lbsh/ParseException;

    .line 91
    .line 92
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 93
    :catchall_2
    move-exception v2

    .line 94
    move v3, v1

    .line 95
    :goto_3
    if-eqz v3, :cond_5

    .line 96
    .line 97
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 98
    .line 99
    invoke-virtual {v3, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 100
    .line 101
    .line 102
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 103
    .line 104
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_5

    .line 109
    .line 110
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 111
    .line 112
    .line 113
    :cond_5
    throw v2
.end method

.method public final StatementTerminator()V
    .locals 3

    .line 1
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    :cond_0
    const/16 v1, 0x52

    .line 11
    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 15
    .line 16
    const/16 v1, 0x66

    .line 17
    .line 18
    iget v2, p0, Lbsh/Parser;->jj_gen:I

    .line 19
    .line 20
    aput v2, v0, v1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final SwitchLabel()V
    .locals 7

    .line 1
    new-instance v0, Lbsh/BSHSwitchLabel;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHSwitchLabel;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    :try_start_0
    iget v3, p0, Lbsh/Parser;->jj_ntk:I

    .line 19
    .line 20
    const/4 v4, -0x1

    .line 21
    if-ne v3, v4, :cond_0

    .line 22
    .line 23
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v3

    .line 29
    move v4, v2

    .line 30
    goto :goto_2

    .line 31
    :cond_0
    :goto_0
    const/16 v5, 0x10

    .line 32
    .line 33
    if-eq v3, v5, :cond_3

    .line 34
    .line 35
    const/16 v5, 0x9a

    .line 36
    .line 37
    if-ne v3, v5, :cond_2

    .line 38
    .line 39
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 40
    .line 41
    .line 42
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 43
    .line 44
    invoke-virtual {v3, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    :try_start_1
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 48
    .line 49
    invoke-virtual {v3}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catchall_1
    move-exception v3

    .line 60
    move v4, v1

    .line 61
    goto :goto_2

    .line 62
    :cond_1
    :goto_1
    iput-boolean v2, v0, Lbsh/BSHSwitchLabel;->isDefault:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    :try_start_2
    iget-object v3, p0, Lbsh/Parser;->jj_la1:[I

    .line 66
    .line 67
    iget v5, p0, Lbsh/Parser;->jj_gen:I

    .line 68
    .line 69
    const/16 v6, 0x68

    .line 70
    .line 71
    aput v5, v3, v6

    .line 72
    .line 73
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 74
    .line 75
    .line 76
    new-instance v3, Lbsh/ParseException;

    .line 77
    .line 78
    invoke-direct {v3}, Lbsh/ParseException;-><init>()V

    .line 79
    .line 80
    .line 81
    throw v3

    .line 82
    :cond_3
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V

    .line 86
    .line 87
    .line 88
    const/16 v3, 0x96

    .line 89
    .line 90
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 91
    .line 92
    .line 93
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 94
    .line 95
    invoke-virtual {v1, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 99
    .line 100
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 107
    .line 108
    .line 109
    :cond_4
    return-void

    .line 110
    :goto_2
    iget-object v5, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 111
    .line 112
    if-eqz v4, :cond_5

    .line 113
    .line 114
    :try_start_3
    invoke-virtual {v5, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V

    .line 115
    .line 116
    .line 117
    goto :goto_3

    .line 118
    :catchall_2
    move-exception v1

    .line 119
    goto :goto_4

    .line 120
    :cond_5
    invoke-virtual {v5}, Lbsh/JJTParserState;->popNode()Lbsh/Node;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 121
    .line 122
    .line 123
    move v1, v4

    .line 124
    :goto_3
    :try_start_4
    instance-of v4, v3, Lbsh/ParseException;

    .line 125
    .line 126
    if-nez v4, :cond_7

    .line 127
    .line 128
    instance-of v4, v3, Ljava/lang/RuntimeException;

    .line 129
    .line 130
    if-eqz v4, :cond_6

    .line 131
    .line 132
    check-cast v3, Ljava/lang/RuntimeException;

    .line 133
    .line 134
    throw v3

    .line 135
    :catchall_3
    move-exception v3

    .line 136
    move v4, v1

    .line 137
    move-object v1, v3

    .line 138
    goto :goto_4

    .line 139
    :cond_6
    check-cast v3, Ljava/lang/Error;

    .line 140
    .line 141
    throw v3

    .line 142
    :cond_7
    check-cast v3, Lbsh/ParseException;

    .line 143
    .line 144
    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 145
    :goto_4
    if-eqz v4, :cond_8

    .line 146
    .line 147
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 148
    .line 149
    invoke-virtual {v3, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 150
    .line 151
    .line 152
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 153
    .line 154
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-eqz v2, :cond_8

    .line 159
    .line 160
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 161
    .line 162
    .line 163
    :cond_8
    throw v1
.end method

.method public final SwitchStatement()V
    .locals 5

    .line 1
    new-instance v0, Lbsh/BSHSwitchStatement;

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHSwitchStatement;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x33

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    :try_start_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 20
    .line 21
    .line 22
    const/16 v1, 0x4c

    .line 23
    .line 24
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V

    .line 28
    .line 29
    .line 30
    const/16 v1, 0x4d

    .line 31
    .line 32
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 33
    .line 34
    .line 35
    const/16 v1, 0x4e

    .line 36
    .line 37
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 38
    .line 39
    .line 40
    :cond_0
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 41
    .line 42
    const/4 v3, -0x1

    .line 43
    if-ne v1, v3, :cond_1

    .line 44
    .line 45
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception v1

    .line 51
    goto :goto_2

    .line 52
    :cond_1
    :goto_0
    const/16 v3, 0x10

    .line 53
    .line 54
    if-eq v1, v3, :cond_3

    .line 55
    .line 56
    const/16 v3, 0x9a

    .line 57
    .line 58
    if-eq v1, v3, :cond_3

    .line 59
    .line 60
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 61
    .line 62
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 63
    .line 64
    const/16 v4, 0x67

    .line 65
    .line 66
    aput v3, v1, v4

    .line 67
    .line 68
    const/16 v1, 0x4f

    .line 69
    .line 70
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 74
    .line 75
    invoke-virtual {v1, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 79
    .line 80
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_2

    .line 85
    .line 86
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 87
    .line 88
    .line 89
    :cond_2
    return-void

    .line 90
    :cond_3
    :try_start_1
    invoke-virtual {p0}, Lbsh/Parser;->SwitchLabel()V

    .line 91
    .line 92
    .line 93
    :goto_1
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_2_34(I)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_0

    .line 98
    .line 99
    invoke-virtual {p0}, Lbsh/Parser;->BlockStatement()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :goto_2
    :try_start_2
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 104
    .line 105
    invoke-virtual {v3, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 106
    .line 107
    .line 108
    const/4 v3, 0x0

    .line 109
    :try_start_3
    instance-of v4, v1, Lbsh/ParseException;

    .line 110
    .line 111
    if-nez v4, :cond_5

    .line 112
    .line 113
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 114
    .line 115
    if-eqz v4, :cond_4

    .line 116
    .line 117
    check-cast v1, Ljava/lang/RuntimeException;

    .line 118
    .line 119
    throw v1

    .line 120
    :catchall_1
    move-exception v1

    .line 121
    goto :goto_3

    .line 122
    :cond_4
    check-cast v1, Ljava/lang/Error;

    .line 123
    .line 124
    throw v1

    .line 125
    :cond_5
    check-cast v1, Lbsh/ParseException;

    .line 126
    .line 127
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 128
    :catchall_2
    move-exception v1

    .line 129
    move v3, v2

    .line 130
    :goto_3
    if-eqz v3, :cond_6

    .line 131
    .line 132
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 133
    .line 134
    invoke-virtual {v3, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 135
    .line 136
    .line 137
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 138
    .line 139
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-eqz v2, :cond_6

    .line 144
    .line 145
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 146
    .line 147
    .line 148
    :cond_6
    throw v1
.end method

.method public final SynchronizedStatement()V
    .locals 6

    .line 1
    new-instance v0, Lbsh/BSHBlock;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lbsh/BSHBlock;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x34

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    :try_start_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 20
    .line 21
    .line 22
    const/16 v1, 0x4c

    .line 23
    .line 24
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V

    .line 28
    .line 29
    .line 30
    const/16 v1, 0x4d

    .line 31
    .line 32
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lbsh/Parser;->Block()V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 39
    .line 40
    invoke-virtual {v1, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 41
    .line 42
    .line 43
    :try_start_1
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 44
    .line 45
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception v1

    .line 56
    move v4, v2

    .line 57
    goto :goto_1

    .line 58
    :cond_0
    :goto_0
    iput-boolean v3, v0, Lbsh/BSHBlock;->isSynchronized:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    .line 60
    return-void

    .line 61
    :catchall_1
    move-exception v1

    .line 62
    move v4, v3

    .line 63
    :goto_1
    iget-object v5, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 64
    .line 65
    if-eqz v4, :cond_1

    .line 66
    .line 67
    :try_start_2
    invoke-virtual {v5, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :catchall_2
    move-exception v1

    .line 72
    goto :goto_3

    .line 73
    :cond_1
    invoke-virtual {v5}, Lbsh/JJTParserState;->popNode()Lbsh/Node;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 74
    .line 75
    .line 76
    move v2, v4

    .line 77
    :goto_2
    :try_start_3
    instance-of v4, v1, Lbsh/ParseException;

    .line 78
    .line 79
    if-nez v4, :cond_3

    .line 80
    .line 81
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 82
    .line 83
    if-eqz v4, :cond_2

    .line 84
    .line 85
    check-cast v1, Ljava/lang/RuntimeException;

    .line 86
    .line 87
    throw v1

    .line 88
    :catchall_3
    move-exception v1

    .line 89
    move v4, v2

    .line 90
    goto :goto_3

    .line 91
    :cond_2
    check-cast v1, Ljava/lang/Error;

    .line 92
    .line 93
    throw v1

    .line 94
    :cond_3
    check-cast v1, Lbsh/ParseException;

    .line 95
    .line 96
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 97
    :goto_3
    if-eqz v4, :cond_4

    .line 98
    .line 99
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 100
    .line 101
    invoke-virtual {v2, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 102
    .line 103
    .line 104
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 105
    .line 106
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_4

    .line 111
    .line 112
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 113
    .line 114
    .line 115
    :cond_4
    throw v1
.end method

.method public final ThrowStatement()V
    .locals 5

    .line 1
    new-instance v0, Lbsh/BSHThrowStatement;

    .line 2
    .line 3
    const/16 v1, 0x28

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHThrowStatement;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x36

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    :try_start_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lbsh/Parser;->StatementTerminator()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 34
    .line 35
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void

    .line 45
    :catchall_0
    move-exception v1

    .line 46
    :try_start_1
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 47
    .line 48
    invoke-virtual {v3, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 49
    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    :try_start_2
    instance-of v4, v1, Lbsh/ParseException;

    .line 53
    .line 54
    if-nez v4, :cond_2

    .line 55
    .line 56
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 57
    .line 58
    if-eqz v4, :cond_1

    .line 59
    .line 60
    check-cast v1, Ljava/lang/RuntimeException;

    .line 61
    .line 62
    throw v1

    .line 63
    :catchall_1
    move-exception v1

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    check-cast v1, Ljava/lang/Error;

    .line 66
    .line 67
    throw v1

    .line 68
    :cond_2
    check-cast v1, Lbsh/ParseException;

    .line 69
    .line 70
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 71
    :catchall_2
    move-exception v1

    .line 72
    move v3, v2

    .line 73
    :goto_0
    if-eqz v3, :cond_3

    .line 74
    .line 75
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 76
    .line 77
    invoke-virtual {v3, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 78
    .line 79
    .line 80
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 81
    .line 82
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_3

    .line 87
    .line 88
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 89
    .line 90
    .line 91
    :cond_3
    throw v1
.end method

.method public final TryStatement()V
    .locals 8

    .line 1
    new-instance v0, Lbsh/BSHTryStatement;

    .line 2
    .line 3
    const/16 v1, 0x29

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHTryStatement;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x39

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    const/4 v3, 0x0

    .line 20
    :try_start_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 21
    .line 22
    .line 23
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 24
    .line 25
    const/4 v4, -0x1

    .line 26
    if-ne v1, v4, :cond_0

    .line 27
    .line 28
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    move v4, v2

    .line 35
    goto/16 :goto_5

    .line 36
    .line 37
    :cond_0
    :goto_0
    const/16 v5, 0x4c

    .line 38
    .line 39
    if-eq v1, v5, :cond_1

    .line 40
    .line 41
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 42
    .line 43
    iget v6, p0, Lbsh/Parser;->jj_gen:I

    .line 44
    .line 45
    const/16 v7, 0x73

    .line 46
    .line 47
    aput v6, v1, v7

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-virtual {p0}, Lbsh/Parser;->TryWithResources()V

    .line 51
    .line 52
    .line 53
    :goto_1
    invoke-virtual {p0}, Lbsh/Parser;->Block()V

    .line 54
    .line 55
    .line 56
    move v1, v3

    .line 57
    :goto_2
    iget v6, p0, Lbsh/Parser;->jj_ntk:I

    .line 58
    .line 59
    if-ne v6, v4, :cond_2

    .line 60
    .line 61
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    :cond_2
    const/16 v7, 0x11

    .line 66
    .line 67
    if-eq v6, v7, :cond_7

    .line 68
    .line 69
    iget-object v5, p0, Lbsh/Parser;->jj_la1:[I

    .line 70
    .line 71
    iget v6, p0, Lbsh/Parser;->jj_gen:I

    .line 72
    .line 73
    const/16 v7, 0x74

    .line 74
    .line 75
    aput v6, v5, v7

    .line 76
    .line 77
    iget v5, p0, Lbsh/Parser;->jj_ntk:I

    .line 78
    .line 79
    if-ne v5, v4, :cond_3

    .line 80
    .line 81
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    :cond_3
    const/16 v4, 0x1d

    .line 86
    .line 87
    if-eq v5, v4, :cond_4

    .line 88
    .line 89
    iget-object v4, p0, Lbsh/Parser;->jj_la1:[I

    .line 90
    .line 91
    iget v5, p0, Lbsh/Parser;->jj_gen:I

    .line 92
    .line 93
    const/16 v6, 0x75

    .line 94
    .line 95
    aput v5, v4, v6

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_4
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Lbsh/Parser;->Block()V

    .line 102
    .line 103
    .line 104
    move v1, v2

    .line 105
    :goto_3
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 106
    .line 107
    invoke-virtual {v4, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    .line 109
    .line 110
    :try_start_1
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 111
    .line 112
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-eqz v4, :cond_5

    .line 117
    .line 118
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 119
    .line 120
    .line 121
    goto :goto_4

    .line 122
    :catchall_1
    move-exception v1

    .line 123
    move v4, v3

    .line 124
    goto :goto_5

    .line 125
    :cond_5
    :goto_4
    if-eqz v1, :cond_6

    .line 126
    .line 127
    return-void

    .line 128
    :cond_6
    invoke-virtual {p0}, Lbsh/Parser;->generateParseException()Lbsh/ParseException;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 133
    :cond_7
    :try_start_2
    invoke-direct {p0, v7}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 134
    .line 135
    .line 136
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Lbsh/Parser;->MultiCatch()V

    .line 140
    .line 141
    .line 142
    const/16 v1, 0x4d

    .line 143
    .line 144
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Lbsh/Parser;->Block()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 148
    .line 149
    .line 150
    move v1, v2

    .line 151
    goto :goto_2

    .line 152
    :goto_5
    iget-object v5, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 153
    .line 154
    if-eqz v4, :cond_8

    .line 155
    .line 156
    :try_start_3
    invoke-virtual {v5, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V

    .line 157
    .line 158
    .line 159
    goto :goto_6

    .line 160
    :catchall_2
    move-exception v1

    .line 161
    goto :goto_7

    .line 162
    :cond_8
    invoke-virtual {v5}, Lbsh/JJTParserState;->popNode()Lbsh/Node;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 163
    .line 164
    .line 165
    move v3, v4

    .line 166
    :goto_6
    :try_start_4
    instance-of v4, v1, Lbsh/ParseException;

    .line 167
    .line 168
    if-nez v4, :cond_a

    .line 169
    .line 170
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 171
    .line 172
    if-eqz v4, :cond_9

    .line 173
    .line 174
    check-cast v1, Ljava/lang/RuntimeException;

    .line 175
    .line 176
    throw v1

    .line 177
    :catchall_3
    move-exception v1

    .line 178
    move v4, v3

    .line 179
    goto :goto_7

    .line 180
    :cond_9
    check-cast v1, Ljava/lang/Error;

    .line 181
    .line 182
    throw v1

    .line 183
    :cond_a
    check-cast v1, Lbsh/ParseException;

    .line 184
    .line 185
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 186
    :goto_7
    if-eqz v4, :cond_b

    .line 187
    .line 188
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 189
    .line 190
    invoke-virtual {v3, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 191
    .line 192
    .line 193
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 194
    .line 195
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    if-eqz v2, :cond_b

    .line 200
    .line 201
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 202
    .line 203
    .line 204
    :cond_b
    throw v1
.end method

.method public final TryWithResources()V
    .locals 5

    .line 1
    new-instance v0, Lbsh/BSHTryWithResources;

    .line 2
    .line 3
    const/16 v1, 0x2b

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHTryWithResources;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x4c

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    :try_start_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lbsh/Parser;->AutoCloseable()V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget v1, p0, Lbsh/Parser;->jj_ntk:I

    .line 26
    .line 27
    const/4 v3, -0x1

    .line 28
    if-ne v1, v3, :cond_0

    .line 29
    .line 30
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    goto :goto_1

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    :goto_1
    const/16 v3, 0x52

    .line 38
    .line 39
    if-eq v1, v3, :cond_2

    .line 40
    .line 41
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 42
    .line 43
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 44
    .line 45
    const/16 v4, 0x79

    .line 46
    .line 47
    aput v3, v1, v4

    .line 48
    .line 49
    const/16 v1, 0x4d

    .line 50
    .line 51
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 55
    .line 56
    invoke-virtual {v1, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 60
    .line 61
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    return-void

    .line 71
    :cond_2
    :try_start_1
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lbsh/Parser;->AutoCloseable()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :goto_2
    :try_start_2
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 79
    .line 80
    invoke-virtual {v3, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 81
    .line 82
    .line 83
    const/4 v3, 0x0

    .line 84
    :try_start_3
    instance-of v4, v1, Lbsh/ParseException;

    .line 85
    .line 86
    if-nez v4, :cond_4

    .line 87
    .line 88
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 89
    .line 90
    if-eqz v4, :cond_3

    .line 91
    .line 92
    check-cast v1, Ljava/lang/RuntimeException;

    .line 93
    .line 94
    throw v1

    .line 95
    :catchall_1
    move-exception v1

    .line 96
    goto :goto_3

    .line 97
    :cond_3
    check-cast v1, Ljava/lang/Error;

    .line 98
    .line 99
    throw v1

    .line 100
    :cond_4
    check-cast v1, Lbsh/ParseException;

    .line 101
    .line 102
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 103
    :catchall_2
    move-exception v1

    .line 104
    move v3, v2

    .line 105
    :goto_3
    if-eqz v3, :cond_5

    .line 106
    .line 107
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 108
    .line 109
    invoke-virtual {v3, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 110
    .line 111
    .line 112
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 113
    .line 114
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_5

    .line 119
    .line 120
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 121
    .line 122
    .line 123
    :cond_5
    throw v1
.end method

.method public final Type()V
    .locals 6

    .line 1
    new-instance v0, Lbsh/BSHType;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHType;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    :try_start_0
    iget v2, p0, Lbsh/Parser;->jj_ntk:I

    .line 18
    .line 19
    const/4 v3, -0x1

    .line 20
    if-ne v2, v3, :cond_0

    .line 21
    .line 22
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v2

    .line 28
    goto :goto_2

    .line 29
    :cond_0
    :goto_0
    const/16 v4, 0xc

    .line 30
    .line 31
    if-eq v2, v4, :cond_2

    .line 32
    .line 33
    const/16 v4, 0xf

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    const/16 v4, 0x12

    .line 38
    .line 39
    if-eq v2, v4, :cond_2

    .line 40
    .line 41
    const/16 v4, 0x17

    .line 42
    .line 43
    if-eq v2, v4, :cond_2

    .line 44
    .line 45
    const/16 v4, 0x1e

    .line 46
    .line 47
    if-eq v2, v4, :cond_2

    .line 48
    .line 49
    const/16 v5, 0x25

    .line 50
    .line 51
    if-eq v2, v5, :cond_2

    .line 52
    .line 53
    const/16 v5, 0x27

    .line 54
    .line 55
    if-eq v2, v5, :cond_2

    .line 56
    .line 57
    const/16 v5, 0x30

    .line 58
    .line 59
    if-eq v2, v5, :cond_2

    .line 60
    .line 61
    const/16 v5, 0x49

    .line 62
    .line 63
    if-ne v2, v5, :cond_1

    .line 64
    .line 65
    invoke-virtual {p0}, Lbsh/Parser;->AmbiguousName()V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    iget-object v2, p0, Lbsh/Parser;->jj_la1:[I

    .line 70
    .line 71
    iget v5, p0, Lbsh/Parser;->jj_gen:I

    .line 72
    .line 73
    aput v5, v2, v4

    .line 74
    .line 75
    invoke-direct {p0, v3}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 76
    .line 77
    .line 78
    new-instance v2, Lbsh/ParseException;

    .line 79
    .line 80
    invoke-direct {v2}, Lbsh/ParseException;-><init>()V

    .line 81
    .line 82
    .line 83
    throw v2

    .line 84
    :cond_2
    invoke-virtual {p0}, Lbsh/Parser;->PrimitiveType()V

    .line 85
    .line 86
    .line 87
    :goto_1
    const/4 v2, 0x2

    .line 88
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_2_8(I)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_3

    .line 93
    .line 94
    const/16 v2, 0x50

    .line 95
    .line 96
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 97
    .line 98
    .line 99
    const/16 v2, 0x51

    .line 100
    .line 101
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Lbsh/BSHType;->addArrayDimension()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_3
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 109
    .line 110
    invoke-virtual {v2, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 111
    .line 112
    .line 113
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 114
    .line 115
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_4

    .line 120
    .line 121
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 122
    .line 123
    .line 124
    :cond_4
    return-void

    .line 125
    :goto_2
    :try_start_1
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 126
    .line 127
    invoke-virtual {v3, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 128
    .line 129
    .line 130
    const/4 v3, 0x0

    .line 131
    :try_start_2
    instance-of v4, v2, Lbsh/ParseException;

    .line 132
    .line 133
    if-nez v4, :cond_6

    .line 134
    .line 135
    instance-of v4, v2, Ljava/lang/RuntimeException;

    .line 136
    .line 137
    if-eqz v4, :cond_5

    .line 138
    .line 139
    check-cast v2, Ljava/lang/RuntimeException;

    .line 140
    .line 141
    throw v2

    .line 142
    :catchall_1
    move-exception v2

    .line 143
    goto :goto_3

    .line 144
    :cond_5
    check-cast v2, Ljava/lang/Error;

    .line 145
    .line 146
    throw v2

    .line 147
    :cond_6
    check-cast v2, Lbsh/ParseException;

    .line 148
    .line 149
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 150
    :catchall_2
    move-exception v2

    .line 151
    move v3, v1

    .line 152
    :goto_3
    if-eqz v3, :cond_7

    .line 153
    .line 154
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 155
    .line 156
    invoke-virtual {v3, v0, v1}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 157
    .line 158
    .line 159
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 160
    .line 161
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-eqz v1, :cond_7

    .line 166
    .line 167
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 168
    .line 169
    .line 170
    :cond_7
    throw v2
.end method

.method public final TypedVariableDeclaration()V
    .locals 7

    .line 1
    new-instance v0, Lbsh/BSHTypedVariableDeclaration;

    .line 2
    .line 3
    const/16 v1, 0x25

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHTypedVariableDeclaration;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x3

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    :try_start_0
    invoke-virtual {p0, v1, v2}, Lbsh/Parser;->Modifiers(IZ)Lbsh/Modifiers;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p0}, Lbsh/Parser;->Type()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lbsh/Parser;->VariableDeclarator()V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget v4, p0, Lbsh/Parser;->jj_ntk:I

    .line 30
    .line 31
    const/4 v5, -0x1

    .line 32
    if-ne v4, v5, :cond_0

    .line 33
    .line 34
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    goto :goto_1

    .line 39
    :catchall_0
    move-exception v1

    .line 40
    move v4, v3

    .line 41
    goto :goto_3

    .line 42
    :cond_0
    :goto_1
    const/16 v5, 0x53

    .line 43
    .line 44
    if-eq v4, v5, :cond_3

    .line 45
    .line 46
    iget-object v4, p0, Lbsh/Parser;->jj_la1:[I

    .line 47
    .line 48
    iget v5, p0, Lbsh/Parser;->jj_gen:I

    .line 49
    .line 50
    const/16 v6, 0x71

    .line 51
    .line 52
    aput v5, v4, v6

    .line 53
    .line 54
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 55
    .line 56
    invoke-virtual {v4, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    :try_start_1
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 60
    .line 61
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_1

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :catchall_1
    move-exception v1

    .line 72
    move v4, v2

    .line 73
    goto :goto_3

    .line 74
    :cond_1
    :goto_2
    if-eqz v1, :cond_2

    .line 75
    .line 76
    iput-object v1, v0, Lbsh/BSHTypedVariableDeclaration;->modifiers:Lbsh/Modifiers;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    .line 78
    :cond_2
    return-void

    .line 79
    :cond_3
    :try_start_2
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lbsh/Parser;->VariableDeclarator()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :goto_3
    iget-object v5, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 87
    .line 88
    if-eqz v4, :cond_4

    .line 89
    .line 90
    :try_start_3
    invoke-virtual {v5, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V

    .line 91
    .line 92
    .line 93
    goto :goto_4

    .line 94
    :catchall_2
    move-exception v1

    .line 95
    goto :goto_5

    .line 96
    :cond_4
    invoke-virtual {v5}, Lbsh/JJTParserState;->popNode()Lbsh/Node;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 97
    .line 98
    .line 99
    move v2, v4

    .line 100
    :goto_4
    :try_start_4
    instance-of v4, v1, Lbsh/ParseException;

    .line 101
    .line 102
    if-nez v4, :cond_6

    .line 103
    .line 104
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 105
    .line 106
    if-eqz v4, :cond_5

    .line 107
    .line 108
    check-cast v1, Ljava/lang/RuntimeException;

    .line 109
    .line 110
    throw v1

    .line 111
    :catchall_3
    move-exception v1

    .line 112
    move v4, v2

    .line 113
    goto :goto_5

    .line 114
    :cond_5
    check-cast v1, Ljava/lang/Error;

    .line 115
    .line 116
    throw v1

    .line 117
    :cond_6
    check-cast v1, Lbsh/ParseException;

    .line 118
    .line 119
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 120
    :goto_5
    if-eqz v4, :cond_7

    .line 121
    .line 122
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 123
    .line 124
    invoke-virtual {v2, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 125
    .line 126
    .line 127
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 128
    .line 129
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_7

    .line 134
    .line 135
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 136
    .line 137
    .line 138
    :cond_7
    throw v1
.end method

.method public final UnaryExpression()V
    .locals 9

    .line 1
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    :cond_0
    const/4 v2, 0x0

    .line 11
    const/16 v3, 0x12

    .line 12
    .line 13
    const/16 v4, 0x5b

    .line 14
    .line 15
    const/16 v5, 0x5a

    .line 16
    .line 17
    const/4 v6, 0x1

    .line 18
    if-eq v0, v5, :cond_10

    .line 19
    .line 20
    if-eq v0, v4, :cond_10

    .line 21
    .line 22
    const/16 v7, 0x67

    .line 23
    .line 24
    const/16 v8, 0x66

    .line 25
    .line 26
    packed-switch v0, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 30
    .line 31
    const/16 v4, 0x43

    .line 32
    .line 33
    iget v5, p0, Lbsh/Parser;->jj_gen:I

    .line 34
    .line 35
    aput v5, v0, v4

    .line 36
    .line 37
    const v0, 0x7fffffff

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_2_13(I)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0}, Lbsh/Parser;->LambdaExpression()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_2_14(I)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0}, Lbsh/Parser;->CastExpression()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 61
    .line 62
    if-ne v0, v1, :cond_3

    .line 63
    .line 64
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    :cond_3
    sparse-switch v0, :sswitch_data_0

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 72
    .line 73
    const/16 v2, 0x44

    .line 74
    .line 75
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 76
    .line 77
    aput v3, v0, v2

    .line 78
    .line 79
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 80
    .line 81
    .line 82
    invoke-static {}, Lbsh/j;->a()V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :sswitch_0
    invoke-virtual {p0}, Lbsh/Parser;->PrimaryExpression()V

    .line 87
    .line 88
    .line 89
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 90
    .line 91
    if-ne v0, v1, :cond_4

    .line 92
    .line 93
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    :cond_4
    if-eq v0, v8, :cond_5

    .line 98
    .line 99
    if-eq v0, v7, :cond_5

    .line 100
    .line 101
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 102
    .line 103
    const/16 v1, 0x42

    .line 104
    .line 105
    iget v2, p0, Lbsh/Parser;->jj_gen:I

    .line 106
    .line 107
    aput v2, v0, v1

    .line 108
    .line 109
    return-void

    .line 110
    :cond_5
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 111
    .line 112
    if-ne v0, v1, :cond_6

    .line 113
    .line 114
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    :cond_6
    if-eq v0, v8, :cond_8

    .line 119
    .line 120
    if-ne v0, v7, :cond_7

    .line 121
    .line 122
    invoke-direct {p0, v7}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    goto :goto_0

    .line 127
    :cond_7
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 128
    .line 129
    const/16 v2, 0x41

    .line 130
    .line 131
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 132
    .line 133
    aput v3, v0, v2

    .line 134
    .line 135
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 136
    .line 137
    .line 138
    invoke-static {}, Lbsh/j;->a()V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_8
    invoke-direct {p0, v8}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    :goto_0
    new-instance v1, Lbsh/BSHUnaryExpression;

    .line 147
    .line 148
    invoke-direct {v1, v3}, Lbsh/BSHUnaryExpression;-><init>(I)V

    .line 149
    .line 150
    .line 151
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 152
    .line 153
    invoke-virtual {v3, v1}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 157
    .line 158
    .line 159
    :try_start_0
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 160
    .line 161
    invoke-virtual {v3, v1, v6}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 162
    .line 163
    .line 164
    :try_start_1
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 165
    .line 166
    invoke-virtual {v3}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    if-eqz v3, :cond_9

    .line 171
    .line 172
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :catchall_0
    move-exception v0

    .line 177
    goto :goto_2

    .line 178
    :cond_9
    :goto_1
    iget v0, v0, Lbsh/Token;->kind:I

    .line 179
    .line 180
    iput v0, v1, Lbsh/BSHUnaryExpression;->kind:I

    .line 181
    .line 182
    iput-boolean v6, v1, Lbsh/BSHUnaryExpression;->postfix:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 183
    .line 184
    return-void

    .line 185
    :catchall_1
    move-exception v0

    .line 186
    move v2, v6

    .line 187
    :goto_2
    if-eqz v2, :cond_a

    .line 188
    .line 189
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 190
    .line 191
    invoke-virtual {v2, v1, v6}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 192
    .line 193
    .line 194
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 195
    .line 196
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-eqz v2, :cond_a

    .line 201
    .line 202
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 203
    .line 204
    .line 205
    :cond_a
    throw v0

    .line 206
    :pswitch_0
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 207
    .line 208
    if-ne v0, v1, :cond_b

    .line 209
    .line 210
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    :cond_b
    if-eq v0, v8, :cond_d

    .line 215
    .line 216
    if-ne v0, v7, :cond_c

    .line 217
    .line 218
    invoke-direct {p0, v7}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    goto :goto_3

    .line 223
    :cond_c
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 224
    .line 225
    const/16 v2, 0x40

    .line 226
    .line 227
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 228
    .line 229
    aput v3, v0, v2

    .line 230
    .line 231
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 232
    .line 233
    .line 234
    invoke-static {}, Lbsh/j;->a()V

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    :cond_d
    invoke-direct {p0, v8}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    :goto_3
    invoke-virtual {p0}, Lbsh/Parser;->PrimaryExpression()V

    .line 243
    .line 244
    .line 245
    new-instance v1, Lbsh/BSHUnaryExpression;

    .line 246
    .line 247
    invoke-direct {v1, v3}, Lbsh/BSHUnaryExpression;-><init>(I)V

    .line 248
    .line 249
    .line 250
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 251
    .line 252
    invoke-virtual {v3, v1}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 256
    .line 257
    .line 258
    :try_start_2
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 259
    .line 260
    invoke-virtual {v3, v1, v6}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 261
    .line 262
    .line 263
    :try_start_3
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 264
    .line 265
    invoke-virtual {v3}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    if-eqz v3, :cond_e

    .line 270
    .line 271
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 272
    .line 273
    .line 274
    goto :goto_4

    .line 275
    :catchall_2
    move-exception v0

    .line 276
    goto :goto_5

    .line 277
    :cond_e
    :goto_4
    iget v0, v0, Lbsh/Token;->kind:I

    .line 278
    .line 279
    iput v0, v1, Lbsh/BSHUnaryExpression;->kind:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 280
    .line 281
    return-void

    .line 282
    :catchall_3
    move-exception v0

    .line 283
    move v2, v6

    .line 284
    :goto_5
    if-eqz v2, :cond_f

    .line 285
    .line 286
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 287
    .line 288
    invoke-virtual {v2, v1, v6}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 289
    .line 290
    .line 291
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 292
    .line 293
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    if-eqz v2, :cond_f

    .line 298
    .line 299
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 300
    .line 301
    .line 302
    :cond_f
    throw v0

    .line 303
    :cond_10
    :pswitch_1
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 304
    .line 305
    if-ne v0, v1, :cond_11

    .line 306
    .line 307
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    :cond_11
    if-eq v0, v5, :cond_15

    .line 312
    .line 313
    if-eq v0, v4, :cond_14

    .line 314
    .line 315
    const/16 v4, 0x68

    .line 316
    .line 317
    if-eq v0, v4, :cond_13

    .line 318
    .line 319
    const/16 v4, 0x69

    .line 320
    .line 321
    if-ne v0, v4, :cond_12

    .line 322
    .line 323
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    goto :goto_6

    .line 328
    :cond_12
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 329
    .line 330
    const/16 v2, 0x3f

    .line 331
    .line 332
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 333
    .line 334
    aput v3, v0, v2

    .line 335
    .line 336
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 337
    .line 338
    .line 339
    invoke-static {}, Lbsh/j;->a()V

    .line 340
    .line 341
    .line 342
    return-void

    .line 343
    :cond_13
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    goto :goto_6

    .line 348
    :cond_14
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    goto :goto_6

    .line 353
    :cond_15
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    :goto_6
    invoke-virtual {p0}, Lbsh/Parser;->UnaryExpression()V

    .line 358
    .line 359
    .line 360
    new-instance v1, Lbsh/BSHUnaryExpression;

    .line 361
    .line 362
    invoke-direct {v1, v3}, Lbsh/BSHUnaryExpression;-><init>(I)V

    .line 363
    .line 364
    .line 365
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 366
    .line 367
    invoke-virtual {v3, v1}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 371
    .line 372
    .line 373
    :try_start_4
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 374
    .line 375
    invoke-virtual {v3, v1, v6}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 376
    .line 377
    .line 378
    :try_start_5
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 379
    .line 380
    invoke-virtual {v3}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 381
    .line 382
    .line 383
    move-result v3

    .line 384
    if-eqz v3, :cond_16

    .line 385
    .line 386
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 387
    .line 388
    .line 389
    goto :goto_7

    .line 390
    :catchall_4
    move-exception v0

    .line 391
    goto :goto_8

    .line 392
    :cond_16
    :goto_7
    iget v0, v0, Lbsh/Token;->kind:I

    .line 393
    .line 394
    iput v0, v1, Lbsh/BSHUnaryExpression;->kind:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 395
    .line 396
    return-void

    .line 397
    :catchall_5
    move-exception v0

    .line 398
    move v2, v6

    .line 399
    :goto_8
    if-eqz v2, :cond_17

    .line 400
    .line 401
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 402
    .line 403
    invoke-virtual {v2, v1, v6}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;I)V

    .line 404
    .line 405
    .line 406
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 407
    .line 408
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 409
    .line 410
    .line 411
    move-result v2

    .line 412
    if-eqz v2, :cond_17

    .line 413
    .line 414
    invoke-virtual {p0, v1}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 415
    .line 416
    .line 417
    :cond_17
    throw v0

    .line 418
    nop

    .line 419
    :pswitch_data_0
    .packed-switch 0x66
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch

    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_0
        0xf -> :sswitch_0
        0x12 -> :sswitch_0
        0x17 -> :sswitch_0
        0x1b -> :sswitch_0
        0x1e -> :sswitch_0
        0x25 -> :sswitch_0
        0x27 -> :sswitch_0
        0x29 -> :sswitch_0
        0x2a -> :sswitch_0
        0x30 -> :sswitch_0
        0x38 -> :sswitch_0
        0x3a -> :sswitch_0
        0x3c -> :sswitch_0
        0x3e -> :sswitch_0
        0x43 -> :sswitch_0
        0x46 -> :sswitch_0
        0x47 -> :sswitch_0
        0x48 -> :sswitch_0
        0x49 -> :sswitch_0
        0x4c -> :sswitch_0
        0x4e -> :sswitch_0
        0x50 -> :sswitch_0
    .end sparse-switch
.end method

.method public final VariableDeclarator()V
    .locals 8

    .line 1
    new-instance v0, Lbsh/BSHVariableDeclarator;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, Lbsh/BSHVariableDeclarator;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x49

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    :try_start_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_0
    iget v4, p0, Lbsh/Parser;->jj_ntk:I

    .line 24
    .line 25
    const/4 v5, -0x1

    .line 26
    if-ne v4, v5, :cond_0

    .line 27
    .line 28
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    goto :goto_1

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    move v4, v3

    .line 35
    goto :goto_4

    .line 36
    :cond_0
    :goto_1
    const/16 v6, 0x50

    .line 37
    .line 38
    if-eq v4, v6, :cond_4

    .line 39
    .line 40
    iget-object v4, p0, Lbsh/Parser;->jj_la1:[I

    .line 41
    .line 42
    iget v6, p0, Lbsh/Parser;->jj_gen:I

    .line 43
    .line 44
    const/16 v7, 0x14

    .line 45
    .line 46
    aput v6, v4, v7

    .line 47
    .line 48
    iget v4, p0, Lbsh/Parser;->jj_ntk:I

    .line 49
    .line 50
    if-ne v4, v5, :cond_1

    .line 51
    .line 52
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    :cond_1
    const/16 v5, 0x55

    .line 57
    .line 58
    if-eq v4, v5, :cond_2

    .line 59
    .line 60
    iget-object v4, p0, Lbsh/Parser;->jj_la1:[I

    .line 61
    .line 62
    iget v5, p0, Lbsh/Parser;->jj_gen:I

    .line 63
    .line 64
    const/16 v6, 0x15

    .line 65
    .line 66
    aput v5, v4, v6

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lbsh/Parser;->VariableInitializer()V

    .line 73
    .line 74
    .line 75
    :goto_2
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 76
    .line 77
    invoke-virtual {v4, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    .line 80
    :try_start_1
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 81
    .line 82
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v4, :cond_3

    .line 87
    .line 88
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 89
    .line 90
    .line 91
    goto :goto_3

    .line 92
    :catchall_1
    move-exception v1

    .line 93
    move v4, v2

    .line 94
    goto :goto_4

    .line 95
    :cond_3
    :goto_3
    iget-object v1, v1, Lbsh/Token;->image:Ljava/lang/String;

    .line 96
    .line 97
    iput-object v1, v0, Lbsh/BSHVariableDeclarator;->name:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 98
    .line 99
    return-void

    .line 100
    :cond_4
    :try_start_2
    invoke-direct {p0, v6}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 101
    .line 102
    .line 103
    const/16 v4, 0x51

    .line 104
    .line 105
    invoke-direct {p0, v4}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 106
    .line 107
    .line 108
    iget v4, v0, Lbsh/BSHVariableDeclarator;->dimensions:I

    .line 109
    .line 110
    add-int/2addr v4, v3

    .line 111
    iput v4, v0, Lbsh/BSHVariableDeclarator;->dimensions:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :goto_4
    iget-object v5, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 115
    .line 116
    if-eqz v4, :cond_5

    .line 117
    .line 118
    :try_start_3
    invoke-virtual {v5, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V

    .line 119
    .line 120
    .line 121
    goto :goto_5

    .line 122
    :catchall_2
    move-exception v1

    .line 123
    goto :goto_6

    .line 124
    :cond_5
    invoke-virtual {v5}, Lbsh/JJTParserState;->popNode()Lbsh/Node;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 125
    .line 126
    .line 127
    move v2, v4

    .line 128
    :goto_5
    :try_start_4
    instance-of v4, v1, Lbsh/ParseException;

    .line 129
    .line 130
    if-nez v4, :cond_7

    .line 131
    .line 132
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 133
    .line 134
    if-eqz v4, :cond_6

    .line 135
    .line 136
    check-cast v1, Ljava/lang/RuntimeException;

    .line 137
    .line 138
    throw v1

    .line 139
    :catchall_3
    move-exception v1

    .line 140
    move v4, v2

    .line 141
    goto :goto_6

    .line 142
    :cond_6
    check-cast v1, Ljava/lang/Error;

    .line 143
    .line 144
    throw v1

    .line 145
    :cond_7
    check-cast v1, Lbsh/ParseException;

    .line 146
    .line 147
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 148
    :goto_6
    if-eqz v4, :cond_8

    .line 149
    .line 150
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 151
    .line 152
    invoke-virtual {v2, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 153
    .line 154
    .line 155
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 156
    .line 157
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-eqz v2, :cond_8

    .line 162
    .line 163
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 164
    .line 165
    .line 166
    :cond_8
    throw v1
.end method

.method public final VariableInitializer()V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_2_5(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lbsh/Parser;->ArrayInitializer()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 13
    .line 14
    const/4 v1, -0x1

    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    :cond_1
    const/16 v2, 0x29

    .line 22
    .line 23
    if-eq v0, v2, :cond_2

    .line 24
    .line 25
    const/16 v2, 0x2a

    .line 26
    .line 27
    if-eq v0, v2, :cond_2

    .line 28
    .line 29
    const/16 v2, 0x5a

    .line 30
    .line 31
    if-eq v0, v2, :cond_2

    .line 32
    .line 33
    const/16 v2, 0x5b

    .line 34
    .line 35
    if-eq v0, v2, :cond_2

    .line 36
    .line 37
    sparse-switch v0, :sswitch_data_0

    .line 38
    .line 39
    .line 40
    packed-switch v0, :pswitch_data_0

    .line 41
    .line 42
    .line 43
    packed-switch v0, :pswitch_data_1

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lbsh/Parser;->jj_la1:[I

    .line 47
    .line 48
    const/16 v2, 0x16

    .line 49
    .line 50
    iget v3, p0, Lbsh/Parser;->jj_gen:I

    .line 51
    .line 52
    aput v3, v0, v2

    .line 53
    .line 54
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 55
    .line 56
    .line 57
    invoke-static {}, Lbsh/j;->a()V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    :pswitch_0
    :sswitch_0
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_0
        0xf -> :sswitch_0
        0x12 -> :sswitch_0
        0x17 -> :sswitch_0
        0x1b -> :sswitch_0
        0x1e -> :sswitch_0
        0x25 -> :sswitch_0
        0x27 -> :sswitch_0
        0x30 -> :sswitch_0
        0x38 -> :sswitch_0
        0x3a -> :sswitch_0
        0x3c -> :sswitch_0
        0x3e -> :sswitch_0
        0x43 -> :sswitch_0
        0x4c -> :sswitch_0
        0x4e -> :sswitch_0
        0x50 -> :sswitch_0
    .end sparse-switch

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    :pswitch_data_0
    .packed-switch 0x46
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x66
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final VoidLiteral()V
    .locals 1

    .line 1
    const/16 v0, 0x3a

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final WhenEntry()V
    .locals 8

    .line 1
    new-instance v0, Lbsh/BSHWhenEntry;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHWhenEntry;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v2, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    :try_start_0
    iget v4, p0, Lbsh/Parser;->jj_ntk:I

    .line 19
    .line 20
    const/4 v5, -0x1

    .line 21
    if-ne v4, v5, :cond_0

    .line 22
    .line 23
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    move v4, v3

    .line 30
    goto/16 :goto_4

    .line 31
    .line 32
    :cond_0
    :goto_0
    const/16 v6, 0x17

    .line 33
    .line 34
    const/16 v7, 0x90

    .line 35
    .line 36
    if-eq v4, v6, :cond_2

    .line 37
    .line 38
    if-eq v4, v1, :cond_1

    .line 39
    .line 40
    const/16 v1, 0x29

    .line 41
    .line 42
    if-eq v4, v1, :cond_2

    .line 43
    .line 44
    const/16 v1, 0x2a

    .line 45
    .line 46
    if-eq v4, v1, :cond_2

    .line 47
    .line 48
    const/16 v1, 0x5a

    .line 49
    .line 50
    if-eq v4, v1, :cond_2

    .line 51
    .line 52
    const/16 v1, 0x5b

    .line 53
    .line 54
    if-eq v4, v1, :cond_2

    .line 55
    .line 56
    sparse-switch v4, :sswitch_data_0

    .line 57
    .line 58
    .line 59
    packed-switch v4, :pswitch_data_0

    .line 60
    .line 61
    .line 62
    packed-switch v4, :pswitch_data_1

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 66
    .line 67
    iget v4, p0, Lbsh/Parser;->jj_gen:I

    .line 68
    .line 69
    const/16 v6, 0x49

    .line 70
    .line 71
    aput v4, v1, v6

    .line 72
    .line 73
    invoke-direct {p0, v5}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 74
    .line 75
    .line 76
    new-instance v1, Lbsh/ParseException;

    .line 77
    .line 78
    invoke-direct {v1}, Lbsh/ParseException;-><init>()V

    .line 79
    .line 80
    .line 81
    throw v1

    .line 82
    :cond_1
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 83
    .line 84
    .line 85
    iput-boolean v3, v0, Lbsh/BSHWhenEntry;->isElse:Z

    .line 86
    .line 87
    invoke-direct {p0, v7}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V

    .line 91
    .line 92
    .line 93
    move v2, v3

    .line 94
    goto :goto_3

    .line 95
    :cond_2
    :pswitch_0
    :sswitch_0
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V

    .line 96
    .line 97
    .line 98
    move v1, v3

    .line 99
    :goto_1
    iget v4, p0, Lbsh/Parser;->jj_ntk:I

    .line 100
    .line 101
    if-ne v4, v5, :cond_3

    .line 102
    .line 103
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    :cond_3
    const/16 v6, 0x53

    .line 108
    .line 109
    if-eq v4, v6, :cond_6

    .line 110
    .line 111
    iget-object v4, p0, Lbsh/Parser;->jj_la1:[I

    .line 112
    .line 113
    iget v5, p0, Lbsh/Parser;->jj_gen:I

    .line 114
    .line 115
    const/16 v6, 0x48

    .line 116
    .line 117
    aput v5, v4, v6

    .line 118
    .line 119
    invoke-direct {p0, v7}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V

    .line 123
    .line 124
    .line 125
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 126
    .line 127
    invoke-virtual {v4, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    .line 129
    .line 130
    :try_start_1
    iget-object v4, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 131
    .line 132
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    if-eqz v4, :cond_4

    .line 137
    .line 138
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :catchall_1
    move-exception v1

    .line 143
    move v4, v2

    .line 144
    goto :goto_4

    .line 145
    :cond_4
    :goto_2
    iput v1, v0, Lbsh/BSHWhenEntry;->numConditions:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 146
    .line 147
    :goto_3
    if-eqz v2, :cond_5

    .line 148
    .line 149
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 150
    .line 151
    invoke-virtual {v1, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 152
    .line 153
    .line 154
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 155
    .line 156
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_5

    .line 161
    .line 162
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 163
    .line 164
    .line 165
    :cond_5
    return-void

    .line 166
    :cond_6
    :try_start_2
    invoke-direct {p0, v6}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 170
    .line 171
    .line 172
    add-int/lit8 v1, v1, 0x1

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :goto_4
    iget-object v5, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 176
    .line 177
    if-eqz v4, :cond_7

    .line 178
    .line 179
    :try_start_3
    invoke-virtual {v5, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V

    .line 180
    .line 181
    .line 182
    goto :goto_5

    .line 183
    :catchall_2
    move-exception v1

    .line 184
    goto :goto_6

    .line 185
    :cond_7
    invoke-virtual {v5}, Lbsh/JJTParserState;->popNode()Lbsh/Node;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 186
    .line 187
    .line 188
    move v2, v4

    .line 189
    :goto_5
    :try_start_4
    instance-of v4, v1, Lbsh/ParseException;

    .line 190
    .line 191
    if-nez v4, :cond_9

    .line 192
    .line 193
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 194
    .line 195
    if-eqz v4, :cond_8

    .line 196
    .line 197
    check-cast v1, Ljava/lang/RuntimeException;

    .line 198
    .line 199
    throw v1

    .line 200
    :catchall_3
    move-exception v1

    .line 201
    move v4, v2

    .line 202
    goto :goto_6

    .line 203
    :cond_8
    check-cast v1, Ljava/lang/Error;

    .line 204
    .line 205
    throw v1

    .line 206
    :cond_9
    check-cast v1, Lbsh/ParseException;

    .line 207
    .line 208
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 209
    :goto_6
    if-eqz v4, :cond_a

    .line 210
    .line 211
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 212
    .line 213
    invoke-virtual {v2, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 214
    .line 215
    .line 216
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 217
    .line 218
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-eqz v2, :cond_a

    .line 223
    .line 224
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 225
    .line 226
    .line 227
    :cond_a
    throw v1

    .line 228
    nop

    .line 229
    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_0
        0xf -> :sswitch_0
        0x12 -> :sswitch_0
        0x1b -> :sswitch_0
        0x1e -> :sswitch_0
        0x25 -> :sswitch_0
        0x27 -> :sswitch_0
        0x30 -> :sswitch_0
        0x38 -> :sswitch_0
        0x3a -> :sswitch_0
        0x3c -> :sswitch_0
        0x3e -> :sswitch_0
        0x43 -> :sswitch_0
        0x4c -> :sswitch_0
        0x4e -> :sswitch_0
        0x50 -> :sswitch_0
    .end sparse-switch

    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    :pswitch_data_0
    .packed-switch 0x46
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x66
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final WhenExpression()V
    .locals 5

    .line 1
    new-instance v0, Lbsh/BSHWhenExpression;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHWhenExpression;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v2, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/16 v2, 0x3c

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    :try_start_0
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 20
    .line 21
    .line 22
    const/16 v2, 0x4c

    .line 23
    .line 24
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V

    .line 28
    .line 29
    .line 30
    const/16 v2, 0x4d

    .line 31
    .line 32
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 33
    .line 34
    .line 35
    const/16 v2, 0x4e

    .line 36
    .line 37
    invoke-direct {p0, v2}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 38
    .line 39
    .line 40
    :cond_0
    :pswitch_0
    :sswitch_0
    invoke-virtual {p0}, Lbsh/Parser;->WhenEntry()V

    .line 41
    .line 42
    .line 43
    iget v2, p0, Lbsh/Parser;->jj_ntk:I

    .line 44
    .line 45
    const/4 v4, -0x1

    .line 46
    if-ne v2, v4, :cond_1

    .line 47
    .line 48
    invoke-direct {p0}, Lbsh/Parser;->jj_ntk_f()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v1

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    :goto_0
    if-eq v2, v1, :cond_0

    .line 56
    .line 57
    const/16 v4, 0x18

    .line 58
    .line 59
    if-eq v2, v4, :cond_0

    .line 60
    .line 61
    const/16 v4, 0x29

    .line 62
    .line 63
    if-eq v2, v4, :cond_0

    .line 64
    .line 65
    const/16 v4, 0x2a

    .line 66
    .line 67
    if-eq v2, v4, :cond_0

    .line 68
    .line 69
    const/16 v4, 0x5a

    .line 70
    .line 71
    if-eq v2, v4, :cond_0

    .line 72
    .line 73
    const/16 v4, 0x5b

    .line 74
    .line 75
    if-eq v2, v4, :cond_0

    .line 76
    .line 77
    sparse-switch v2, :sswitch_data_0

    .line 78
    .line 79
    .line 80
    packed-switch v2, :pswitch_data_0

    .line 81
    .line 82
    .line 83
    packed-switch v2, :pswitch_data_1

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, Lbsh/Parser;->jj_la1:[I

    .line 87
    .line 88
    iget v2, p0, Lbsh/Parser;->jj_gen:I

    .line 89
    .line 90
    const/16 v4, 0x47

    .line 91
    .line 92
    aput v2, v1, v4

    .line 93
    .line 94
    const/16 v1, 0x4f

    .line 95
    .line 96
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    .line 98
    .line 99
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 100
    .line 101
    invoke-virtual {v1, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 102
    .line 103
    .line 104
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 105
    .line 106
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_2

    .line 111
    .line 112
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 113
    .line 114
    .line 115
    :cond_2
    return-void

    .line 116
    :goto_1
    :try_start_1
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 117
    .line 118
    invoke-virtual {v2, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 119
    .line 120
    .line 121
    const/4 v2, 0x0

    .line 122
    :try_start_2
    instance-of v4, v1, Lbsh/ParseException;

    .line 123
    .line 124
    if-nez v4, :cond_4

    .line 125
    .line 126
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 127
    .line 128
    if-eqz v4, :cond_3

    .line 129
    .line 130
    check-cast v1, Ljava/lang/RuntimeException;

    .line 131
    .line 132
    throw v1

    .line 133
    :catchall_1
    move-exception v1

    .line 134
    goto :goto_2

    .line 135
    :cond_3
    check-cast v1, Ljava/lang/Error;

    .line 136
    .line 137
    throw v1

    .line 138
    :cond_4
    check-cast v1, Lbsh/ParseException;

    .line 139
    .line 140
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 141
    :catchall_2
    move-exception v1

    .line 142
    move v2, v3

    .line 143
    :goto_2
    if-eqz v2, :cond_5

    .line 144
    .line 145
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 146
    .line 147
    invoke-virtual {v2, v0, v3}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 148
    .line 149
    .line 150
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 151
    .line 152
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    if-eqz v2, :cond_5

    .line 157
    .line 158
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 159
    .line 160
    .line 161
    :cond_5
    throw v1

    .line 162
    nop

    .line 163
    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_0
        0xf -> :sswitch_0
        0x12 -> :sswitch_0
        0x1b -> :sswitch_0
        0x1e -> :sswitch_0
        0x25 -> :sswitch_0
        0x27 -> :sswitch_0
        0x30 -> :sswitch_0
        0x38 -> :sswitch_0
        0x3a -> :sswitch_0
        0x3c -> :sswitch_0
        0x3e -> :sswitch_0
        0x43 -> :sswitch_0
        0x4c -> :sswitch_0
        0x4e -> :sswitch_0
        0x50 -> :sswitch_0
    .end sparse-switch

    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    :pswitch_data_0
    .packed-switch 0x46
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    :pswitch_data_1
    .packed-switch 0x66
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final WhileStatement()V
    .locals 5

    .line 1
    new-instance v0, Lbsh/BSHWhileStatement;

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/BSHWhileStatement;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lbsh/JJTParserState;->openNodeScope(Lbsh/Node;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeOpenNodeScope(Lbsh/Node;)V

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x3d

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    :try_start_0
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 20
    .line 21
    .line 22
    const/16 v1, 0x4c

    .line 23
    .line 24
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lbsh/Parser;->Expression()V

    .line 28
    .line 29
    .line 30
    const/16 v1, 0x4d

    .line 31
    .line 32
    invoke-direct {p0, v1}, Lbsh/Parser;->jj_consume_token(I)Lbsh/Token;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lbsh/Parser;->Statement()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 44
    .line 45
    invoke-virtual {v1}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void

    .line 55
    :catchall_0
    move-exception v1

    .line 56
    :try_start_1
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 57
    .line 58
    invoke-virtual {v3, v0}, Lbsh/JJTParserState;->clearNodeScope(Lbsh/Node;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 59
    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    :try_start_2
    instance-of v4, v1, Lbsh/ParseException;

    .line 63
    .line 64
    if-nez v4, :cond_2

    .line 65
    .line 66
    instance-of v4, v1, Ljava/lang/RuntimeException;

    .line 67
    .line 68
    if-eqz v4, :cond_1

    .line 69
    .line 70
    check-cast v1, Ljava/lang/RuntimeException;

    .line 71
    .line 72
    throw v1

    .line 73
    :catchall_1
    move-exception v1

    .line 74
    goto :goto_0

    .line 75
    :cond_1
    check-cast v1, Ljava/lang/Error;

    .line 76
    .line 77
    throw v1

    .line 78
    :cond_2
    check-cast v1, Lbsh/ParseException;

    .line 79
    .line 80
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 81
    :catchall_2
    move-exception v1

    .line 82
    move v3, v2

    .line 83
    :goto_0
    if-eqz v3, :cond_3

    .line 84
    .line 85
    iget-object v3, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 86
    .line 87
    invoke-virtual {v3, v0, v2}, Lbsh/JJTParserState;->closeNodeScope(Lbsh/Node;Z)V

    .line 88
    .line 89
    .line 90
    iget-object v2, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 91
    .line 92
    invoke-virtual {v2}, Lbsh/JJTParserState;->nodeCreated()Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_3

    .line 97
    .line 98
    invoke-virtual {p0, v0}, Lbsh/Parser;->jjtreeCloseNodeScope(Lbsh/Node;)V

    .line 99
    .line 100
    .line 101
    :cond_3
    throw v1
.end method

.method public createParseException(Ljava/lang/String;Ljava/lang/Exception;)Lbsh/ParseException;
    .locals 6

    .line 1
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 2
    .line 3
    iget v1, v0, Lbsh/Token;->beginLine:I

    .line 4
    .line 5
    iget v2, v0, Lbsh/Token;->beginColumn:I

    .line 6
    .line 7
    iget v0, v0, Lbsh/Token;->kind:I

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lbsh/ParserConstants;->tokenImage:[Ljava/lang/String;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    aget-object v0, v0, v3

    .line 15
    .line 16
    :cond_0
    new-instance v0, Lbsh/ParseException;

    .line 17
    .line 18
    const-string v3, ", column "

    .line 19
    .line 20
    const-string v4, " : "

    .line 21
    .line 22
    const-string v5, "Parse error at line "

    .line 23
    .line 24
    invoke-static {v1, v2, v5, v3, v4}, Leh/a;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-direct {v0, p1, p2}, Lbsh/ParseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public final disable_tracing()V
    .locals 0

    .line 1
    return-void
.end method

.method public final enable_tracing()V
    .locals 0

    .line 1
    return-void
.end method

.method public generateParseException()Lbsh/ParseException;
    .locals 8

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_expentries:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x9b

    .line 7
    .line 8
    new-array v1, v0, [Z

    .line 9
    .line 10
    iget v2, p0, Lbsh/Parser;->jj_kind:I

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    if-ltz v2, :cond_0

    .line 14
    .line 15
    aput-boolean v3, v1, v2

    .line 16
    .line 17
    const/4 v2, -0x1

    .line 18
    iput v2, p0, Lbsh/Parser;->jj_kind:I

    .line 19
    .line 20
    :cond_0
    const/4 v2, 0x0

    .line 21
    move v4, v2

    .line 22
    :goto_0
    const/16 v5, 0x7b

    .line 23
    .line 24
    if-ge v4, v5, :cond_7

    .line 25
    .line 26
    iget-object v5, p0, Lbsh/Parser;->jj_la1:[I

    .line 27
    .line 28
    aget v5, v5, v4

    .line 29
    .line 30
    iget v6, p0, Lbsh/Parser;->jj_gen:I

    .line 31
    .line 32
    if-ne v5, v6, :cond_6

    .line 33
    .line 34
    move v5, v2

    .line 35
    :goto_1
    const/16 v6, 0x20

    .line 36
    .line 37
    if-ge v5, v6, :cond_6

    .line 38
    .line 39
    sget-object v6, Lbsh/Parser;->jj_la1_0:[I

    .line 40
    .line 41
    aget v6, v6, v4

    .line 42
    .line 43
    shl-int v7, v3, v5

    .line 44
    .line 45
    and-int/2addr v6, v7

    .line 46
    if-eqz v6, :cond_1

    .line 47
    .line 48
    aput-boolean v3, v1, v5

    .line 49
    .line 50
    :cond_1
    sget-object v6, Lbsh/Parser;->jj_la1_1:[I

    .line 51
    .line 52
    aget v6, v6, v4

    .line 53
    .line 54
    and-int/2addr v6, v7

    .line 55
    if-eqz v6, :cond_2

    .line 56
    .line 57
    add-int/lit8 v6, v5, 0x20

    .line 58
    .line 59
    aput-boolean v3, v1, v6

    .line 60
    .line 61
    :cond_2
    sget-object v6, Lbsh/Parser;->jj_la1_2:[I

    .line 62
    .line 63
    aget v6, v6, v4

    .line 64
    .line 65
    and-int/2addr v6, v7

    .line 66
    if-eqz v6, :cond_3

    .line 67
    .line 68
    add-int/lit8 v6, v5, 0x40

    .line 69
    .line 70
    aput-boolean v3, v1, v6

    .line 71
    .line 72
    :cond_3
    sget-object v6, Lbsh/Parser;->jj_la1_3:[I

    .line 73
    .line 74
    aget v6, v6, v4

    .line 75
    .line 76
    and-int/2addr v6, v7

    .line 77
    if-eqz v6, :cond_4

    .line 78
    .line 79
    add-int/lit8 v6, v5, 0x60

    .line 80
    .line 81
    aput-boolean v3, v1, v6

    .line 82
    .line 83
    :cond_4
    sget-object v6, Lbsh/Parser;->jj_la1_4:[I

    .line 84
    .line 85
    aget v6, v6, v4

    .line 86
    .line 87
    and-int/2addr v6, v7

    .line 88
    if-eqz v6, :cond_5

    .line 89
    .line 90
    add-int/lit16 v6, v5, 0x80

    .line 91
    .line 92
    aput-boolean v3, v1, v6

    .line 93
    .line 94
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_7
    move v4, v2

    .line 101
    :goto_2
    if-ge v4, v0, :cond_9

    .line 102
    .line 103
    aget-boolean v5, v1, v4

    .line 104
    .line 105
    if-eqz v5, :cond_8

    .line 106
    .line 107
    new-array v5, v3, [I

    .line 108
    .line 109
    iput-object v5, p0, Lbsh/Parser;->jj_expentry:[I

    .line 110
    .line 111
    aput v4, v5, v2

    .line 112
    .line 113
    iget-object v6, p0, Lbsh/Parser;->jj_expentries:Ljava/util/List;

    .line 114
    .line 115
    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_9
    iput v2, p0, Lbsh/Parser;->jj_endpos:I

    .line 122
    .line 123
    invoke-direct {p0}, Lbsh/Parser;->jj_rescan_token()V

    .line 124
    .line 125
    .line 126
    invoke-direct {p0, v2, v2}, Lbsh/Parser;->jj_add_error_token(II)V

    .line 127
    .line 128
    .line 129
    iget-object v0, p0, Lbsh/Parser;->jj_expentries:Ljava/util/List;

    .line 130
    .line 131
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    new-array v0, v0, [[I

    .line 136
    .line 137
    :goto_3
    iget-object v1, p0, Lbsh/Parser;->jj_expentries:Ljava/util/List;

    .line 138
    .line 139
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-ge v2, v1, :cond_a

    .line 144
    .line 145
    iget-object v1, p0, Lbsh/Parser;->jj_expentries:Ljava/util/List;

    .line 146
    .line 147
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    check-cast v1, [I

    .line 152
    .line 153
    aput-object v1, v0, v2

    .line 154
    .line 155
    add-int/lit8 v2, v2, 0x1

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_a
    new-instance v1, Lbsh/ParseException;

    .line 159
    .line 160
    iget-object v2, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 161
    .line 162
    sget-object v3, Lbsh/ParserConstants;->tokenImage:[Ljava/lang/String;

    .line 163
    .line 164
    invoke-direct {v1, v2, v0, v3}, Lbsh/ParseException;-><init>(Lbsh/Token;[[I[Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    return-object v1
.end method

.method public final getNextToken()Lbsh/Token;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 2
    .line 3
    iget-object v1, v0, Lbsh/Token;->next:Lbsh/Token;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iput-object v1, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v1, p0, Lbsh/Parser;->token_source:Lbsh/ParserTokenManager;

    .line 11
    .line 12
    invoke-virtual {v1}, Lbsh/ParserTokenManager;->getNextToken()Lbsh/Token;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, v0, Lbsh/Token;->next:Lbsh/Token;

    .line 17
    .line 18
    iput-object v1, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 19
    .line 20
    :goto_0
    const/4 v0, -0x1

    .line 21
    iput v0, p0, Lbsh/Parser;->jj_ntk:I

    .line 22
    .line 23
    iget v0, p0, Lbsh/Parser;->jj_gen:I

    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    iput v0, p0, Lbsh/Parser;->jj_gen:I

    .line 28
    .line 29
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 30
    .line 31
    return-object v0
.end method

.method public final getToken(I)Lbsh/Token;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lbsh/Parser;->jj_lookingAhead:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lbsh/Parser;->jj_scanpos:Lbsh/Token;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 9
    .line 10
    :goto_0
    const/4 v1, 0x0

    .line 11
    :goto_1
    if-ge v1, p1, :cond_2

    .line 12
    .line 13
    iget-object v2, v0, Lbsh/Token;->next:Lbsh/Token;

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    iget-object v2, p0, Lbsh/Parser;->token_source:Lbsh/ParserTokenManager;

    .line 18
    .line 19
    invoke-virtual {v2}, Lbsh/ParserTokenManager;->getNextToken()Lbsh/Token;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iput-object v2, v0, Lbsh/Token;->next:Lbsh/Token;

    .line 24
    .line 25
    :cond_1
    iget-object v0, v0, Lbsh/Token;->next:Lbsh/Token;

    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    return-object v0
.end method

.method public isFormalParameterDimensions()Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lbsh/Parser;->getToken(I)Lbsh/Token;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget v1, v1, Lbsh/Token;->kind:I

    .line 7
    .line 8
    const/16 v2, 0x50

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    return v3

    .line 14
    :cond_0
    const/4 v1, 0x2

    .line 15
    invoke-virtual {p0, v1}, Lbsh/Parser;->getToken(I)Lbsh/Token;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget v1, v1, Lbsh/Token;->kind:I

    .line 20
    .line 21
    const/16 v2, 0x51

    .line 22
    .line 23
    if-eq v1, v2, :cond_1

    .line 24
    .line 25
    return v3

    .line 26
    :cond_1
    const/4 v1, 0x3

    .line 27
    :goto_0
    add-int/lit8 v2, v1, 0x1

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lbsh/Parser;->getToken(I)Lbsh/Token;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget v1, v1, Lbsh/Token;->kind:I

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    const/16 v4, 0x55

    .line 38
    .line 39
    if-eq v1, v4, :cond_3

    .line 40
    .line 41
    const/16 v4, 0x4d

    .line 42
    .line 43
    if-eq v1, v4, :cond_2

    .line 44
    .line 45
    const/16 v4, 0x4e

    .line 46
    .line 47
    if-eq v1, v4, :cond_3

    .line 48
    .line 49
    const/16 v4, 0x52

    .line 50
    .line 51
    if-eq v1, v4, :cond_3

    .line 52
    .line 53
    const/16 v4, 0x53

    .line 54
    .line 55
    if-eq v1, v4, :cond_2

    .line 56
    .line 57
    move v1, v2

    .line 58
    goto :goto_0

    .line 59
    :cond_2
    return v0

    .line 60
    :cond_3
    return v3
.end method

.method public isImplicitMethodTerminator()Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lbsh/Parser;->getToken(I)Lbsh/Token;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget-object v2, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 7
    .line 8
    iget v2, v2, Lbsh/Token;->endLine:I

    .line 9
    .line 10
    iget v3, v1, Lbsh/Token;->beginLine:I

    .line 11
    .line 12
    if-lt v2, v3, :cond_1

    .line 13
    .line 14
    iget v1, v1, Lbsh/Token;->kind:I

    .line 15
    .line 16
    const/16 v2, 0x4f

    .line 17
    .line 18
    if-eq v1, v2, :cond_1

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :cond_1
    :goto_0
    return v0
.end method

.method public isRegularForStatement()Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lbsh/Parser;->getToken(I)Lbsh/Token;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget v1, v1, Lbsh/Token;->kind:I

    .line 7
    .line 8
    const/16 v2, 0x1f

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    return v3

    .line 14
    :cond_0
    const/4 v1, 0x2

    .line 15
    invoke-virtual {p0, v1}, Lbsh/Parser;->getToken(I)Lbsh/Token;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget v1, v1, Lbsh/Token;->kind:I

    .line 20
    .line 21
    const/16 v2, 0x4c

    .line 22
    .line 23
    if-eq v1, v2, :cond_1

    .line 24
    .line 25
    return v3

    .line 26
    :cond_1
    const/4 v1, 0x3

    .line 27
    :goto_0
    add-int/lit8 v2, v1, 0x1

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lbsh/Parser;->getToken(I)Lbsh/Token;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget v1, v1, Lbsh/Token;->kind:I

    .line 34
    .line 35
    if-eqz v1, :cond_4

    .line 36
    .line 37
    const/16 v4, 0x52

    .line 38
    .line 39
    if-eq v1, v4, :cond_3

    .line 40
    .line 41
    const/16 v4, 0x96

    .line 42
    .line 43
    if-eq v1, v4, :cond_2

    .line 44
    .line 45
    move v1, v2

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    return v3

    .line 48
    :cond_3
    return v0

    .line 49
    :cond_4
    return v3
.end method

.method public isSameLineReturnExpression()Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lbsh/Parser;->getToken(I)Lbsh/Token;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget-object v2, p0, Lbsh/Parser;->token:Lbsh/Token;

    .line 7
    .line 8
    iget v2, v2, Lbsh/Token;->endLine:I

    .line 9
    .line 10
    iget v3, v1, Lbsh/Token;->beginLine:I

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    if-ge v2, v3, :cond_0

    .line 14
    .line 15
    return v4

    .line 16
    :cond_0
    iget v1, v1, Lbsh/Token;->kind:I

    .line 17
    .line 18
    const/16 v2, 0x29

    .line 19
    .line 20
    if-eq v1, v2, :cond_1

    .line 21
    .line 22
    const/16 v2, 0x2a

    .line 23
    .line 24
    if-eq v1, v2, :cond_1

    .line 25
    .line 26
    const/16 v2, 0x5a

    .line 27
    .line 28
    if-eq v1, v2, :cond_1

    .line 29
    .line 30
    const/16 v2, 0x5b

    .line 31
    .line 32
    if-eq v1, v2, :cond_1

    .line 33
    .line 34
    sparse-switch v1, :sswitch_data_0

    .line 35
    .line 36
    .line 37
    packed-switch v1, :pswitch_data_0

    .line 38
    .line 39
    .line 40
    packed-switch v1, :pswitch_data_1

    .line 41
    .line 42
    .line 43
    return v4

    .line 44
    :cond_1
    :pswitch_0
    :sswitch_0
    return v0

    .line 45
    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_0
        0xf -> :sswitch_0
        0x12 -> :sswitch_0
        0x17 -> :sswitch_0
        0x1b -> :sswitch_0
        0x1e -> :sswitch_0
        0x25 -> :sswitch_0
        0x27 -> :sswitch_0
        0x30 -> :sswitch_0
        0x38 -> :sswitch_0
        0x3a -> :sswitch_0
        0x3c -> :sswitch_0
        0x3e -> :sswitch_0
        0x43 -> :sswitch_0
        0x4c -> :sswitch_0
        0x4e -> :sswitch_0
        0x50 -> :sswitch_0
    .end sparse-switch

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    :pswitch_data_0
    .packed-switch 0x46
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x66
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public jjtreeCloseNodeScope(Lbsh/Node;)V
    .locals 1

    .line 1
    check-cast p1, Lbsh/SimpleNode;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Lbsh/Parser;->getToken(I)Lbsh/Token;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p1, Lbsh/SimpleNode;->lastToken:Lbsh/Token;

    .line 9
    .line 10
    return-void
.end method

.method public jjtreeOpenNodeScope(Lbsh/Node;)V
    .locals 1

    .line 1
    check-cast p1, Lbsh/SimpleNode;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-virtual {p0, v0}, Lbsh/Parser;->getToken(I)Lbsh/Token;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p1, Lbsh/SimpleNode;->firstToken:Lbsh/Token;

    .line 9
    .line 10
    return-void
.end method

.method public parseIntegral(Ljava/lang/String;)Lbsh/Primitive;
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lbsh/Parser;->getRadix(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Lbsh/Primitive;

    .line 6
    .line 7
    new-instance v2, Ljava/math/BigInteger;

    .line 8
    .line 9
    invoke-direct {p0, v0}, Lbsh/Parser;->getStartIdx(I)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {v2, p1, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v2}, Lbsh/Primitive;-><init>(Ljava/math/BigInteger;)V

    .line 21
    .line 22
    .line 23
    return-object v1
.end method

.method public popNode()Lbsh/SimpleNode;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 2
    .line 3
    invoke-virtual {v0}, Lbsh/JJTParserState;->nodeArity()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 10
    .line 11
    invoke-virtual {v0}, Lbsh/JJTParserState;->popNode()Lbsh/Node;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lbsh/SimpleNode;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return-object v0
.end method

.method public reInitInput(Ljava/io/Reader;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lbsh/Parser;->ReInit(Ljava/io/Reader;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public reInitTokenInput(Ljava/io/Reader;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/Parser;->jj_input_stream:Lbsh/JavaCharStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Lbsh/AbstractCharStream;->getEndLine()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, p0, Lbsh/Parser;->jj_input_stream:Lbsh/JavaCharStream;

    .line 8
    .line 9
    invoke-virtual {v2}, Lbsh/AbstractCharStream;->getEndColumn()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {v0, p1, v1, v2}, Lbsh/JavaCharStream;->reInit(Ljava/io/Reader;II)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setRetainComments(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lbsh/Parser;->retainComments:Z

    .line 2
    .line 3
    return-void
.end method

.method public final trace_enabled()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method
